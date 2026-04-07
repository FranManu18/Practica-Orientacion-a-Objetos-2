package ar.edu.unlp.objetos.uno.oo2_ejercicio4Patrones;

public class Pantano implements ComponenteTopografia{

	public Pantano() {
		super();
	}
	
	@Override
	public double proporcionAgua() {	
		return 0.7;
	}
	
	@Override
	public double proporcionTierra() {
		return 0.3;
	}
	
	@Override
	public boolean esMixta() {
		return false;
	}
}
