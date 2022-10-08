package Competencia3;

import java.util.Scanner;

public class Barcos {

	public static void main(String[] args) {
		double longitud;
		int capacidad,horas,personas,x;
		String modelo;
		
		CBarco cliente = new CBarco();
		CYate cliente1 = new CYate();
		CVelero cliente2 = new CVelero();
		CLancha cliente3 = new CLancha();
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("BIENVENIDO AL CENTRO DE EMBARCACIONES EL VELERO");
		System.out.println("Favor de seleccionar una opcion del menu");
		System.out.println("1- Barco\n2- Yate\n3- Velero\n4- Lancha\n5- Salir");
		x=sc.nextInt();
		
		switch(x){
		case 1:
			System.out.println("Ingrese la longitud: ");
			longitud=sc.nextDouble();
			cliente.setLongitud(longitud);
			
			System.out.println("Ingrese las horas de renta: ");
			horas=sc.nextInt();
			cliente.setHoras(horas);
			
			System.out.println("Ingrese las personas que abordaran: ");
			personas=sc.nextInt();
			cliente.setPersonas(personas);
			
			sc.nextLine();
			
			System.out.println("Ingrese el modelo: ");
			modelo=sc.nextLine();
			cliente.setModelo(modelo);
			
			System.out.println("La embarcacion mide: "+cliente.getLongitud()+" metros");
			System.out.println("La capacidad maxima del barco es de 100 personas y abordaran "+cliente.getPersonas());
			System.out.println("Se rentara "+cliente.getHoras()+" horas");
			System.out.println("El modelo del barco es: "+cliente.getModelo());
			System.out.println("El total a pagar es de: $"+cliente.Renta(horas));
			break;
		case 2:
			System.out.println("Ingrese la longitud: ");
			longitud=sc.nextDouble();
			cliente1.setLongitud(longitud);
			
			System.out.println("Ingrese las horas de renta: ");
			horas=sc.nextInt();
			cliente1.setHoras(horas);
			
			System.out.println("Ingrese las personas que abordaran: ");
			personas=sc.nextInt();
			cliente1.setPersonas(personas);
			
			sc.nextLine();
			
			System.out.println("Ingrese el modelo: ");
			modelo=sc.nextLine();
			cliente1.setModelo(modelo);
			
			System.out.println("La embarcacion mide: "+cliente1.getLongitud()+" metros");
			System.out.println("La capacidad maxima del barco es de 15 personas y abordaran "+cliente1.getPersonas());
			System.out.println("Se rentara "+cliente1.getHoras()+" horas");
			System.out.println("El modelo del barco es: "+cliente1.getModelo());
			System.out.println("El total a pagar es de: $"+cliente1.Renta1(horas));
			break;
		case 3:
			System.out.println("Ingrese la longitud: ");
			longitud=sc.nextDouble();
			cliente2.setLongitud(longitud);
			
			System.out.println("Ingrese las horas de renta: ");
			horas=sc.nextInt();
			cliente2.setHoras(horas);
			
			System.out.println("Ingrese las personas que abordaran: ");
			personas=sc.nextInt();
			cliente2.setPersonas(personas);
			
			sc.nextLine();
			
			System.out.println("Ingrese el modelo: ");
			modelo=sc.nextLine();
			cliente2.setModelo(modelo);
			
			System.out.println("La embarcacion mide: "+cliente2.getLongitud()+" metros");
			System.out.println("La capacidad maxima del barco es de 10 personas y abordaran "+cliente2.getPersonas());
			System.out.println("Se rentara "+cliente2.getHoras()+" horas");
			System.out.println("El modelo del barco es: "+cliente2.getModelo());
			System.out.println("El total a pagar es de: $"+cliente2.Renta2(horas));
			break;
		case 4:
			System.out.println("Ingrese la longitud: ");
			longitud=sc.nextDouble();
			cliente3.setLongitud(longitud);
			
			System.out.println("Ingrese las horas de renta: ");
			horas=sc.nextInt();
			cliente3.setHoras(horas);
			
			System.out.println("Ingrese las personas que abordaran: ");
			personas=sc.nextInt();
			cliente3.setPersonas(personas);
			
			sc.nextLine();
			
			System.out.println("Ingrese el modelo: ");
			modelo=sc.nextLine();
			cliente3.setModelo(modelo);
			
			System.out.println("La embarcacion mide: "+cliente3.getLongitud()+" metros");
			System.out.println("La capacidad maxima del barco es de 7 personas y abordaran "+cliente3.getPersonas());
			System.out.println("Se rentara "+cliente3.getHoras()+" horas");
			System.out.println("El modelo del barco es: "+cliente3.getModelo());
			System.out.println("El total a pagar es de: $"+cliente3.Renta3(horas));
			break;
		case 5:
			System.out.println("Saliendo...");
			System.exit(0);
			break;
		default:
			System.out.println("No es una opcion valida");
		}
		
		
	}

}
