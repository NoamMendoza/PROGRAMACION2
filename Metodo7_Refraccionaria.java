package Metodos;

import java.util.Scanner;

public class Metodo7_Refraccionaria {

	static void Monto(){
		Scanner sc = new Scanner(System.in);
		int monto=0;
		System.out.println("Ingrese el monto total:");
		monto=sc.nextInt();
		
		Invercion(monto);
	}
	
	static void Invercion(int monto){
		double inversion=0,prestamo=0,credito=0;
		if(monto>=50000){
			inversion=monto*0.55;
			prestamo=monto*0.3;
			credito=monto*0.15;
		}else{
			inversion=monto*0.7;
			credito=monto*0.3;
		}
		Interes(inversion, prestamo, credito);
	}
	
	static void Interes(double inversion, double prestamo, double credito){
		double interes=0;
		interes=credito*0.2;
		Total(inversion, prestamo, credito, interes);
	}
	
	static void Total(double inversion, double prestamo, double credito, double interes){
		System.out.println("Monto a invertir por la empresa: "+inversion+"$");
		System.out.println("Monto prestado por el banco: "+prestamo+"$");
		System.out.println("Monto solicitado al fabricante: "+credito+"$");
		System.out.println("Monto de interes: "+interes+"$");
	}
	
	public static void main(String[] args) {
		Monto();

	}

}
