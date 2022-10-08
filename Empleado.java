package Competencia4;

public abstract class Empleado {
int HorasTrabajadas;
double SueldoPorHora;
public int getHorasTrabajadas() {
	return HorasTrabajadas;
}
public void setHorasTrabajadas(int horasTrabajadas) {
	HorasTrabajadas = horasTrabajadas;
}
public double getSueldoPorHora() {
	return SueldoPorHora;
}
public void setSueldoPorHora(double sueldoPorHora) {
	SueldoPorHora = sueldoPorHora;
}

public abstract double CalcularSalario();
}
