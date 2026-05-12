package ar.edu.unlp.objetos.uno.oo2_ejercicio26Patrones;

import java.time.LocalDate;
import java.time.Period;

public class Alquiler extends Prenda{
	private LocalDate fechaComienzo;
	private LocalDate fechaFin;
	private double costoMensual;
	
	public Alquiler(LocalDate fechaComienzo, LocalDate fechaFin, double costoMensual) {
		super(0.9);
		this.fechaComienzo = fechaComienzo;
		this.fechaFin = fechaFin;
		this.costoMensual = costoMensual;
	}
	
	public int mesesFaltantes() {
		return Period.between(LocalDate.now(), fechaFin).getMonths();
	}
	
	@Override
	public double getValor() {
		return this.mesesFaltantes()*this.costoMensual;
	}
}
