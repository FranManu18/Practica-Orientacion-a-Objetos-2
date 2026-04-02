package ar.edu.unlp.objetos.uno.oo2_ejercicio6.Refactoring;

public class EmpleadoTemporario extends Empleado{
	private double horasTrabajadas=0;
	private int cantidadHijos=0;
	
	public EmpleadoTemporario(String nombre, String apellido, double sueldoBasico, double horasTrabajadas,
			int cantidadHijos) {
		super(nombre, apellido, sueldoBasico);
		this.horasTrabajadas = horasTrabajadas;
		this.cantidadHijos = cantidadHijos;
	}
	
	@Override
	public double sueldo() {
		return super.sueldo()+this.cantidadHijos*2000+this.horasTrabajadas*500;
	}
}
