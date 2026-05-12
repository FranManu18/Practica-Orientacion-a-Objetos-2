package ar.edu.unlp.objetos.uno.oo2_ejercicio25Patrones;

import java.time.LocalDate;

public abstract class PlanMedico {
	private Coseguro coseguro;
	private int cantFamiliares;
	private double salario;
	private LocalDate fechaContratacion;


	public PlanMedico(LocalDate fechaContratacion) {
		super();
		this.fechaContratacion = fechaContratacion;
	}

	

	public void setCantFamiliares(int cantFamiliares) {
		this.cantFamiliares = cantFamiliares;
	}



	public void setSalario(double salario) {
		this.salario = salario;
	}



	public LocalDate getFechaContratacion() {
		return fechaContratacion;
	}



	public void setCoseguro(Coseguro coseguro) {
		this.coseguro = coseguro;
	}
	
	public boolean tieneCoseguro() {
		return coseguro!=null;
	}
	
	
	
	public int getCantFamiliares() {
		return cantFamiliares;
	}



	public double getSalario() {
		return salario;
	}



	public Coseguro getCoseguro() {
		return coseguro;
	}



	public abstract double getMontoFijo();
	
	public abstract double getMontoFamiliares();
	
	public abstract double getMontoCobertura();
	
	public abstract double getMontoSeguro();
	
	public double getCostoMensual() {
		return this.getMontoFijo()+this.getMontoFamiliares()+this.getMontoCobertura()+this.getMontoSeguro();
	}
	
}
