package ar.edu.unlp.objetos.uno.oo2_ejercicio6.Refactoring;

public class EmpleadoPlanta extends Empleado{
	private int cantidadHijos=0;

	
	
	public EmpleadoPlanta(String nombre, String apellido, double sueldoBasico, int cantidadHijos) {
		super(nombre, apellido, sueldoBasico);
		this.cantidadHijos = cantidadHijos;
	}



	@Override
	public double sueldo() {
		return super.sueldo()+this.cantidadHijos*2000;
	}
}
