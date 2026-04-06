package ar.edu.unlp.objetos.uno.oo2_ejercicio3refactoring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestIntRing {
	private IntRing intRing;
	
	@BeforeEach
	void setUp() {
		intRing=new IntRing(new int[]{1, 2, 3, 4});
	}
	
	@Test
	public void testNextChar() {
		assertEquals(1,intRing.next());
		assertEquals(2,intRing.next());
		assertEquals(3,intRing.next());
		assertEquals(4,intRing.next());
		assertEquals(1,intRing.next());
		
	}
}
