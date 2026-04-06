package ar.edu.unlp.objetos.uno.oo2_ejercicio2Patrones;

public class Temporario extends EmpleadoConFamilia{
	private int cantHoras;

	public Temporario(boolean casado, int cantHijos, int cantHoras) {
		super(casado, cantHijos);
		this.cantHoras = cantHoras;
	}
	
	@Override
	public double sueldoBasico() {
		return 20000+this.cantHoras*300;
	}
}
