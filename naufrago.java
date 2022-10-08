package Competencia1;

import java.util.Scanner;

public class naufrago {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,sencillas,dobles,triples,temporal;
		double cargo,resultado;
		String pago;
		
		System.out.println("Menu de hamburgesas. Seleccione una opcion\n1.Sensillas: 20$\n2.Dobles: 25$\n3.Triples: 28$");
		a=sc.nextInt();
		
		switch(a){
		case 1:
			System.out.println("Numero de hamburguesas: ");
			sencillas=sc.nextInt();
			System.out.println("Tarjeta o Efectivo");
			pago=sc.next();
			
			if(pago.equalsIgnoreCase("Tarjeta")){
				temporal=sencillas*20;
				cargo=0.05*temporal;
				resultado=temporal+cargo;
				System.out.println("El total a pagar es de: "+resultado+"$");
			}else if(pago.equalsIgnoreCase("Efectivo")){
				temporal=sencillas*20;
				System.out.println("El total a pagar es de: "+temporal+"$");
			}
			break;
		case 2:
			System.out.println("Numero de hamburguesas: ");
			dobles=sc.nextInt();
			System.out.println("Tarjeta o Efectivo");
			pago=sc.next();
			
			if(pago.equalsIgnoreCase("Tarjeta")){
				temporal=dobles*25;
				cargo=0.05*temporal;
				resultado=temporal+cargo;
				System.out.println("El total a pagar es de: "+resultado+"$");
			}else if(pago.equalsIgnoreCase("Efectivo")){
				temporal=dobles*25;
				System.out.println("El total a pagar es de: "+temporal+"$");
			}
			break;
		case 3:
			System.out.println("Numero de hamburguesas: ");
			triples=sc.nextInt();
			System.out.println("Tarjeta o Efectivo");
			pago=sc.next();
			
			if(pago.equalsIgnoreCase("Tarjeta")){
				temporal=triples*28;
				cargo=0.05*temporal;
				resultado=temporal+cargo;
				System.out.println("El total a pagar es de: "+resultado+"$");
			}else if(pago.equalsIgnoreCase("Efectivo")){
				temporal=triples*28;
				System.out.println("El total a pagar es de: "+temporal+"$");
			}
			break;
		default: System.out.println("Seleccione una opcion correcta");
		}

	}

}
