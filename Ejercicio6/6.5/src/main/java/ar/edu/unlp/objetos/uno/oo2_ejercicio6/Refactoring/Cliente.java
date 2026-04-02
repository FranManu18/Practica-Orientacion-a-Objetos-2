package ar.edu.unlp.objetos.uno.oo2_ejercicio6.Refactoring;

public class Cliente {
	private String localidad;
	private String calle;
	private String numero;
	private String departamento;
	
	
	
	public Cliente(String localidad, String calle, String numero, String departamento) {
		super();
		this.localidad = localidad;
		this.calle = calle;
		this.numero = numero;
		this.departamento = departamento;
	}



	public String getDireccionFormateada() {
		return localidad+","+calle+","+numero+","+departamento;
	}
}
