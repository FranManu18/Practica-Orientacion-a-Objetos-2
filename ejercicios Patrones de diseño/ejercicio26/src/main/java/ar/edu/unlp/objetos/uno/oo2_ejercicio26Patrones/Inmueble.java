package ar.edu.unlp.objetos.uno.oo2_ejercicio26Patrones;

public class Inmueble extends Prenda{
	private String direccion;
	private int superficie;
	private double costoM2;
	
	public Inmueble(String direccion, int superficie, double costoM2) {
		super(0.2);
		this.direccion = direccion;
		this.superficie = superficie;
		this.costoM2 = costoM2;
	}
	
	@Override
	public double getValor() {
		return this.superficie*this.costoM2;
	}
}
