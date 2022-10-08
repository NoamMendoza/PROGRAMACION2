package Competencia4;

public class Circulo extends CFiguras_Geometricas{
public void Area(){
	area=Math.PI*Math.pow(radio, 2);
	System.out.println("Area del circulo: "+area);
}
public void Perimetro(){
	perimetro=Math.PI*(radio*2);
	System.out.println("Perimetro del circulo: "+perimetro);
	
}
}
