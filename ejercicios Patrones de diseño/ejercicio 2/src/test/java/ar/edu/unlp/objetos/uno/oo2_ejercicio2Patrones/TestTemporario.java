package ar.edu.unlp.objetos.uno.oo2_ejercicio2Patrones;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTemporario {
	private Temporario temp;
	
	@BeforeEach
	void setUp() {
		temp=new Temporario(true,2,10);
	}
	
	@Test
	public void testSueldoBasicoTemporario(){
		assertEquals(23000,temp.sueldoBasico());
	}
	
	@Test
	public void testSueldoAdicionalTemporario(){
		assertEquals(9000,temp.sueldoAdicional());
		temp.setCasado(false);
		assertEquals(4000,temp.sueldoAdicional());
		temp.setCasado(true);
		temp.setCantHijos(0);
		assertEquals(5000,temp.sueldoAdicional());
		temp.setCasado(false);
		assertEquals(0,temp.sueldoAdicional());
	}
	
	@Test
	public void testDescuentoTemporario(){
		assertEquals(3440,temp.descuento());
	}
	
	@Test
	public void testSueldoTemporario() {
		assertEquals(28560,temp.sueldo());
	}
	
}
