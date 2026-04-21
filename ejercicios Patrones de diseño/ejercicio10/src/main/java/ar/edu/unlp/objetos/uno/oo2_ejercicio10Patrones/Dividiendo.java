package ar.edu.unlp.objetos.uno.oo2_ejercicio10Patrones;

public class Dividiendo implements Estado{
	public double getResultado(Calculadora calculadora) {
		calculadora.setEstado(new Error());
		return calculadora.getResultado();
	}

	public void borrar(Calculadora calculadora) {
		calculadora.setEstado(new Error());
	}
	public  void setValor(double unValor,Calculadora calculadora) {
		if(unValor==0) {
			calculadora.setEstado(new Error());
		}
		calculadora.setValorAcumulado(calculadora.getValorAcumulado()/unValor);
		calculadora.setEstado(new Inicio());
	}
	public  void mas(Calculadora calculadora) {
		calculadora.setEstado(new Error());
	}
	public  void menos(Calculadora calculadora) {
		calculadora.setEstado(new Error());
	}
	public void por(Calculadora calculadora) {
		calculadora.setEstado(new Error());
	}
	public  void dividido(Calculadora calculadora) {
		calculadora.setEstado(new Error());
	}
}
