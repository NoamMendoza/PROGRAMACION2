package Competencia1;

import java.util.Scanner;

public class sueldo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int horas;
		double pago,total;
		
		System.out.println("¿Cuantas horas trabajó a la semana?:");
		horas=sc.nextInt();
		System.out.println("¿Cual es el pago por hora?:");
		pago=sc.nextDouble();
		
		if(horas<=40){
			total=horas*pago;
			System.out.println("Su pago es de: "+total+"$");
		}else if(horas>40&&horas<=45){
			total=40*pago+((horas-40)*(pago*2));
			System.out.println("Su pago es de: "+total+"$");
		}else if(horas>45&&horas<=50){
			total=(40*pago)+(5*(pago*2))+((horas-45)*(pago*3));
			
			System.out.println("Su pago es de: "+total+"$");
		}else if(horas>50){
			System.out.println("Trabajar mas de 50 horas a la semana esta percibido por esta empresa como explotacion laboral, si este es su caso reporte inmediatamente ante recursos humanos");
		}

	}

}
