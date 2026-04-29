package ar.edu.unlp.objetos.uno.oo2_ejercicio16Patrones;

public class Snippet {

	public static void main(String[] args) {
		Mensajero m = new Mensajero(new FeistelCipherAdapter("miClave"));
		m.enviar("Hola!");

		m.cambiarEstrategia(new RC4Adapter("otraClave"));
		m.enviar("Hola de nuevo!");
		
	}

}
