package ar.edu.unlp.objetos.uno.oo2_ejercicio9Patrones;

import java.util.List;

public interface Estrategia {
	public abstract List<Pelicula>sugerencia(List<Pelicula>peliculas,List<Pelicula>reproducidas);
}
