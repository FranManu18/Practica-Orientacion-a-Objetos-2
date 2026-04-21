package ar.edu.unlp.objetos.uno.oo2_ejercicio10Patrones;

public class Inicio implements Estado{
	public double getResultado(Calculadora calculadora) {
		return calculadora.getValorAcumulado();
	}
	public void borrar(Calculadora calculadora) {
		calculadora.setValorAcumulado(0);
	}
	public  void setValor(double unValor,Calculadora calculadora) {
		calculadora.setValorAcumulado(unValor);
	}
	public  void mas(Calculadora calculadora) {
		calculadora.setEstado(new Sumando());
	}
	public  void menos(Calculadora calculadora) {
		calculadora.setEstado(new Restando());
	}
	public void por(Calculadora calculadora) {
		calculadora.setEstado(new Multiplicando());
	}
	public  void dividido(Calculadora calculadora) {
		calculadora.setEstado(new Dividiendo());
	}
}
