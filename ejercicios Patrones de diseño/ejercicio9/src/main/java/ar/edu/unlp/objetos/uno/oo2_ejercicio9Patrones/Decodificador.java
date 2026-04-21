package ar.edu.unlp.objetos.uno.oo2_ejercicio9Patrones;

import java.util.ArrayList;
import java.util.List;

public class Decodificador {
	private Estrategia estrategia;
	private List<Pelicula>peliculas;
	private List<Pelicula>reproducidas;
	
	public Decodificador(Estrategia estrategia, List<Pelicula> peliculas) {
		super();
		this.estrategia = estrategia;
		this.peliculas = peliculas;
		this.reproducidas=new ArrayList<>();
	}
	
	public void agregarReproducida(Pelicula reproducida) {
		this.reproducidas.add(reproducida);
	}
	
	public List<Pelicula>peliculasSugeridas(){
		return estrategia.sugerencia(peliculas, reproducidas);
	}

	public void setEstrategia(Estrategia estrategia) {
		this.estrategia = estrategia;
	}
	
	
}
