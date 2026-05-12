package ar.edu.unlp.objetos.uno.oo2_ejercicio25Patrones;

import java.time.LocalDate;

public class PlanPremium extends PlanMedico{

	
	
	public PlanPremium(LocalDate fechaContratacion) {
		super(fechaContratacion);
	}

	@Override
	public double getMontoFijo() {
		double monto=33000;
		if(this.tieneCoseguro()) {
			monto-=(monto*this.getCoseguro().getDescuento());
		}
		return monto;
	}
	
	@Override
	public double getMontoFamiliares() {
		if(this.getCantFamiliares()<=4) {
			return 0;
		}
		return 2800*(this.getCantFamiliares()-4);
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
		return this.getMontoFijo()*0.05;
	}
}
