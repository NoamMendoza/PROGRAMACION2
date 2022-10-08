package Competencia4;

public class Rectangulo extends CFiguras_Geometricas{
	public void Area(){
		area=base*altura;
		System.out.println("Area del rectangulo: "+area);
	}
	public void Perimetro(){
		perimetro=(altura+base)*2;
		System.out.println("Perimetro del rectangulo: = "+perimetro);
		
	}
}
