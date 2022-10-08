package Competencia3;

public class CLancha extends CBarco{
	private int personas;
	double Renta3(int horas){
		double renta=0;
		renta=horas*600;
		return renta;
	}
	public void setPersonas(int personas){
		if(personas<=7&&personas>0){
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
