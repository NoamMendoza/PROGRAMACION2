package Competencia2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cadena {

	public static void main(String[] args) throws IOException {
		BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
		String cadena;
		int cont=0,i;
		
		System.out.println("Ingresa la cadena a evaluar:");
		cadena=bufer.readLine();
		
		for(i=0;i<cadena.length();i++){
			if(cadena.charAt(i)==' '){
				cont++;
			}
		}
		System.out.println("La frase tiene "+(cont+1)+" letras");

	}

}
