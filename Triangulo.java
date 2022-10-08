package Competencia4;

public class Triangulo extends CFiguras_Geometricas{
	public void Area(){
		area=(base*altura)/2;
		System.out.println("Area del triangulo: "+area);
	}
	public void Perimetro(){
		perimetro=lado1+lado2+lado3;
		System.out.println("Perimetro del triangulo: = "+perimetro);
		
	}
}
