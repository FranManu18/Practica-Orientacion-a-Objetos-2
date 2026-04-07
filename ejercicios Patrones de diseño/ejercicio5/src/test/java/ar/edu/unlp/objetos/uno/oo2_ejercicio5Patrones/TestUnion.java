package ar.edu.unlp.objetos.uno.oo2_ejercicio5Patrones;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestUnion {
	private Union union;
	
	@BeforeEach
	void setUp() {
		union=new Union();
	}
	
	@Test
	public void testFormula() {
		union.agregar(new Atomo("Hidrogeno","H",1,1,false), 1);
		union.agregar(new Atomo("Oxigeno","O",16,-2,false), 2);
		assertEquals("H2O",union.formula());
	}
	
	@Test
	public void testPesoMolecular() {
		union.agregar(new Atomo("Hidrogeno","H",1,1,false), 1);
		union.agregar(new Atomo("Oxigeno","O",16,-2,false), 2);
		assertEquals(33,union.pesoMolecular());
	}
	
	@Test
	public void testCarga() {
		union.agregar(new Atomo("Hidrogeno","H",1,1,false), 1);
		union.agregar(new Atomo("Oxigeno","O",16,-2,false), 2);
		assertEquals(-3,union.carga());
	}
	
	@Test
	public void testEsValida() {
		union.agregar(new Atomo("Hidrogeno","H",1,1,false), 1);
		union.agregar(new Atomo("Oxigeno","O",16,-2,false), 2);
		assertTrue(union.esValida());
		union.agregar(new Atomo("Sodio","Na",23,1,true), 4);
		assertTrue(union.esValida());
		union.agregar(new Atomo("Calcio","Ca",40,2,true), 2);
		assertFalse(union.esValida());
		
	}
}
