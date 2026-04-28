package ar.edu.unlp.objetos.uno.oo2_ejercicio14Patrones;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {
	private List<Componente>componentesDisponibles;

	public Catalogo() {
		super();
		this.componentesDisponibles=new ArrayList<>();
	}
	
	public void agregarComponente(Componente componente) {
		this.componentesDisponibles.add(componente);
	}

	public Componente getComponente(String descripcion) {
		return this.componentesDisponibles.stream()
				.filter(c->c.getDescripcion().equals(descripcion))
				.findAny().orElse(null);
	}
	
	
	
}
