package ar.edu.unlp.objetos.uno.oo2_ejercicio11Patrones;

import java.util.ArrayList;
import java.util.List;

public class FileSystem {
	private Directorio raiz;

	
	
	public FileSystem(Directorio raiz) {
		super();
		this.raiz = raiz;
	}

	public int tamañoTotalOcupado() {
		return raiz.getTamaño();
	}

	public Archivo archivoMasGrande() {
		return raiz.masGrande();
	}
	
	public Archivo archivoMasNuevo() {
		return raiz.masNuevo();
	}
	
	public Elemento buscar(String nombre) {
		return raiz.buscar(nombre);
	}
	
	public List<Elemento> buscarTodos(String nombre){
		return raiz.buscarTodos(nombre);
	}
	
	public String listarContenido() {
		return raiz.listarContenido("");
	}
	
}
