package ar.edu.unlp.objetos.uno.oo2_ejercicio2Patrones;

import java.time.LocalDate;
import java.time.Period;

public class Planta extends EmpleadoConFamilia{
	private LocalDate fechaIngreso;

	
	
	public Planta(boolean casado, int cantHijos, LocalDate fechaIngreso) {
		super(casado, cantHijos);
		this.fechaIngreso = fechaIngreso;
	}

	public int getAntiguedad() {
		return Period.between(fechaIngreso, LocalDate.now()).getYears();
	}
	
	
	
	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	@Override
	public double sueldoAdicional() {
		return super.sueldoAdicional()+this.getAntiguedad()*2000;
	}
	
	@Override
	public double sueldoBasico() {
		return 50000;
	}
}
