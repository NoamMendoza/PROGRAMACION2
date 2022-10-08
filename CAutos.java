package Competencia3;

public class CAutos {
	
	private String marca;
	private int modelo;
	private String color;
	private String tipo;
	
	public String GetMarca(){
		return marca;
	}
	
	public void SetMarca(String marca){
		this.marca=marca;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void Mostrar(){
		System.out.println();
		System.out.println("Marca: "+this.marca);
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Color: "+this.color);
		System.out.println("Tipo: "+this.tipo);
	}
	
	
}
