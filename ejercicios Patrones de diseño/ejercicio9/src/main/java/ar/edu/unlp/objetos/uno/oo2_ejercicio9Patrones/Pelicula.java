package ar.edu.unlp.objetos.uno.oo2_ejercicio9Patrones;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {
	private String titulo;
	private int añoEstreno;
	private List<Pelicula>similares;
	private double puntaje;
	
	public Pelicula(String titulo, int añoEstreno, double puntaje) {
		super();
		this.titulo = titulo;
		this.añoEstreno = añoEstreno;
		this.similares = new ArrayList<>();
		this.puntaje = puntaje;
	}
	
	public void agregarSimilar(Pelicula similar) {
		this.similares.add(similar);
	}

	public double getPuntaje() {
		return puntaje;
	}
	
	
	
	public int getAñoEstreno() {
		return añoEstreno;
	}
	
	

	public List<Pelicula> getSimilares() {
		return similares;
	}

	public String getTitulo() {
		return titulo;
	}

}
