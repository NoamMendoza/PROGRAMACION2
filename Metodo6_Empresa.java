package Metodos;


import java.util.Scanner;

public class Metodo6_Empresa {

	static void Dias(){
		Scanner sc = new Scanner(System.in);
		int dias;
		System.out.println("Ingrese la cantidad de dias:");
		dias=sc.nextInt();
		
		Monto(dias);
		
	}
	
	static void Monto(int dias){
		int monto=0;
		if(dias>0&&dias<=100){
			monto=14500;
		}else if(dias>100&&dias<=150){
			monto=17000;
		}else if(dias>150&&dias<=200){
			monto=17000+((dias-150)*1000);
		}else if(dias>200){
			monto=20000+((dias-200)*400);
		}
		Iva(dias, monto);
	}
	static void Iva(int dias, double monto){
		double iva=0;
		iva=monto*0.18;
		
		Total(dias, monto, iva);
	}
	static void Total(int dias, double monto, double iva){
		double total=0;
		total=monto+iva;
		
		Imprimir(dias, monto, iva, total);
	}
	static void Imprimir(int dias, double monto, double iva, double total){
		System.out.println("Dias: "+dias+"\nMonto: "+monto+"\nIVA: "+iva+"\nTotal: "+total);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		Dias();
		
		
		
		
		
	}

}
