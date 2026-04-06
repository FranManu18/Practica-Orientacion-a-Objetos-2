package ar.edu.unlp.objetos.uno.oo2_ejercicio2Patrones;

public class Pasante extends Empleado{
	private int cantExamenesRendidos;

	public Pasante(int cantExamenesRendidos) {
		super();
		this.cantExamenesRendidos = cantExamenesRendidos;
	}
	
	
	
	public void setCantExamenesRendidos(int cantExamenesRendidos) {
		this.cantExamenesRendidos = cantExamenesRendidos;
	}



	@Override
	public double sueldoAdicional() {
		return 2000*this.cantExamenesRendidos;
	}
	
	@Override
	public double sueldoBasico() {
		return 20000;
	}
}
