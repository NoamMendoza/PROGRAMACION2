package Metodos;

import java.util.Scanner;

public class Metodo5_Vocales {

	static void Vocales(){
		Scanner sc = new Scanner(System.in);
		int vocal=0;
		String entrada;
		
		System.out.println("Escriba algo: ");
		entrada=sc.nextLine();
		char vocaless[]=entrada.toCharArray();
		
		for(int x=0;x<vocaless.length;x++){
			switch(vocaless[x]){
			case 'a': case 'e': case 'i': case 'o': case 'u':
				vocal++;
			break;
			}
		}
		System.out.println("Las cantidad de vocales es: "+vocal);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Vocales();
		

	}

}
