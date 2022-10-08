package Competencia3;

import java.util.Scanner;

public class Licencia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nombre, fecha, direccion, telefono, licencia, placas;
		int año;
		
		CDatos persona = new CDatos();
		CTaxista taxista = new CTaxista();
		
		System.out.println("Ingrese su nombre: ");
		nombre=sc.nextLine();
		persona.setNombre(nombre);
		
		System.out.println("Ingrese su fecha de nacimiento: (dd-MM-yyyy)");
		fecha=sc.nextLine();
		persona.setFecha(fecha);
		
		System.out.println("Ingrese su direccion: ");
		direccion=sc.nextLine();
		persona.setDireccion(direccion);
		
		System.out.println("Ingrese su telefono: ");
		telefono=sc.nextLine();
		persona.setTelefono(telefono);
		
		System.out.println("Ingrese su No. de licencia: ");
		licencia=sc.nextLine();
		taxista.setLicencia(licencia);
		
		System.out.println("Ingrese su No. de placas: ");
		placas=sc.nextLine();
		taxista.setPlacas(placas);
		
		persona.calcularEdad(fecha);
		año=persona.calcularEdad(fecha);
		taxista.setAño(año);
		
		System.out.println("");
		System.out.println("Nombre: "+persona.getNombre());
		System.out.println("Fecha de nacimiento: "+persona.getFecha());
		System.out.println("Telefono: "+persona.getTelefono());
		System.out.println("No. de licencia: "+taxista.getLicencia());
		System.out.println("No. de placas: "+taxista.getPlacas());
		System.out.println("Su edad es de: "+persona.calcularEdad(fecha)+" años");
		taxista.Licencia(año);
	}

}
