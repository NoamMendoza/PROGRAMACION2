package Competencia3;

public class CEstacionamiento {
	private String placas;
	private String modelo;
	private int total;
	private int horas;
	private int minutos;
	public String getPlacas() {
		return placas;
	}
	public void setPlacas(String placas) {
		this.placas = placas;
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
	public int getMinutos() {
		return minutos;
	}
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	
	int Total(int horas, int minutos){
		if(minutos>0&&minutos<59){
			if(minutos<=30){
				total=horas*18;
			}else{
				total=(horas+1)*18;
			}
		}
		return total;
	}
}
