package ar.edu.unlp.objetos.uno.oo2_ejercicio3refactoring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCharRing {
	private CharRing charRing;
	
	@BeforeEach
	void setUp() {
		charRing=new CharRing("Hola");
	}
	
	@Test
	public void testNextChar() {
		assertEquals('H',charRing.next());
		assertEquals('o',charRing.next());
		assertEquals('l',charRing.next());
		assertEquals('a',charRing.next());
		assertEquals('H',charRing.next());
		
	}
}
