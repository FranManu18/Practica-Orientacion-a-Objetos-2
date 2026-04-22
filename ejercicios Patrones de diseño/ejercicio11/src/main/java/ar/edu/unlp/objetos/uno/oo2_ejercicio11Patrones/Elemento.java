package ar.edu.unlp.objetos.uno.oo2_ejercicio11Patrones;

import java.time.LocalDate;
import java.util.List;

public abstract class Elemento {
	private String nombre;
	private LocalDate fechaCreacion;
	private int tamaño;
	
	public Elemento(String nombre, LocalDate fechaCreacion, int tamaño) {
		super();
		this.nombre = nombre;
		this.fechaCreacion = fechaCreacion;
		this.tamaño = tamaño;
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}
	
	public int getTamaño() {
		return tamaño;
	}
	
	public boolean coincido(String buscado) {
		return this.getNombre()==buscado;
	}
	
	public abstract boolean soyArchivo();
	
	public abstract Archivo masGrande();
	
	public abstract Archivo masNuevo();
	
	public abstract Elemento buscar(String nombre);
	
	public abstract List<Elemento> buscarTodos(String nombre);
	
	public abstract String listarContenido(String pathPadre);
}
