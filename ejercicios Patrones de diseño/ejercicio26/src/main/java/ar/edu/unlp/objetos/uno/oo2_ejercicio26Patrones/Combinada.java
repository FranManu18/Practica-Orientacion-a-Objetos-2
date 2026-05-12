package ar.edu.unlp.objetos.uno.oo2_ejercicio26Patrones;

import java.util.ArrayList;
import java.util.List;

public class Combinada extends Prenda{
	private List<Prenda> prendas;

	public Combinada() {
		super(0.5);
		this.prendas=new ArrayList<>();
	}
	
	public void agregarPrenda(Prenda prenda) {
		this.prendas.add(prenda);
	}
	
	@Override
	public double getValor() {
		return this.prendas.stream()
				.mapToDouble(p->p.getValor()).sum();
	}
	
}
