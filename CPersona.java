package Competencia3;

public class CPersona {
	private String nombre;
	private int edad;
	private String genero;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		if(edad>0&&edad<=80){
			this.edad = edad;
		}else{
			System.out.println("Edad no valida jajajajar");
		}
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		if(genero.equalsIgnoreCase("F")||genero.equalsIgnoreCase("M")){
			this.genero = genero;
		}else{
			System.out.println("Genero no registrado");
		}
	}
	
	
	
	
}
