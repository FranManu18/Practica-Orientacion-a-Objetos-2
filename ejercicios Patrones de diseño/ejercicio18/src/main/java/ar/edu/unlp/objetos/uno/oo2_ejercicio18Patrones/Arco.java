package ar.edu.unlp.objetos.uno.oo2_ejercicio18Patrones;

public class Arco implements Arma{
	@Override
	public int dañoContra(Armadura armadura) {
		return armadura.recibirDeArco();
	}
}
