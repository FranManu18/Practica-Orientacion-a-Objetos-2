package ar.edu.unlp.objetos.uno.oo2_ejercicio15Patrones;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class TestExcursion {
	
	@Test
	public void testEstadosExcursion() {
		Excursion excursion=new Excursion("Dos dias en kayak bajando el Parana",
				LocalDate.of(2026, 02, 14),
				LocalDate.of(2026, 02, 16),
				"Parana",
				100,
				1,
				2);
		
		System.out.println(excursion.obtenerInformacion());
		
		excursion.inscribir(new Usuario("Francisco","Penetta","franciscopenetta@gmail.com"));
		System.out.println(excursion.obtenerInformacion()); //alcanza el cupo minimo
		
		excursion.inscribir(new Usuario("Roberto","Penetta","robertoopenetta@gmail.com"));
		System.out.println(excursion.obtenerInformacion()); //alcanza el cupo maximo
		
		assertEquals(2,excursion.getInscriptos().size());
		assertEquals(0,excursion.getListaDeEspera().size());
		
		excursion.inscribir(new Usuario("Juan","Penetta","juanpenetta@gmail.com"));
		assertEquals(2,excursion.getInscriptos().size());
		assertEquals(1,excursion.getListaDeEspera().size());
		
	}
}
