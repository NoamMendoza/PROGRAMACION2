package Competencia2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class edad {

	public static void main(String[] args) throws IOException {
		BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
		String entrada;
		int año, edad;
		
		System.out.println("Ingrese su año de nacimiento: ");
		entrada=bufer.readLine();
		año=Integer.parseInt(entrada);
		
		
		edad=2022-año;
		
		System.out.println(edad);
		
		
	}

}
