package ar.edu.unlp.objetos.uno.oo2_ejercicio10Patrones;

public interface Estado {
	public abstract double getResultado(Calculadora calculadora);
	public abstract void borrar(Calculadora calculadora);
	public abstract void setValor(double unValor,Calculadora calculadora);
	public abstract void mas(Calculadora calculadora);
	public abstract void menos(Calculadora calculadora);
	public abstract void por(Calculadora calculadora);
	public abstract void dividido(Calculadora calculadora);
}
