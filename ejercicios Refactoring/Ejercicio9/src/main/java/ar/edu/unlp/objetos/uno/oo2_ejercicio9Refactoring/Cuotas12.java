package ar.edu.unlp.objetos.uno.oo2_ejercicio9Refactoring;

public class Cuotas12 implements FormaDePago{
	@Override
	public double extra(double costoProductos) {
		return costoProductos*0.5;
	}
}
