package Competencia4;

public class EmpleadoSinHorasExtra extends Empleado{
public double CalcularSalario(){
	double salario=0;
	
	salario=HorasTrabajadas*SueldoPorHora;
	
	return salario;
}
}
