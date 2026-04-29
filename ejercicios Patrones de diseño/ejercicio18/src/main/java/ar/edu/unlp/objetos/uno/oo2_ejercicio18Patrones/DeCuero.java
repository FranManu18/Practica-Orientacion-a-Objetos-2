package ar.edu.unlp.objetos.uno.oo2_ejercicio18Patrones;

public class DeCuero implements Armadura{
	@Override
	public int recibirDeEspada() {
		return 8;
	}
	
	@Override
	public int recibirDeBaston() {
		return 2;
	}
	
	@Override
	public int recibirDeArco() {
		return 5;
	}
	
	@Override
	public int recibirDeMartillo() {
		return 10;
	}
}
