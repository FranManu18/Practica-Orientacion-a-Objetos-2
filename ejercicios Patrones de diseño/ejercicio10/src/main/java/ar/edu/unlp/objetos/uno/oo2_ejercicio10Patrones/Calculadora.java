package ar.edu.unlp.objetos.uno.oo2_ejercicio10Patrones;

public class Calculadora {
	private double valorAcumulado;
	private Estado estado;
	public Calculadora() {
		super();
		this.valorAcumulado=0;
		this.estado = new Inicio();
	}
	
	
	
	public double getValorAcumulado() {
		return valorAcumulado;
	}



	public void setValorAcumulado(double valorAcumulado) {
		this.valorAcumulado = valorAcumulado;
	}



	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public double getResultado() {
		return estado.getResultado(this);
	}

	public void borrar() {
		estado.borrar(this);
	}
	public  void setValor(double unValor) {
		estado.setValor(unValor, this);
	}
	public  void mas() {
		estado.mas(this);
	}
	public  void menos() {
		estado.menos(this);
	}
	public void por() {
		estado.por(this);
	}
	public  void dividido() {
		estado.dividido(this);
	}
	
}
