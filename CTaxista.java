package Competencia3;

public class CTaxista extends CDatos{
	private String licencia;
	private String placas;
	private int año;
	public String getLicencia() {
		return licencia;
	}
	public void setLicencia(String licencia) {
		this.licencia = licencia;
	}
	public String getPlacas() {
		return placas;
	}
	public void setPlacas(String placas) {
		this.placas = placas;
	}
	
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	void Licencia(int año){
		if(año>=18&&año<=30){
			System.out.println("La licencia es de tipo A");
		}else if(año>=31&&año<=50){
			System.out.println("La licencia es de tipo B");
		}
	}
}
