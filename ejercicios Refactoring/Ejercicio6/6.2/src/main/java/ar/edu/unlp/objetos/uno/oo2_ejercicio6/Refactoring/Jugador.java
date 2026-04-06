package ar.edu.unlp.objetos.uno.oo2_ejercicio6.Refactoring;

public class Jugador {
	private String nombre;
	private String apellido;
	private int puntuacion=0;
	
	public Jugador(String nombre, String apellido, int puntuacion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.puntuacion = puntuacion;
	}
	
	public void incrementar() {
		puntuacion=puntuacion+100;
	}
	
	public void decrementar() {
		puntuacion=puntuacion-50;
	}
}
