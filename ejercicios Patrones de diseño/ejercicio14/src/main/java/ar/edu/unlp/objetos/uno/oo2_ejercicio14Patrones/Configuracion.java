package ar.edu.unlp.objetos.uno.oo2_ejercicio14Patrones;

import java.util.ArrayList;
import java.util.List;

public class Configuracion {
	private List<Componente>componentes;

	public Configuracion() {
		super();
		this.componentes=new ArrayList<>();
	}
	
	public void agregarComponente(Componente componente) {
		this.componentes.add(componente);
	}
	
	public double consumo() {
		return componentes.stream().mapToDouble(c->c.getConsumo()).sum();
	}
	
	public double precio() {
		double valor=componentes.stream().mapToDouble(c->c.getPrecio()).sum();
		return valor+(valor*0.21);
	}

	public List<Componente> getComponentes() {
		return componentes;
	}
	
	
}
