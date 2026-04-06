package ar.edu.unlp.objetos.uno.oo2_ejercicio2Patrones;

public abstract class EmpleadoConFamilia extends Empleado{
	private boolean casado;
	private int cantHijos;
	
	public EmpleadoConFamilia(boolean casado, int cantHijos) {
		super();
		this.casado = casado;
		this.cantHijos = cantHijos;
	}
	
	
	
	public void setCasado(boolean casado) {
		this.casado = casado;
	}



	public void setCantHijos(int cantHijos) {
		this.cantHijos = cantHijos;
	}



	@Override
	public double sueldoAdicional() {
		double sueldo=2000*this.cantHijos;
		if(casado) {
			return sueldo+5000;
		}
		return sueldo;
	}
}
