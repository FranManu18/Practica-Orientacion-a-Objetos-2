package ar.edu.unlp.objetos.uno.oo2_ejercicio4Patrones;

import java.util.Arrays;

public class Celda implements ComponenteTopografia{
	int valor;

	public Celda(int valor) {
		super();
		if(valor!=0 && valor !=1) {
			throw new IllegalArgumentException("Solo se permite 0 o 1");
		}
		this.valor = valor;
	}
	
	@Override
	public double proporcionAgua() {	
		if(valor==1) {
			return 1;
		}
		return 0;
	}
	
	@Override
	public double proporcionTierra() {
		if(valor==0) {
			return 1;
		}
		return 0;
	}
	
	@Override
	public boolean esMixta() {
		return false;
	}
	
}
