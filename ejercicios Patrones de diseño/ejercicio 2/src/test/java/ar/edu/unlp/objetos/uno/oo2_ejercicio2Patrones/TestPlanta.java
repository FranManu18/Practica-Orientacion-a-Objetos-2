package ar.edu.unlp.objetos.uno.oo2_ejercicio2Patrones;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPlanta {
	private Planta planta;
	
	@BeforeEach
	void setUp() {
		planta=new Planta(true,2,LocalDate.of(2024, 4, 6));
	}
	
	@Test
	public void testSueldoBasicoPlanta(){
		assertEquals(50000,planta.sueldoBasico());
	}
	
	@Test
	public void testSueldoAdicionalPlanta(){
		assertEquals(13000,planta.sueldoAdicional());
		planta.setCasado(false);
		assertEquals(8000,planta.sueldoAdicional());
		planta.setCasado(true);
		planta.setCantHijos(0);
		assertEquals(9000,planta.sueldoAdicional());
		planta.setCasado(false);
		assertEquals(4000,planta.sueldoAdicional());
		planta.setFechaIngreso(LocalDate.now());
		assertEquals(0,planta.sueldoAdicional());
	}
	
	@Test
	public void testDescuentoPlanta(){
		assertEquals(7150,planta.descuento());
	}
	
	@Test
	public void testSueldoTemporario() {
		assertEquals(55850,planta.sueldo());
	}
}
