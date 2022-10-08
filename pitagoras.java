package Competencia2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*el teorema de pitagoras establece que en todo triangulo rectangulo, el cuadrado de la hipotenusa es igual a la 
 * suma del cuadrados de los catetos. Sea un triangulo rectangulo de catetos a y b y la hipotenusa , demostrar que
 *  el area del cuadrado del lado c es igual a la suma de las areas de los cuadrados del lado a y del b */

public class pitagoras {

	public static void main(String[] args) throws IOException {
		BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
		String entrada,entradab,entradac,intentos;
		int x,contador=0;
		double a,b,c,c2;
		
		do{
		System.out.println("¿Cuantas veces quiere hacer la comprobacion?");
		intentos=bufer.readLine();
		x=Integer.parseInt(intentos);
		if(x<1||x>100){
			System.out.println("No esta dentro de el rango");
		}
		}while(x<1||x>100);
		
		do{
		
		System.out.println("Ingrese el cateto a:");
		entrada=bufer.readLine();
		a=Double.parseDouble(entrada);
		
		System.out.println("Ingrese el cateto b:");
		entradab=bufer.readLine();
		b=Double.parseDouble(entradab);
		
		System.out.println("Ingrese el cateto c:");
		entradac=bufer.readLine();
		c=Double.parseDouble(entradac);
		
		if(a>=1&&a<=100&&b>=1&&a<=100&&c>=1&&c<=100){
		c=c*c;
		
		c2=Math.pow(a, 2)+Math.pow(b,2);
		
		if(c==c2){
		System.out.println("Es un triangulo rectangulo");
		}
		else{
			System.out.println("jajajajaja no es un triangulo rectangulo");
		}
		}else{
			System.out.println("Ingreso lo valores equivocados");
		}
		contador++;
		}while(contador!=x);
		
	}

}
