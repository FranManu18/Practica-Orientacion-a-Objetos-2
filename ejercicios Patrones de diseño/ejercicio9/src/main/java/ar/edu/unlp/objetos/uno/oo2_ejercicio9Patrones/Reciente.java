package ar.edu.unlp.objetos.uno.oo2_ejercicio9Patrones;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Reciente implements Estrategia{
	public List<Pelicula>sugerencia(List<Pelicula>peliculas,List<Pelicula>reproducidas){
		peliculas= peliculas.stream()
				.sorted((p1,p2)->Integer.compare(p2.getAñoEstreno(), p1.getAñoEstreno()))
				.collect(Collectors.toList());
		if(peliculas.size()>=2) {
			return peliculas.stream().limit(3).collect(Collectors.toList());
		}
		return peliculas;
	}
}
