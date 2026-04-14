package ar.edu.unlp.objetos.uno.oo2_ejercicio6Patrones;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {
	private List<Componente>componentes;

	public Sandwich() {
		this.componentes=new ArrayList<>();
	}
	
	public void agregarComponente(Componente c) {
		this.componentes.add(c);
	}
	
	public double calcularPrecio() {
		return this.componentes.stream()
				.mapToDouble(c->c.getPrecio())
				.sum();
	}
}
