package Competencia3;

public class CAuto {
	private String placa;
	private String marca;
	private String modelo;
	private int mes;
	private int pago;
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		if(mes>0&&mes<12){
		this.mes = mes;
		}else{
			System.out.println("No existe ese mes");
			System.exit(0);
		}
	}
	public int getPago(int mes){
		if(mes==1){
			pago=1500;
		}else if(mes==2){
			pago=1800;
		}else if(mes==3){
			pago=2000;
		}else if(mes>=4&&mes<=12){
			pago=2800;
		}
		return pago;
	}
	public void setPago(int pago) {
		this.pago = pago;
	}
	
	
	
}
