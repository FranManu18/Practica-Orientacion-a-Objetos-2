package ar.edu.unlp.objetos.uno.oo2_ejercicio12Patrones;

import java.time.LocalDate;
import java.time.Period;

public class Reserva {
	private int cantidadDias;
	private LocalDate fecha;
	private Usuario conductor;
	private AutoEnAlquiler auto;
	
	
	
	public Reserva(int cantidadDias, LocalDate fecha, Usuario conductor, AutoEnAlquiler auto) {
		super();
		this.cantidadDias = cantidadDias;
		this.fecha = fecha;
		this.conductor = conductor;
		this.auto = auto;
	}

	public double montoAPagar() {
		return this.cantidadDias*this.auto.getPrecioPorDia();
	}
	
	private int diferenciaDias(LocalDate fecha2) {
		return Period.between(fecha2,fecha).getDays();
	}
	
	public double montoAReembolsar(LocalDate fechaCancelacion) {
		return auto.montoAReembolsar(this.diferenciaDias(fechaCancelacion),this.montoAPagar());
	}
}
