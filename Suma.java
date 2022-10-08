package Competencia1;
import java.util.Scanner;
public class Suma {

	public static void main(String[] args) {
		int a,b,suma=0;
		Scanner sc = new Scanner(System.in);
		
		do{
		System.out.println("Ingrese dos valores(A y B)(B tiene que ser mayor o igual a A: ");
		System.out.print("A: ");
		a=sc.nextInt();
		System.out.print("B: ");
		b=sc.nextInt();
		
		if(a>b){
			System.out.println("B es mayor que A, Ingrese otros datos:");
		}
		}while(a>b);
		
		if(a==b){
			suma=a+b;
		}else{
		for(int i=0;a<=b;i++){
			suma=suma+a;
			a++;
			
		}
		}
		System.out.println("El resultado es: "+suma);
		
	}

}
