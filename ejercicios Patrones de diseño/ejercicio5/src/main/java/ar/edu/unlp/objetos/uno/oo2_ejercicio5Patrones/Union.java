package ar.edu.unlp.objetos.uno.oo2_ejercicio5Patrones;

import java.util.ArrayList;
import java.util.List;

public class Union implements ElementoQuimico{
	private List<ElementoQuimico>componentes;
    private List<Integer> cantidades;
    
	public Union() {
		super();
		this.componentes=new ArrayList<>();
		this.cantidades=new ArrayList<>();
	}
	
	public void agregar(ElementoQuimico elemento,int cantidad) {
		componentes.add(elemento);
		cantidades.add(cantidad);
	}
	
	@Override
	public String formula() {
		String total="";
		for(int i=0;i<componentes.size();i++) {
			if(cantidades.get(i)>1) {
				total+=cantidades.get(i);
			}
			total+=componentes.get(i).formula();
		}
		return total;
	}
	
	@Override
	public int pesoMolecular() {
		int suma=0;
		for(int i=0;i<componentes.size();i++) {
			suma+=this.componentes.get(i).pesoMolecular()*this.cantidades.get(i);
		}
		return suma;
	}
	
	@Override
	public int carga() {
		int suma=0;
		for(int i=0;i<componentes.size();i++) {
			suma+=(this.componentes.get(i).carga()*this.cantidades.get(i));
		}
		return suma;
	}
	
	@Override
	public boolean esValida() {
		long cantMetales = componentes.stream()
		        .filter(e -> e instanceof Atomo && ((Atomo) e).isMetal())
		        .count();
		 return cantMetales < 2;
	}
}
