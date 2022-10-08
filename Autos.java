package Competencia3;

import java.util.Scanner;

public class Autos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		CAutos auto1 = new CAutos();
		CAutos auto2 = new CAutos();
		
		auto1.SetMarca("tsuru tuneado");
		auto1.setModelo(2003);
		auto1.setColor("Verde pistache neon");
		auto1.setTipo("Deportivo de los que hacen sutututtu");
		auto1.Mostrar();
		
		auto2.SetMarca("Suburban dorada");
		auto2.setModelo(1999);
		auto2.setColor("Dorada pistache neon");
		auto2.setTipo("Destructor de mundos");
		auto2.Mostrar();
		
		
		
		
		
	}

}
