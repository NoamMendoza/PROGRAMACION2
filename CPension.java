package Competencia3;

public class CPension extends CEstacionamiento {
	private int noches;
	private int total;
	
	public int getNoches() {
		return noches;
	}

	public void setNoches(int noches) {
		this.noches = noches;
	}
	
	int Total2(int noches){
		total=noches*100;
		return total;
	}
	
	
}
