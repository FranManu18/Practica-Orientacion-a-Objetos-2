package ar.edu.unlp.objetos.uno.oo2_ejercicio6Patrones;

public interface SandwichBuilder {
	public abstract void reset();
	public abstract void setPan(String nombre,double precio);
	public abstract void setAderezo(String nombre,double precio);
	public abstract void setPrincipal(String nombre,double precio);
	public abstract void setAdicional(String nombre,double precio);
	public abstract Sandwich obtenerResultado();
	
}
