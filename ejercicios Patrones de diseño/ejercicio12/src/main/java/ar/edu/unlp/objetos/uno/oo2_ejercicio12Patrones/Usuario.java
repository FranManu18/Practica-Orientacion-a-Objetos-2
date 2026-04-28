package ar.edu.unlp.objetos.uno.oo2_ejercicio12Patrones;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nombre;
	private List<AutoEnAlquiler>autosEnAlquiler;
	
	public Usuario(String nombre) {
		super();
		this.nombre = nombre;
		this.autosEnAlquiler=new ArrayList<>();
	}
	
	public void agregarAuto(AutoEnAlquiler auto) {
		this.autosEnAlquiler.add(auto);
	}
}
