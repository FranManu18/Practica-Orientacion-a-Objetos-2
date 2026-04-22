package ar.edu.unlp.objetos.uno.oo2_ejercicio11Patrones;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Directorio extends Elemento{
	private List<Elemento>contenido;

	public Directorio(String nombre, LocalDate fechaCreacion) {
		super(nombre, fechaCreacion, 32);
		contenido=new ArrayList<>();
	}
	
	public void agregarElemento(Elemento elem) {
		this.contenido.add(elem);
	}
	
	@Override
	public  boolean soyArchivo() {
		return false;
	}
	
	@Override
	public int getTamaño() {
		return super.getTamaño()+this.contenido.stream().mapToInt(e->e.getTamaño()).sum();
	}
	
	
	public  Archivo masGrande() {
		return contenido.stream()
	            .map(e->e.masGrande())
	            .filter(a -> a != null)
	            .max((a1, a2) -> Integer.compare(a1.getTamaño(), a2.getTamaño()))
	            .orElse(null);
	}
	
	@Override
	public  Archivo masNuevo() {
		return contenido.stream()
	            .map(e->e.masNuevo())
	            .filter(a -> a != null)
	            .max((a1, a2) -> a1.getFechaCreacion().compareTo(a2.getFechaCreacion()))
	            .orElse(null);
	}
	
	
	public  Elemento buscar(String nombre) {
		if (this.coincido(nombre)) {
			return this;
		}
		return this.contenido.stream()
				.map(e->e.buscar(nombre))
				.filter(e->e!=null)
				.findFirst().orElse(null);
	}
	
	public  List<Elemento> buscarTodos(String nombre) {
		List<Elemento>elementos=new ArrayList<>();
		if (this.coincido(nombre)) {
			 elementos.add(this);
		}
		this.contenido.forEach(e -> elementos.addAll(e.buscarTodos(nombre)));
		return elementos;
	}
	
	public String listarContenido(String pathPadre) {
	    String pathActual = pathPadre + "/" + this.getNombre();
	    String texto = pathActual + "\n";
	    for (Elemento e : this.contenido) {
	        texto += e.listarContenido(pathActual);
	    }
	    return texto;
	}
}
