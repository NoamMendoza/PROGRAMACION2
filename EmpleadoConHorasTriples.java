package Competencia4;

public class EmpleadoConHorasTriples extends Empleado{
	public double CalcularSalario(){
		double salario=0;
		
		salario=(SueldoPorHora*40)+((SueldoPorHora*2)*5)+((HorasTrabajadas-45)*(SueldoPorHora*3));
		
		
		return salario;
	}
}
