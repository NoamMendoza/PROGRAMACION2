package Metodos;

import java.util.Scanner;

public class Metodo2_Factorial {
	static int Factorial(int n){
		int factorial;
		if(n==0){
			factorial=1;
		}
		else{
			factorial=1;
			for(int i=1;i<=n;i++){
				factorial=factorial*i;
			}
		}
		return factorial;
	}
	
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa numero:");
		n=sc.nextInt();
		
		System.out.println("El factorial es: "+Factorial(n));
		
	}

}
