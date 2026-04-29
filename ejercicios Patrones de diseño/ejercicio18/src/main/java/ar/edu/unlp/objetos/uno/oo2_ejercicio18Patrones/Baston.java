package ar.edu.unlp.objetos.uno.oo2_ejercicio18Patrones;

public class Baston implements Arma{
	@Override
	public int dañoContra(Armadura armadura) {
		return armadura.recibirDeBaston();
	}
}
