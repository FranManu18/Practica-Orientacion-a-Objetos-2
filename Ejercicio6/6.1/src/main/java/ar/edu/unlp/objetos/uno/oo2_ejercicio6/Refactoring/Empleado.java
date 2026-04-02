package ar.edu.unlp.objetos.uno.oo2_ejercicio6.Refactoring;

public class Empleado {
	private String nombre;
	private String apellido;
	private double sueldoBasico=0;
	
	public Empleado(String nombre, String apellido, double sueldoBasico) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.sueldoBasico = sueldoBasico;
	}
	
	public double sueldo() {
		return this.sueldoBasico-(this.sueldoBasico*0.13);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public double getSueldoBasico() {
		return sueldoBasico;
	}

	public void setSueldoBasico(double sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}
	
	
}
