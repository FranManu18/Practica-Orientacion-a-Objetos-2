package ar.edu.unlp.objetos.uno.oo2_ejercicio3refactoring;

import java.util.ArrayList;

public abstract class Ring {
	protected int idx;
	
	public Ring() {
		idx=0;
	}
	
	public void advanceIdx() {
		if(idx>=size())
			idx=0;
	}
	
	public abstract int size();
	
	
}
