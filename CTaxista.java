package Competencia3;

public class CTaxista extends CDatos{
	private String licencia;
	private String placas;
	private int a�o;
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
	
	public int getA�o() {
		return a�o;
	}
	public void setA�o(int a�o) {
		this.a�o = a�o;
	}
	void Licencia(int a�o){
		if(a�o>=18&&a�o<=30){
			System.out.println("La licencia es de tipo A");
		}else if(a�o>=31&&a�o<=50){
			System.out.println("La licencia es de tipo B");
		}
	}
}
