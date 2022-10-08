package Metodos;

import java.util.Scanner;

public class Metodo4_Claire {

	static double Precio(int medio){
		int precio=0;
		if(medio==1){
			precio=30000;
		}else if(medio==2){
			precio=15000;
		}else if(medio==3){
			precio=25000;
		}
		return precio;
	}
	static double MontoBruto(int cantidad, double precio){
		double montobruto=0;
		montobruto=cantidad*precio;
		return montobruto;
	}
	static double Descuento(double contratos, double monto){
		double descuento=0;
		if(contratos>0&&contratos<=5){
			descuento=monto*0.1;
		}else if(contratos>5&&contratos<=10){
			descuento=monto*0.25;
		}else if(contratos>10){
			descuento=monto*0.3;
		}
		return descuento;
	}
	static double MontoNeto(double monto, double descuento){
		double neto=0;
		neto=monto-descuento;
		return neto;
	}
	static void Imprimir(double precio, double monto, double descuento, double neto){
		String imprimir="Precio: "+precio+"\nMonto: "+monto+"\nDescuento: "+descuento+"\nMonto Neto: "+neto;
		System.out.println(imprimir);
		
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int medio,cantidad;
		double precio, contratos, monto, descuento,neto;
		System.out.println("Elija un medio de publicidad: \n1. Comerciales de televisión\n"
				+ "2. Anuncios de revistas\n3. Anuncios en suplementos dominicales");
		medio=sc.nextInt();
		precio=Precio(medio);
		
		System.out.println("Ingrese la cantidad de contratos: ");
		cantidad=sc.nextInt();
		contratos=cantidad;
		monto=MontoBruto(cantidad, precio);
		
		descuento=Descuento(contratos, monto);
		
		neto=MontoNeto(monto, descuento);
		
		Imprimir(precio, monto, descuento, neto);
		
}

}
