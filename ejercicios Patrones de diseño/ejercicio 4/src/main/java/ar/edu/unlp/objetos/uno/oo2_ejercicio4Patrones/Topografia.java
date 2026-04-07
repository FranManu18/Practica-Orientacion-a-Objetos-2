package ar.edu.unlp.objetos.uno.oo2_ejercicio4Patrones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Topografia implements ComponenteTopografia{
	private List<ComponenteTopografia>elementos=new ArrayList<>();


	public Topografia(List<ComponenteTopografia> elementos) {
		super();
		this.elementos = elementos;
	}
	
	
	
	public List<ComponenteTopografia> getElementos() {
		return elementos;
	}



	public void setElementos(List<ComponenteTopografia> elementos) {
		this.elementos = elementos;
	}



	@Override
	public double proporcionAgua() {	
		return elementos.stream().mapToDouble(e->e.proporcionAgua()).average().orElse(0);
	}
	
	@Override
	public double proporcionTierra() {
		return elementos.stream().mapToDouble(e->e.proporcionTierra()).average().orElse(0);
	}
	
	@Override
	public boolean esMixta() {
		 boolean tieneAgua = elementos.stream().anyMatch(e -> e.proporcionAgua() > 0);
		 boolean tieneTierra = elementos.stream().anyMatch(e -> e.proporcionTierra() > 0);
		 return tieneAgua && tieneTierra;
	}
	
	
	public boolean iguales(Topografia topografia) {
		if(this.esMixta() && topografia.esMixta()) {
			return this.elementos.equals(topografia.getElementos());
		}
		return this.proporcionTierra()==topografia.proporcionTierra() && this.proporcionAgua()==topografia.proporcionAgua(); 
	}
	
}
