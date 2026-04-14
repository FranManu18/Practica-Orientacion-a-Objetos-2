package ar.edu.unlp.objetos.uno.oo2_ejercicio6Patrones;

public class Componente {
	private String nombre;
	private double precio;
	
	public Componente(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	public double getPrecio() {
		return precio;
	}
	
	
}
