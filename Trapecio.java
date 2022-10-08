package Competencia4;

public class Trapecio extends CFiguras_Geometricas{
	public void Area(){
		area=((baseM+basem)*altura)/2;
		System.out.println("Area del trapecio: "+area);
	}
	public void Perimetro(){
		perimetro=basem+baseM+lado1+lado2;
		System.out.println("Perimetro del trapecio: = "+perimetro);
		
	}
}
