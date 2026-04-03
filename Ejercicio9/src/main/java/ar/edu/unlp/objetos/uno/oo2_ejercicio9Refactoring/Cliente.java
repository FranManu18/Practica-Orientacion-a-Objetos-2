package ar.edu.unlp.objetos.uno.oo2_ejercicio9Refactoring;

import java.time.LocalDate;
import java.time.Period;

public class Cliente {
	private LocalDate fechaAlta;

	public LocalDate getFechaAlta() {
		return fechaAlta;
	}
	
	public int getAntiguedad() {
		return Period.between(fechaAlta, LocalDate.now()).getYears();
	}
	
}
