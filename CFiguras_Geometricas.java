package Competencia4;

public abstract class CFiguras_Geometricas {
protected double radio;
protected double lado;
protected double base;
protected double altura;
protected double lado1;
protected double lado2;
protected double lado3;
protected double baseM;
protected double basem;
protected double area;
protected double perimetro;

public abstract void Area();
public abstract void Perimetro();

public double getRadio() {
	return radio;
}
public void setRadio(double radio) {
	this.radio = radio;
}
public double getLado() {
	return lado;
}
public void setLado(double lado) {
	this.lado = lado;
}
public double getBase() {
	return base;
}
public void setBase(double base) {
	this.base = base;
}
public double getAltura() {
	return altura;
}
public void setAltura(double altura) {
	this.altura = altura;
}
public double getLado1() {
	return lado1;
}
public void setLado1(double lado1) {
	this.lado1 = lado1;
}
public double getLado2() {
	return lado2;
}
public void setLado2(double lado2) {
	this.lado2 = lado2;
}
public double getLado3() {
	return lado3;
}
public void setLado3(double lado3) {
	this.lado3 = lado3;
}
public double getBaseM() {
	return baseM;
}
public void setBaseM(double baseM) {
	this.baseM = baseM;
}
public double getBasem() {
	return basem;
}
public void setBasem(double basem) {
	this.basem = basem;
}

}
