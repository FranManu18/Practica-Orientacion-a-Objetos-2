package ar.edu.unlp.objetos.uno.oo2_ejercicio18Patrones;

public class DeHierro implements Armadura{
	@Override
	public int recibirDeEspada() {
		return 5;
	}
	
	@Override
	public int recibirDeBaston() {
		return 1;
	}
	
	@Override
	public int recibirDeArco() {
		return 3;
	}
	
	@Override
	public int recibirDeMartillo() {
		return 7;
	}
}
