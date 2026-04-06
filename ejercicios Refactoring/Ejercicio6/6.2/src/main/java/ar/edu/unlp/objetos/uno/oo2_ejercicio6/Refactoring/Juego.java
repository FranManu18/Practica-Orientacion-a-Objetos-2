package ar.edu.unlp.objetos.uno.oo2_ejercicio6.Refactoring;

public class Juego {
	private Jugador j;

	public Juego(Jugador j) {
		super();
		this.j = j;
	}
	
	public void incrementar() {
		j.incrementar();
	}
	
	public void decrementar() {
		j.decrementar();
	}
}
