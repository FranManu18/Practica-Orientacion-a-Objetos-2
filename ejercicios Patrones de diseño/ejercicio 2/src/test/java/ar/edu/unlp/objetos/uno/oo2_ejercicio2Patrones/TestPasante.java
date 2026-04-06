package ar.edu.unlp.objetos.uno.oo2_ejercicio2Patrones;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPasante {
	private Pasante pasante;
	
	@BeforeEach
	void setUp() {
		pasante=new Pasante(2);
	}
	
	@Test
	public void testSueldoBasicoPasante(){
		assertEquals(20000,pasante.sueldoBasico());
	}
	
	@Test
	public void testSueldoAdicionalPasante(){
		assertEquals(4000,pasante.sueldoAdicional());
		pasante.setCantExamenesRendidos(0);
		assertEquals(0,pasante.sueldoAdicional());
	}
	
	@Test
	public void testDescuentoPasante(){
		assertEquals(2800,pasante.descuento());
	}
	
	@Test
	public void testSueldoPasante() {
		assertEquals(21200,pasante.sueldo());
	}
}
