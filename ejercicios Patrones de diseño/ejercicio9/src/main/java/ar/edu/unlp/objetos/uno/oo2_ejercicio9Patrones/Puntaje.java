package ar.edu.unlp.objetos.uno.oo2_ejercicio9Patrones;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Puntaje implements Estrategia{
	public List<Pelicula> sugerencia(List<Pelicula> peliculas, 
            List<Pelicula> reproducidas) {
		return peliculas.stream()
				.filter(p -> !reproducidas.contains(p))  // excluye las ya vistas
				.sorted((p1, p2) -> {
					int cmp = Double.compare(p2.getPuntaje(), p1.getPuntaje()); // mayor puntaje primero
					if (cmp != 0) return cmp;
					return Integer.compare(p2.getAñoEstreno(), p1.getAñoEstreno()); // si empatan, más reciente primero
				})
				.limit(3)  // tomás las primeras 3
				.collect(Collectors.toList());
	}
}
