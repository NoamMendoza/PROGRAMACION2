package Competencia3;

import java.util.Scanner;

public class Auto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String placa;
		String marca;
		String modelo;
		int mes;
		
		
		CAuto a1 = new CAuto();
		
		System.out.print("Ingrese la placa: ");
		placa=sc.next();
		a1.setPlaca(placa);
		
		System.out.print("Ingrese la marca: ");
		marca=sc.next();
		a1.setMarca(marca);
		
		System.out.print("Ingrese el modelo: ");
		modelo=sc.next();
		a1.setModelo(modelo);
		
		sc.nextLine();
		System.out.print("Ingrese el mes: ");
		mes=sc.nextInt();
		a1.setMes(mes);
		
		System.out.println("Placa: "+a1.getPlaca());
		System.out.println("Marca: "+a1.getMarca());
		System.out.println("Modelo: "+a1.getModelo());
		System.out.println("Mes: "+a1.getMes());
		System.out.println("Pago: "+a1.getPago(mes));
	}

}
