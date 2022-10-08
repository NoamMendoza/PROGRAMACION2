package Competencia3;

public class CYate extends CBarco {
	private int personas;
	double Renta1(int horas){
		double renta;
		renta=horas*1000;
		return renta;
	}
	public void setPersonas(int personas){
		if(personas<=15&&personas>0){
			this.personas = personas;
		}else{
			System.out.println("La cantidad de personas exede la capacidad");
			System.exit(0);
		}
	}
	public int getPersonas() {
		return personas;
	}
}
