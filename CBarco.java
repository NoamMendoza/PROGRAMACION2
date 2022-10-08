package Competencia3;

public class CBarco {
	private double longitud;
	private int capacidad = 100;
	private String modelo;
	private int horas;
	private int personas;
	
	
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public int getPersonas() {
		return personas;
	}
	public void setPersonas(int personas) {
		if(personas<=100&&personas>0){
		this.personas = personas;
		}else{
			System.out.println("La cantidad de personas exede la capacidad");
			System.exit(0);
		}
	}
	double Renta(int horas){
		double renta;
		renta=horas*1500;
		return renta;
	}
	
}
