package Competencia4;

import java.util.Scanner;

public class Figuras {

	public static void main(String[] args) {
		int op, op2;
		double lado, base, altura, lado1, lado2, lado3, basem, baseM, area=0,perimetro=0,radio;
		
		CFiguras_Geometricas circulo = new Circulo();
		CFiguras_Geometricas cuadrado = new Cuadrado();
		CFiguras_Geometricas rectangulo = new Rectangulo();
		CFiguras_Geometricas triangulo = new Triangulo();
		CFiguras_Geometricas trapecio = new Trapecio();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("CALCULADORA DE AREAS Y PERIMETROS\n");
		System.out.println("¿Que figura desea analizar?");
		System.out.println("1.Cuadrado\n2.Rectangulo\n3.Triangulo\n4.Circulo\n5.Trapecio");
		op=sc.nextInt();
		
		switch(op){
		case 1:
			System.out.println("1.Area\n2.Perimetro");
			op2=sc.nextInt();
			
			if(op2==1){
				System.out.println("Ingrese un lado: ");
				lado=sc.nextDouble();
				cuadrado.setLado(lado);
				cuadrado.Area();
				
			}else if(op2==2){
				System.out.println("Ingrese un lado: ");
				lado=sc.nextDouble();
				cuadrado.setLado(lado);
				cuadrado.Perimetro();
			}else{
				System.out.println("Elija una opcion correcta");
			}
			break;
			
		case 2:
			System.out.println("1.Area\n2.Perimetro");
			op2=sc.nextInt();
			
			if(op2==1){
				System.out.println("Ingrese la base: ");
				base=sc.nextDouble();
				rectangulo.setBase(base);
				
				System.out.println("Ingrese altura: ");
				altura=sc.nextDouble();
				rectangulo.setAltura(altura);
				
				rectangulo.Area();
				
			}else if(op2==2){
				System.out.println("Ingrese la base: ");
				base=sc.nextDouble();
				rectangulo.setLado(base);
				
				System.out.println("Ingrese la altura");
				altura=sc.nextDouble();
				rectangulo.setAltura(altura);
				rectangulo.Perimetro();
			}else{
				System.out.println("Elija una opcion correcta");
			}
			break;
			
		case 3:
			System.out.println("1.Area\n2.Perimetro");
			op2=sc.nextInt();
			
			if(op2==1){
				System.out.println("Ingrese la base: ");
				base=sc.nextDouble();
				triangulo.setBase(base);
				
				System.out.println("Ingrese la altura: ");
				altura=sc.nextDouble();
				triangulo.setAltura(altura);
				triangulo.Area();
				
			}else if(op2==2){
				System.out.println("Ingrese lado 1: ");
				lado1=sc.nextDouble();
				triangulo.setLado1(lado1);
				
				System.out.println("Ingrese lado 2: ");
				lado2=sc.nextDouble();
				triangulo.setLado2(lado2);
				
				System.out.println("Ingrese lado 3: ");
				lado3=sc.nextDouble();
				triangulo.setLado3(lado3);
				triangulo.Perimetro();
			}else{
				System.out.println("Elija una opcion correcta");
			}
			break;
			
		case 4:
			System.out.println("1.Area\n2.Perimetro");
			op2=sc.nextInt();
			
			if(op2==1){
				System.out.println("Ingrese el radio:  ");
				radio=sc.nextDouble();
				circulo.setRadio(radio);
				circulo.Area();
				
			}else if(op2==2){
				System.out.println("Ingrese el radio:  ");
				radio=sc.nextDouble();
				circulo.setRadio(radio);
				circulo.Perimetro();
			}else{
				System.out.println("Elija una opcion correcta");
			}
			break;
			
		case 5:
			System.out.println("1.Area\n2.Perimetro");
			op2=sc.nextInt();
			
			if(op2==1){
				System.out.println("Ingrese base mayor: ");
				baseM=sc.nextDouble();
				trapecio.setBaseM(baseM);
				System.out.println("Ingrese base menor: ");
				basem=sc.nextDouble();
				trapecio.setBasem(baseM);
				System.out.println("Ingrese la altura: ");
				altura=sc.nextDouble();
				trapecio.setAltura(altura);
				
				trapecio.Area();
				
			}else if(op2==2){
				System.out.println("Ingrese base mayor : ");
				baseM=sc.nextDouble();
				trapecio.setBaseM(baseM);
				System.out.println("Ingrese base menor: ");
				basem=sc.nextDouble();
				trapecio.setBasem(baseM);
				System.out.println("Ingrese lado 1: ");
				lado1=sc.nextDouble();
				trapecio.setLado1(lado1);
				System.out.println("Ingrese lado 2: ");
				lado2=sc.nextDouble();
				
				trapecio.Perimetro();
				
			}else{
				System.out.println("Elija una opcion correcta");
			}
			break;
			
			default:
				System.out.println("Ingrese una opcion valida");
		}
		
		
		
	}

}
