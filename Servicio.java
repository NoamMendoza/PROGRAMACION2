package Competencia3;

import java.util.Scanner;

public class Servicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String placas, modelo;
		int horas, minutos,serv,noches;
		
		CEstacionamiento cliente = new CEstacionamiento();
		CPension cliente1 =new CPension();
		
		System.out.println("-----BIENVENIDO A PENSION Y ESTACIONAMIENTO SANTIAGO-----");
		System.out.println("¿QUE SERVICIO DESEA EL DIA DE HOY?");
		System.out.println("1.Estacionamiento\n2.Pension");
		serv=sc.nextInt();
		
		switch(serv){
		case 1:
			System.out.println("Ingrese la placa: ");
			placas=sc.next();
			cliente.setPlacas(placas);
			
			sc.nextLine();
			
			System.out.println("Ingrese el modelo: ");
			modelo=sc.next();
			cliente.setModelo(modelo);
			
			sc.nextLine();
			
			System.out.println("Ingrese las horas: ");
			horas=sc.nextInt();
			cliente.setHoras(horas);
			
			sc.nextLine();
			
			System.out.println("Ingfrese los minutos: ");
			minutos=sc.nextInt();
			cliente.setMinutos(minutos);
			
			System.out.println("Su placa: "+cliente.getPlacas());
			System.out.println("Su modelo: "+cliente.getModelo());
			System.out.println("Las horas que se quedara: "+cliente.getHoras()+" horas");
			System.out.println("Los minutos que se quedara: "+cliente.getMinutos()+" minutos");
			System.out.println("Su total a pagar por el servicio es: $"+cliente.Total(horas, minutos));
			break;
		
		case 2:
			System.out.println("Ingrese la placa: ");
			placas=sc.next();
			cliente1.setPlacas(placas);
			
			sc.nextLine();
			
			System.out.println("Ingrese el modelo: ");
			modelo=sc.next();
			cliente1.setModelo(modelo);
			
			sc.nextLine();
			
			System.out.println("Ingrese las noches: ");
			noches=sc.nextInt();
			cliente1.setNoches(noches);
			
			System.out.println("Su placa: "+cliente1.getPlacas());
			System.out.println("Su modelo: "+cliente1.getModelo());
			System.out.println("Las noches que se quedara: "+cliente1.getNoches());
			System.out.println("La cantidad a pagar es de: $"+cliente1.Total2(noches));
			break;
		
		default:
			System.out.println("No es una opcion valida");
		}
	}

}
