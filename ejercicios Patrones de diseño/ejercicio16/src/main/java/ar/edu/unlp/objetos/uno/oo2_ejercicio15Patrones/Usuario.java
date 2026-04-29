package ar.edu.unlp.objetos.uno.oo2_ejercicio15Patrones;

public class Usuario {
	private String nombre;
	private String apellido;
	private String email;
	
	public Usuario(String nombre, String apellido, String email) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	
}
