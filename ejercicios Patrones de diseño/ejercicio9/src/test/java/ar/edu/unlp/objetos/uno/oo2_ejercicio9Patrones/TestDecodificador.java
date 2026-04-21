package ar.edu.unlp.objetos.uno.oo2_ejercicio9Patrones;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestDecodificador {
	private Decodificador deco;
	
	@BeforeEach
	void setUp() {
		List<Pelicula>peliculas=new ArrayList<>();
		Pelicula thor=new Pelicula("Thor",2007,7.9);
		Pelicula capitanAmerica=new Pelicula("Capitan America",2016,7.8);
		Pelicula ironMan=new Pelicula("Iron Man",2010,7.9);
		Pelicula dunkirk=new Pelicula("Dunkirk",2017,7.9);
		Pelicula rocky=new Pelicula("Rocky",1976,8.1);
		Pelicula rambo=new Pelicula("Rambo",1979,7.8);
		thor.agregarSimilar(capitanAmerica);
		thor.agregarSimilar(ironMan);
		capitanAmerica.agregarSimilar(thor);
		capitanAmerica.agregarSimilar(ironMan);
		ironMan.agregarSimilar(thor);
		ironMan.agregarSimilar(capitanAmerica);
		rocky.agregarSimilar(rambo);
		rambo.agregarSimilar(rocky);
		peliculas.add(thor);
		peliculas.add(capitanAmerica);
		peliculas.add(ironMan);
		peliculas.add(dunkirk);
		peliculas.add(rocky);
		peliculas.add(rambo);
		deco=new Decodificador(new Reciente(),peliculas);
		deco.agregarReproducida(thor);
		deco.agregarReproducida(rocky);
	}
	
	@Test
	public void testSugerenciaSimilaridad() {
		deco.setEstrategia(new Similar());
		List<Pelicula>sugeridas=deco.peliculasSugeridas();
		assertEquals(3,sugeridas.size());
		assertEquals("Capitan America",sugeridas.get(0).getTitulo());
		assertEquals("Iron Man",sugeridas.get(1).getTitulo());
		assertEquals("Rambo",sugeridas.get(2).getTitulo());
	}
	
	@Test
	public void testSugerenciaPuntaje() {
		deco.setEstrategia(new Puntaje());
		List<Pelicula>sugeridas=deco.peliculasSugeridas();
		assertEquals(3,sugeridas.size());
		assertEquals("Dunkirk",sugeridas.get(0).getTitulo());
		assertEquals("Iron Man",sugeridas.get(1).getTitulo());
		assertEquals("Capitan America",sugeridas.get(2).getTitulo());
	}
	
	@Test
	public void testSugerenciaReciente() {
		deco.setEstrategia(new Reciente());
		List<Pelicula>sugeridas=deco.peliculasSugeridas();
		assertEquals(3,sugeridas.size());
		assertEquals("Dunkirk",sugeridas.get(0).getTitulo());
		assertEquals("Capitan America",sugeridas.get(1).getTitulo());
		assertEquals("Iron Man",sugeridas.get(2).getTitulo());
	}
}
