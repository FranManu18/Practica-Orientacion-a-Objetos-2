package ar.edu.unlp.objetos.uno.oo2_ejercicio4Patrones;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTopografia {
	private Topografia topografia;
	
	@BeforeEach
	void setUp(){
		List<ComponenteTopografia>componentes=new ArrayList<>();
		componentes.add(new Celda(0));
		componentes.add(new Celda(0));
		componentes.add(new Celda(0));
		componentes.add(new Celda(0));
		topografia=new Topografia(componentes);
	}
	
	@Test
	public void testProporcion() {
		assertEquals(1,topografia.proporcionTierra());
		assertEquals(0,topografia.proporcionAgua());
		List<ComponenteTopografia>componentes=new ArrayList<>();
		componentes.add(new Celda(1));
		componentes.add(new Celda(1));
		componentes.add(new Celda(1));
		componentes.add(new Celda(1));
		topografia.setElementos(componentes);
		assertEquals(0,topografia.proporcionTierra());
		assertEquals(1,topografia.proporcionAgua());
		List<ComponenteTopografia>componentes1=new ArrayList<>();
		componentes1.add(new Celda(0));
		componentes1.add(new Celda(1));
		componentes1.add(new Celda(0));
		componentes1.add(new Celda(1));
		topografia.setElementos(componentes1);
		assertEquals(0.5,topografia.proporcionTierra());
		assertEquals(0.5,topografia.proporcionAgua());
		componentes=new ArrayList<>();
		componentes.add(new Celda(1));
		componentes.add(new Celda(0));
		componentes.add(new Celda(0));
		componentes.add(new Topografia(componentes1));
		topografia.setElementos(componentes);
		assertEquals(0.625,topografia.proporcionTierra());
		assertEquals(0.375,topografia.proporcionAgua());
		componentes=new ArrayList<>();
		componentes.add(new Celda(1));
		componentes.add(new Celda(1));
		componentes.add(new Pantano());
		componentes.add(new Celda(0));
		topografia.setElementos(componentes);
		assertEquals(0.325,topografia.proporcionTierra());
		assertEquals(0.675,topografia.proporcionAgua());
		
	}
	
	@Test
	public void testEsMixta() {
		assertFalse(topografia.esMixta());
		List<ComponenteTopografia>componentes1=new ArrayList<>();
		componentes1.add(new Celda(0));
		componentes1.add(new Celda(1));
		componentes1.add(new Celda(0));
		componentes1.add(new Celda(1));
		topografia.setElementos(componentes1);
		assertTrue(topografia.esMixta());
		List<ComponenteTopografia>componentes=new ArrayList<>();
		componentes.add(new Celda(1));
		componentes.add(new Celda(0));
		componentes.add(new Celda(0));
		componentes.add(new Topografia(componentes1));
		topografia.setElementos(componentes);
		assertTrue(topografia.esMixta());
		componentes1=new ArrayList<>();
		componentes1.add(new Celda(0));
		componentes1.add(new Celda(1));
		componentes1.add(new Pantano());
		componentes1.add(new Celda(1));
		topografia.setElementos(componentes1);
		assertTrue(topografia.esMixta());
		componentes1=new ArrayList<>();
		componentes1.add(new Pantano());
		componentes1.add(new Pantano());
		componentes1.add(new Pantano());
		componentes1.add(new Pantano());
		topografia.setElementos(componentes1);
		//assertFalse(topografia.esMixta());
	}
	
	@Test
	public void testIguales() {
		List<ComponenteTopografia>componentes=new ArrayList<>();
		componentes.add(new Celda(0));
		componentes.add(new Celda(0));
		componentes.add(new Celda(0));
		componentes.add(new Celda(0));
		Topografia topografia2=new Topografia(componentes);
		assertTrue(topografia.iguales(topografia2));
		componentes=new ArrayList<>();
		componentes.add(new Celda(1));
		componentes.add(new Celda(0));
		componentes.add(new Celda(1));
		componentes.add(new Celda(0));
		topografia.setElementos(componentes);
		assertFalse(topografia.iguales(topografia2));
		topografia2.setElementos(componentes);
		assertTrue(topografia.iguales(topografia2));
		componentes=new ArrayList<>();
		componentes.add(new Celda(0));
		componentes.add(new Celda(1));
		componentes.add(new Celda(0));
		componentes.add(new Celda(1));
		topografia.setElementos(componentes);
		assertFalse(topografia.iguales(topografia2));
		List<ComponenteTopografia>componentes1=new ArrayList<>();
		componentes1.add(new Celda(1));
		componentes1.add(new Celda(0));
		componentes1.add(new Celda(0));
		componentes1.add(new Topografia(componentes));
		topografia.setElementos(componentes1);
		topografia2.setElementos(componentes1);
		assertTrue(topografia.iguales(topografia2));
		componentes1=new ArrayList<>();
		componentes1.add(new Pantano());
		componentes1.add(new Pantano());
		componentes1.add(new Pantano());
		componentes1.add(new Pantano());
		topografia.setElementos(componentes1);
		topografia2.setElementos(componentes1);
		assertTrue(topografia.iguales(topografia2));
		componentes1=new ArrayList<>();
		componentes1.add(new Pantano());
		componentes1.add(new Pantano());
		componentes1.add(new Celda(0));
		componentes1.add(new Pantano());
		topografia.setElementos(componentes1);
		topografia2.setElementos(componentes1);
		assertTrue(topografia.iguales(topografia2));
	}
	
	
}
