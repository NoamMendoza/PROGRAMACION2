package Competencia4;

public class EmpleadoConHorasDobles extends Empleado{
	
	public double CalcularSalario(){
		double salario=0;
		
		salario=((SueldoPorHora*40)+((HorasTrabajadas-40)*(SueldoPorHora*2)));
		
		return salario;
	}
}
