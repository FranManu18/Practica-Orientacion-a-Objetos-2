package ar.edu.unlp.objetos.uno.oo2_ejercicio18Patrones;

public interface PersonajeBuilder {
	public abstract void reset();
	
	public abstract void asignarArmadura(Armadura armadura);
	
	public abstract void asignarArma(Arma arma);
	
	public abstract void asignarHabilidad(String habilidad);
	
	public abstract Personaje obtenerResultado();
}
