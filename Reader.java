package Competencia2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Reader {

	public static void main(String[] args) throws IOException {
		BufferedReader bufer= new BufferedReader(new InputStreamReader(System.in));

		String entrada;
		
		double numero;
		entrada= bufer.readLine();
		
		numero=Integer.parseInt(entrada);
		numero=numero*numero;
		
		System.out.println(numero);
	}

}
