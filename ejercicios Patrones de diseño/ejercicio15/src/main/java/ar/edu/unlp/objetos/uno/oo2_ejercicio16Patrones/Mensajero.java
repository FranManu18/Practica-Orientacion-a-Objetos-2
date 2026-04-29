package ar.edu.unlp.objetos.uno.oo2_ejercicio16Patrones;

public class Mensajero {
	private EncodeStrategy estrategia;
	
	
	
	public Mensajero(EncodeStrategy estrategia) {
		super();
		this.estrategia = estrategia;
	}

	public void cambiarEstrategia(EncodeStrategy estrategia) {
		this.estrategia=estrategia;
	}
	
	
	public void enviar(String mensaje) {
		String mensajeCifrado=estrategia.cifrar(mensaje);
	}
	
	
	public void recibir(String mensaje) {
		String mensajeDescifrado=estrategia.descifrar(mensaje);
		
	}
}	
