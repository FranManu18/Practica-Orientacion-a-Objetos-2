package ar.edu.unlp.objetos.uno.oo2_ejercicio3refactoring;

public class CharRing extends Ring{
	private char []source;
	
	public CharRing(String src) {
		 source=src.toCharArray();
	}
	
	@Override
	public int size() {
		return source.length;
	}
	
	public char next(){
		this.advanceIdx();
		return source[idx++];
	}
}	
