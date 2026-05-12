package ar.edu.unlp.objetos.uno.oo2_ejercicio25Patrones;

import java.time.LocalDate;

public class Afiliado {
	private String nombre;
	private int familiaresAcargo;
	private double salario;
	private LocalDate fechaNacimiento;
	private Coseguro coseguro;
	private PlanMedico plan;

	public Afiliado(String nombre, int familiaresAcargo, double salario, LocalDate fechaNacimiento, Coseguro coseguro,
			PlanMedico plan) {
		super();
		this.nombre = nombre;
		this.familiaresAcargo = familiaresAcargo;
		this.salario = salario;
		this.fechaNacimiento = fechaNacimiento;
		this.coseguro = coseguro;
		this.plan = plan;
		this.plan.setCoseguro(coseguro);
		this.plan.setCantFamiliares(familiaresAcargo);
		this.plan.setSalario(salario);
	}

	public void setCoseguro(Coseguro coseguro) {
		this.coseguro = coseguro;
		this.plan.setCoseguro(coseguro);
	}

	public void setPlan(PlanMedico plan) {
		this.plan = plan;
		this.plan.setCoseguro(coseguro);
		this.plan.setCantFamiliares(familiaresAcargo);
		this.plan.setSalario(salario);
	}
	
	public double calcularMonto() {
		return plan.getCostoMensual();
	}
}
