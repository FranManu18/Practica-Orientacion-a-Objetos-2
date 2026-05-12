package ar.edu.unlp.objetos.uno.oo2_ejercicio26Patrones;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class TestPrendaCombinada {
	@Test
	public void testCombinada() {
		Combinada combinada=new Combinada();
		combinada.agregarPrenda(new Auto("Audi",100000,10000,LocalDate.of(2024, 05, 12)));
		combinada.agregarPrenda(new Alquiler(LocalDate.of(2025, 5, 12),LocalDate.of(2026, 8, 12),10000));
		assertEquals(19000,combinada.valorPrendario());
	}
}
