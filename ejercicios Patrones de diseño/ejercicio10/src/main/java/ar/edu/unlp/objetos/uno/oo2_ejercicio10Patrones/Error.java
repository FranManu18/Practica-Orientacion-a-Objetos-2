package ar.edu.unlp.objetos.uno.oo2_ejercicio10Patrones;

public class Error implements Estado{
	public double getResultado(Calculadora calculadora) {
		throw new RuntimeException("error");
	}

	public void borrar(Calculadora calculadora) {
		calculadora.setEstado(new Inicio());
		calculadora.setValorAcumulado(0);
	}
	public  void setValor(double unValor,Calculadora calculadora) {
		
	}
	public  void mas(Calculadora calculadora) {
		
	}
	public  void menos(Calculadora calculadora) {
		
	}
	public void por(Calculadora calculadora) {
		
	}
	public  void dividido(Calculadora calculadora) {
		
	}
}
