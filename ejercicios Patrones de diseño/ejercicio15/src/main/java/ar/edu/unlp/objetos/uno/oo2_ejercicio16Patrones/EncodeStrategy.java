package ar.edu.unlp.objetos.uno.oo2_ejercicio16Patrones;

public interface EncodeStrategy {
	public abstract String cifrar(String mensaje);
	public abstract String descifrar(String mensajeCifrado);
}
