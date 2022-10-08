package Competencia2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//escriba un programa que calcule la frecuencia de aparicion de las vocales de un texto proporcionado por 
 // el usuario. esta solucion se deve presentar en forma de histograma, por ejemplo*/
public class vocales {

	public static void main(String[] args) throws IOException {
		BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
		String entrada;
		int a=0,e=0,i=0,o=0,u=0;
		String aa="",ee="",ii="",oo="",uu="";
		System.out.println("Escriba algo: ");
		entrada=bufer.readLine();
		entrada=entrada.toLowerCase();
		
		for(int x=0;x<entrada.length();x++){
			if(entrada.charAt(x)=='a'){
				a++;
				aa=aa+"*";
			}
			else if(entrada.charAt(x)=='e'){
				e++;
				ee=ee+"*";
			}
			else if(entrada.charAt(x)=='i'){
				i++;
				ii=ii+"*";
			}
			else if(entrada.charAt(x)=='o'){
				o++;
				oo=oo+"*";
			}
			else if(entrada.charAt(x)=='u'){
				u++;
				uu=uu+"*";
			}
		}
		System.out.println("a\t"+a+"\t"+aa);
		System.out.println("e\t"+e+"\t"+ee);
		System.out.println("i\t"+i+"\t"+ii);
		System.out.println("o\t"+o+"\t"+oo);
		System.out.println("u\t"+u+"\t"+uu);
		
		
		
		
	}

}
