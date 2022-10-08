package Competencia1;

import java.util.Scanner;

public class calificaciones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int alumnos,r=0,a=0;
		double x[];
		
		System.out.println("Numero de alumnos: ");
		alumnos=sc.nextInt();
		
		x= new double[alumnos];
		for(int i=0;i<alumnos;i++){
			System.out.println("Ingrese la calificacion del alumno "+(i+1)+"(En una escala del 0 al 100): ");
			x[i]=sc.nextInt();
			if(x[i]<70){
				r++;
			}else{
				a++;
			}
		}
		System.out.println("Alumnos reporbados: "+r+"\nAlumnos aprobados: "+a);
		
		
	}

}
