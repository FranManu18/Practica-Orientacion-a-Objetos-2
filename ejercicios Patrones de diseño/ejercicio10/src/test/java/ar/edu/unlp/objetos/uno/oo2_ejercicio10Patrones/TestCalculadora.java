package ar.edu.unlp.objetos.uno.oo2_ejercicio10Patrones;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCalculadora {
	private Calculadora calc;
	
	@BeforeEach
	void setUp() {
		calc=new Calculadora();
	}
	
	@Test
	public void testCalculos() {
		assertEquals(0,calc.getResultado());
		calc.setValor(5);
		calc.mas();
		calc.setValor(3);
		assertEquals(8.0,calc.getResultado());
		calc.por();
		calc.setValor(2);
		assertEquals(16.0,calc.getResultado());
	}
}
