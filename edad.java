package Competencia2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class edad {

	public static void main(String[] args) throws IOException {
		BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
		String entrada;
		int a�o, edad;
		
		System.out.println("Ingrese su a�o de nacimiento: ");
		entrada=bufer.readLine();
		a�o=Integer.parseInt(entrada);
		
		
		edad=2022-a�o;
		
		System.out.println(edad);
		
		
	}

}
