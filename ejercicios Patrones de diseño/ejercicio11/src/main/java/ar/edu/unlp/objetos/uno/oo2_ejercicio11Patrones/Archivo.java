package ar.edu.unlp.objetos.uno.oo2_ejercicio11Patrones;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Archivo extends Elemento{

	public Archivo(String nombre, LocalDate fechaCreacion, int tamaño) {
		super(nombre, fechaCreacion, tamaño);
	}
	
	@Override
	public  boolean soyArchivo() {
		return true;
	}
	
	public  Archivo masGrande() {
		return this;
	}
	
	@Override
	public  Archivo masNuevo() {
		return this;
	}
	
	
	public  Elemento buscar(String nombre) {
		if (this.coincido(nombre)) {
			return this;
		}
		return null;
	}
	
	public  List<Elemento> buscarTodos(String nombre) {
		List<Elemento>elementos=new ArrayList<>();
		if (this.coincido(nombre)) {
			elementos.add(this);
		}
		return elementos;
	}
	
	public String listarContenido(String pathPadre) {
	    return pathPadre + "/" + this.getNombre() + "\n";
	}
}
