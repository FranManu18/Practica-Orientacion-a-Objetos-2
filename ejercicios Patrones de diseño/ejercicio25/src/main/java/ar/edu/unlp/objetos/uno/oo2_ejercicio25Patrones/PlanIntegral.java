package ar.edu.unlp.objetos.uno.oo2_ejercicio25Patrones;

import java.time.LocalDate;

public class PlanIntegral extends PlanMedico{

	

	public PlanIntegral(LocalDate fechaContratacion) {
		super(fechaContratacion);
	}

	@Override
	public double getMontoFijo() {
		return 22000;
	}
	
	@Override
	public double getMontoFamiliares() {
		return this.getCantFamiliares()*3000 + this.getSalario()*0.01;
	}
	
	@Override
	public double getMontoCobertura() {
		double costo=this.getSalario()*0.03;
		if(this.tieneCoseguro()) {
			costo-=(10000*this.getCoseguro().getAntiguedad());
		}
		return costo<0 ? 0 :costo;
	}
	
	@Override
	public double getMontoSeguro() {
		return this.getMontoFijo()*0.05;
	}
}
