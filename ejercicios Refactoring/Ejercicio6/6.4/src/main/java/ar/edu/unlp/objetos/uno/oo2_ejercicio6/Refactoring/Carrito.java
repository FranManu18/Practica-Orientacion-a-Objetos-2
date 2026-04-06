package ar.edu.unlp.objetos.uno.oo2_ejercicio6.Refactoring;

import java.util.List;

public class Carrito {
	private List<ItemCarrito>items;
	
	public double total() {
		return this.items.stream()
				.mapToDouble(i->i.subTotal())
				.sum();
	}
}
