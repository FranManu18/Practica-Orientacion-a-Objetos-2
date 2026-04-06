package ar.edu.unlp.objetos.uno.oo2_ejercicio3refactoring;

public class IntRing extends Ring{
	private int[]source;
	
	public IntRing(int[]src) {
		source=src;
	}
	
	@Override
	public int size() {
		return source.length;
	}
	
	public int next() {
		this.advanceIdx();
		return source[idx++];
	}
}
