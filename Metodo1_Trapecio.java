package Metodos;

import java.util.Scanner;

public class Metodo1_Trapecio {
	static double AreaTrapecio(double B, double b, double h){
		double area;
		area = ((B+b)*h)/2;
		return area;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double B,b,h;
		System.out.println("Ingrese la base mayor: ");
		B=sc.nextDouble();
		System.out.println("Ingrese la base menor: ");
		b=sc.nextDouble();
		System.out.println("Ingrese la altura: ");
		h=sc.nextDouble();
		
		System.out.println("Area = "+AreaTrapecio(B,b,h));
		
		
		

	}

}
