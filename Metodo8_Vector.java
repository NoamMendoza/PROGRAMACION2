package Metodos;

import java.util.Scanner;

public class Metodo8_Vector {
	
	static int Guardar(){
		Scanner sc = new Scanner(System.in);
		int vector=0;
		vector=sc.nextInt();
		
		return vector;
	}
	
	static void Suma(int vector[]){
		int suma=0;
		for (int i = 0; i < vector.length; i++) {
			suma=suma+vector[i];
		}
		System.out.println(suma);
	}
	static void Alto(int vector[]){
		int alto=0;
		for (int i = 0; i < vector.length; i++) {
			if(alto<vector[i]){
				alto=vector[i];
				
			}
			
		}
		System.out.println(alto);
	}
	static void Muestra(int vector[]){
		for (int i = 0; i < vector.length; i++) {
			System.out.print("["+vector[i]+"]");
		}
	}
	
	public static void main(String[] args) {
		int vector[]=new int [5];
		
		System.out.println("Ingrese los valores que desee: ");
		for (int i = 0; i < vector.length; i++) {
			vector[i]=Guardar();
		}
		
		System.out.println("La suma de los elementos del vector es de:");
		Suma(vector);
		System.out.println("El valor mas alto en el vector es:");
		Alto(vector);
		System.out.println("El vector es:");
		Muestra(vector);
		
		
	}
		
		
		


}
