package ar.edu.unlp.objetos.uno.oo2_ejercicio17Patrones;

public interface Connection {
	public abstract String sendData(String data,Integer crc);
	
	public abstract String symbol();
}
