package ar.edu.unlp.objetos.uno.oo2_ejercicio25Patrones;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class TestAfiliado {
	@Test
	public void testEjemploAfiliado() {
		Afiliado afiliado=new Afiliado("Pedro",2,100000,LocalDate.of(1999, 5, 12),null,new PlanMedicoObligatorio(LocalDate.now()));
		assertEquals(23000.0,afiliado.calcularMonto());
		
		afiliado.setPlan(new PlanIntegral(LocalDate.now()));
		assertEquals(33100.0,afiliado.calcularMonto());
		
		afiliado.setCoseguro(new Coseguro("Pedro",0.1,LocalDate.of(2025, 5, 12),1000));
		assertEquals(30100.0,afiliado.calcularMonto());
	}
}
