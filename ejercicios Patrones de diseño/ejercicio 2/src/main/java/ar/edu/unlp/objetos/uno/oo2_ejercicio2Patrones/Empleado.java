package ar.edu.unlp.objetos.uno.oo2_ejercicio2Patrones;

public abstract class Empleado {
	public abstract double sueldoBasico();
	
	public abstract double sueldoAdicional();
	
	public double descuento() {
		return (this.sueldoBasico()*0.13)+(this.sueldoAdicional()*0.05);
	}
	
	public double sueldo() {
		return this.sueldoBasico()+this.sueldoAdicional()-this.descuento();
	}
}
