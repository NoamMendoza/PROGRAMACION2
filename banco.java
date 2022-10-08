package Competencia1;

import java.util.Scanner;

public class banco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double saldo_a,monto_c,pago_a,saldo_actual,pago_min,sin_interes,no_min;
		System.out.println("Ingrese el saldo anterior del cliente: ");
		saldo_a=sc.nextDouble();
		System.out.println("Ingrese el monto de las compras que realizó: ");
		monto_c=sc.nextDouble();
		System.out.println("Ingrese el pago que depositó en la corte anterior: ");
		pago_a=sc.nextDouble();
		
		saldo_actual=saldo_a-monto_c+pago_a;
		
		pago_min=saldo_actual*0.15;
		
		sin_interes=saldo_actual*0.85;
		
		no_min=sin_interes*0.12;
		
		sin_interes=sin_interes+no_min+200;
		
		System.out.println("Saldo actual: "+saldo_actual+"\nPago minimo: "+pago_min+"\nPago para no generar intereses: "+sin_interes);
		
	}

}
