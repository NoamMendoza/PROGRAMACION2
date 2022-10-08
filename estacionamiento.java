package Competencia1;

import java.util.Scanner;

public class estacionamiento {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int horas=1, total=0;
		String opcion;
		
		System.out.println("Estacionamiento EstaTec");
		do{
			System.out.println("Ha pasado "+horas+" horas en el estacionamiento.¿Desea continuar estacionado?(Si/No)");
			opcion=sc.next();
			if(opcion.equalsIgnoreCase("Si")){
				horas++;
			}
			
			
			
		}while(opcion.equalsIgnoreCase("Si"));
		
		if(horas<=2){
				total=horas*15;
			}else if(horas<=5&&horas>2){
				total=30+((horas-2)*10);
			}else if(horas<=10&&horas>5){
				total=60+((horas-5)*8);
			}else if(horas>10){
				total=100+((horas-10)*5);
			}
		System.out.println("El total a pagar es de: "+total+"$");
	}

}
