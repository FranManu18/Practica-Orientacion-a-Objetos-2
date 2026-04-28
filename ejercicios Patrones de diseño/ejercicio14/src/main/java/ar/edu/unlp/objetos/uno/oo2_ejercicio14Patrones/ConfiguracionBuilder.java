package ar.edu.unlp.objetos.uno.oo2_ejercicio14Patrones;

public interface ConfiguracionBuilder {
	public abstract void reset();
	public abstract void setProcesador(Componente procesador);
	public abstract void setRam(Componente ram);
	public abstract void setDisco(Componente disco);
	public abstract void setTarjeta(Componente tarjeta);
	public abstract void setGabinete(Componente gabinete);
	public abstract void setFuente(Componente fuente);
	public abstract Configuracion obtenerResultado();
}
