package Competencia1;

import java.util.Scanner;

public class profesor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salario=15000;
		
		for(int i=0;i<6;i++){
			System.out.println("El salario en el año "+(i+1)+" es de: "+salario+"$");
			salario=salario+(salario*0.1);
		}
		salario=24157.65;
		System.out.println("El salario en el sexto año es de: "+salario+"$");
		
		
		

	}

}
