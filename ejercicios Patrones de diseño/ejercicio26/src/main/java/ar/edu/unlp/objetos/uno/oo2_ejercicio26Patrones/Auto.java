package ar.edu.unlp.objetos.uno.oo2_ejercicio26Patrones;

import java.time.LocalDate;
import java.time.Period;

public class Auto extends Prenda{
	private String modelo;
	private int kilometraje;
	private double costo0km;
	private LocalDate añoFabricacion;
	
	public Auto(String modelo, int kilometraje, double costo0km, LocalDate añoFabricacion) {
		super(0.7);
		this.modelo = modelo;
		this.kilometraje = kilometraje;
		this.costo0km = costo0km;
		this.añoFabricacion = añoFabricacion;
	}
	
	public int getAntiguedad() {
		return Period.between(añoFabricacion, LocalDate.now()).getYears();
	}
	
	@Override
	public double getValor() {
		double reduccion=0.1*this.getAntiguedad();
		return this.costo0km -(this.costo0km*reduccion);
	}
	
}
