package Competencia4;

public class Cuadrado extends CFiguras_Geometricas{
	public void Area(){
		area=lado*lado;
		System.out.println("Area del cuadrado: "+area);
	}
	public void Perimetro(){
		perimetro=lado*4;
		System.out.println("Perimetro del cuadrado: = "+perimetro);
		
	}
}
