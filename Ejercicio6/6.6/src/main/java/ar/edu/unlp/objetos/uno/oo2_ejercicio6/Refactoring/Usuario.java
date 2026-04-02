package ar.edu.unlp.objetos.uno.oo2_ejercicio6.Refactoring;

public class Usuario {
	private String nombre;
	private int telefono;
	private TipoSubscripcion tipoSubscripcion;
	private String email;
	
	public double calcularCostoPelicula(Pelicula pelicula) {
		return this.tipoSubscripcion.costoPelicula(pelicula);
	}
}
