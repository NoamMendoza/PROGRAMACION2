package Competencia3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CDatos {
	private String nombre;
	private String fecha;
	private String direccion;
	private String telefono;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	int calcularEdad(String fecha){
		Date fechaNac=null;
		try{
			fechaNac= new SimpleDateFormat("dd-MM-yyyy").parse(fecha);
		}catch(ParseException e){
			e.printStackTrace();
		}
		Calendar fechaNacimiento = Calendar.getInstance();
		Calendar fechaActual = Calendar.getInstance();
		fechaNacimiento.setTime(fechaNac);
		
		int año = fechaActual.get(Calendar.YEAR)- fechaNacimiento.get(Calendar.YEAR);
		int mes = fechaActual.get(Calendar.MONTH)- fechaNacimiento.get(Calendar.MONTH);
		int dia = fechaActual.get(Calendar.DATE)- fechaNacimiento.get(Calendar.DATE);
		
		if(mes<0||(mes==0&&dia<0)){
			año--;
		}
		return año;
	}
}
