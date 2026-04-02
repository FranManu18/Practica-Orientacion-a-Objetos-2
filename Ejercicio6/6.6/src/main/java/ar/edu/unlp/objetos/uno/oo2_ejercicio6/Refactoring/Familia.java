package ar.edu.unlp.objetos.uno.oo2_ejercicio6.Refactoring;

public class Familia implements TipoSubscripcion{
	@Override
	public double costoPelicula(Pelicula pelicula) {
		return pelicula.costoConCargo()*0.9;
	}
}
