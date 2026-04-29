package ar.edu.unlp.objetos.uno.oo2_ejercicio18Patrones;

public class DeAcero implements Armadura{
	@Override
	public int recibirDeEspada() {
		return 3;
	}
	
	@Override
	public int recibirDeBaston() {
		return 1;
	}
	
	@Override
	public int recibirDeArco() {
		return 2;
	}
	
	@Override
	public int recibirDeMartillo() {
		return 5;
	}
}
