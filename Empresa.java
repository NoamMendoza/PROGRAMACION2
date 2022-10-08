package Competencia4;

import java.util.Scanner;

public class Empresa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int HorasTrabajadas;
		double SueldoPorHora;
		
		Empleado emp1 = new EmpleadoSinHorasExtra();
		Empleado emp2 = new EmpleadoConHorasDobles();
		Empleado emp3 = new EmpleadoConHorasTriples();
		
		System.out.println("CALDULADORA DE SALARIOS DE LA EMPREZA SISTEC");
		System.out.println("Ingrese las horas trabajadas a la semana:");
		HorasTrabajadas=sc.nextInt();
		System.out.println("Ingrese el sueldo por hora:");
		SueldoPorHora=sc.nextDouble();
		
		if(HorasTrabajadas>0&&HorasTrabajadas<=40){
			emp1.setHorasTrabajadas(HorasTrabajadas);
			emp1.setSueldoPorHora(SueldoPorHora);
			System.out.println("El salario por semana es de: $"+emp1.CalcularSalario());
		}else if(HorasTrabajadas>40&&HorasTrabajadas<=45){
			emp2.setHorasTrabajadas(HorasTrabajadas);
			emp2.setSueldoPorHora(SueldoPorHora);
			System.out.println("El salario por semana es de: $"+emp2.CalcularSalario());
		}else if(HorasTrabajadas>45){
			emp3.setHorasTrabajadas(HorasTrabajadas);
			emp3.setSueldoPorHora(SueldoPorHora);
			System.out.println("El salario por semana es de: $"+emp3.CalcularSalario());
		}
		
		
		
		
	}

}
