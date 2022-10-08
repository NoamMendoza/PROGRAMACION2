package Metodos;

import java.util.Scanner;

public class Metodo3_Litros {
 static double Litros(int l){
	 double x=10;
	 if(l<=50){
		 x=10;
	 }else if(l>=51&&l<=200){
		 x=10+(l-50)*0.5;
	 }else if(l>200){
		 x=85+(l-200)*1.5;
	 }
	 return x;
 }
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l;
		System.out.println("Ingrese los litros mensuales: ");
		l=sc.nextInt();
		
		System.out.println("La cantidad a pagar por "+l+" litros es de "+Litros(l));
	}

}
