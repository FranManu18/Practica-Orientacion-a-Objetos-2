package ar.edu.unlp.objetos.uno.oo2_ejercicio26Patrones;

public abstract class Prenda {
	private double liquidez;

	public Prenda(double liquidez) {
		super();
		this.liquidez = liquidez;
	}
	
	public abstract double getValor();
	
	public double valorPrendario() {
		return this.liquidez*this.getValor();
	}
}
