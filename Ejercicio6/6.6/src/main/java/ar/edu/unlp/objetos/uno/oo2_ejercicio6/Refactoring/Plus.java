package ar.edu.unlp.objetos.uno.oo2_ejercicio6.Refactoring;

public class Plus implements TipoSubscripcion{
	@Override
	public double costoPelicula(Pelicula pelicula) {
		return pelicula.getCosto();
	}
}
