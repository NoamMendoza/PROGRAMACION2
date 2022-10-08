package Competencia4;

public class Cantates {

	public static void main(String[] args) {
		CJulionAlvarez a = new CJulionAlvarez();
		CChalinoSanchez b = new CChalinoSanchez();
		CGoldenRooster c = new CGoldenRooster();
		CConjuntoPrimavera d = new CConjuntoPrimavera();
		CCantante e = new CCantante();
		
		a.setNombre("Julion Alvarez");
		b.setNombre("Chalino Sanchez");
		c.setNombre("Valentin Elizalde");
		d.setNombre("Conjunto primavera");
		
		System.out.println("Un cantante cualquiera canta asi:");
		e.Canta();
		
		System.out.println(a.getNombre()+" canta asi: ");
		a.Canta();
		
		System.out.println(b.getNombre()+" canta asi: ");
		b.Canta();
		
		System.out.println(c.getNombre()+" canta asi: ");
		c.Canta();
		
		System.out.println(d.getNombre()+" canta asi: ");
		d.Canta();
	}

}
