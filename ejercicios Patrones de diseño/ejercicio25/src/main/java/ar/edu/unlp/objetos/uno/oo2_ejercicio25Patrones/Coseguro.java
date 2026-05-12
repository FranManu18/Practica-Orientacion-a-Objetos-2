package ar.edu.unlp.objetos.uno.oo2_ejercicio25Patrones;

import java.time.LocalDate;
import java.time.Period;

public class Coseguro {
	private String nombre;
	private double descuento;
	private LocalDate fechaIngreso;
	private double montoCoberturaViajes;
	

	public Coseguro(String nombre, double descuento, LocalDate fechaIngreso, double montoCoberturaViajes) {
		super();
		this.nombre = nombre;
		this.descuento = descuento;
		this.fechaIngreso = fechaIngreso;
		this.montoCoberturaViajes = montoCoberturaViajes;
	}
	
	

	public double getDescuento() {
		return descuento;
	}



	public double getMontoCoberturaViajes() {
		return montoCoberturaViajes;
	}
	
	public int getAntiguedad() {
		return Period.between(fechaIngreso, LocalDate.now()).getYears();
	}
}
