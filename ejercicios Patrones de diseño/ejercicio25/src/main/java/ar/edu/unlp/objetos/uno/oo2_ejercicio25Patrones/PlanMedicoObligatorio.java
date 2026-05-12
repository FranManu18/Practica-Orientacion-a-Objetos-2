package ar.edu.unlp.objetos.uno.oo2_ejercicio25Patrones;

import java.time.LocalDate;

public class PlanMedicoObligatorio extends PlanMedico{

	
	
	public PlanMedicoObligatorio(LocalDate fechaContratacion) {
		super(fechaContratacion);
	}

	@Override
	public double getMontoFijo() {
		return 15000;
	}
	
	@Override
	public double getMontoFamiliares() {
		if(this.tieneCoseguro()) {
			double multiplicador=3500-(3500*this.getCoseguro().getDescuento());
			return this.getCantFamiliares()*multiplicador;
		}
		return this.getCantFamiliares()*3500;
	}
	
	@Override
	public double getMontoCobertura() {
		double costo=this.getSalario()*0.01;
		if(this.tieneCoseguro()) {
			costo-=this.getCoseguro().getMontoCoberturaViajes();
		}
		return costo<0 ? 0 :costo;
	}
	
	@Override
	public double getMontoSeguro() {
		return 0;
	}
}
