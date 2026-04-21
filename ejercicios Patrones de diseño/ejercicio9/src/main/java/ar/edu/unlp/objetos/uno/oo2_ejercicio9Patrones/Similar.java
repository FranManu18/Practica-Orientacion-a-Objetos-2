package ar.edu.unlp.objetos.uno.oo2_ejercicio9Patrones;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Similar implements Estrategia{
	public List<Pelicula>sugerencia(List<Pelicula>peliculas,List<Pelicula>reproducidas){
		return reproducidas.stream()
	            .flatMap(p -> p.getSimilares().stream())  // junta todas las similares
	            .distinct()                                // elimina duplicadas
	            .filter(p -> !reproducidas.contains(p))   // saca las ya vistas
	            .sorted((p1, p2) -> Integer.compare(p2.getAñoEstreno(), p1.getAñoEstreno())) // más reciente primero
	            .limit(3)
	            .collect(Collectors.toList());
	}
}
