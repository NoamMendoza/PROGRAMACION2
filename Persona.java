package Competencia3;

import java.util.Scanner;

public class Persona {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre,genero;
		int edad;
		
		CPersona p1 = new CPersona();
		
		System.out.println("Ingrese su nombre: ");
		nombre=sc.next();
		p1.setNombre(nombre);
		
		sc.nextLine();
		System.out.println("Igrese su edad: ");
		edad=sc.nextInt();
		p1.setEdad(edad);
		
		System.out.println("Ingrese su genero: ");
		genero=sc.next();
		p1.setGenero(genero);
		
		
		
		System.out.println("Su nombre es: "+p1.getNombre());
		
		System.out.println("Su edad es: "+p1.getEdad());
		
		System.out.println("Su genero es: "+p1.getGenero());
		
	}

}
