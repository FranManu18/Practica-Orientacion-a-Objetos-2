package ar.edu.unlp.objetos.uno.oo2_ejercicio6.Refactoring;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Pelicula {
	private String nombre;
	private String genero;
	private LocalDate fechaEstreno;
	private double costo;
	
	public double getCosto() {
		return costo;
	}
	
	public double calcularCargoExtraPorEstreno() {
		return (ChronoUnit.DAYS.between(this.fechaEstreno, LocalDate.now()))>30?0:300;
	}
	
	public double costoConCargo() {
		return this.costo+this.calcularCargoExtraPorEstreno();
	}
}
