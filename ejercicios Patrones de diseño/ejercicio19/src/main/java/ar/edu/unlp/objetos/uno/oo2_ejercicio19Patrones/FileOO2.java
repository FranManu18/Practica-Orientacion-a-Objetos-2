package ar.edu.unlp.objetos.uno.oo2_ejercicio19Patrones;

import java.time.LocalDate;

public class FileOO2 implements PrettyPrintable{
	private String nombre;
	private String extension;
	private double tamaño;
	private LocalDate fechaCreacion;
	private LocalDate fechaModificacion;
	private String permisos;
	
	public FileOO2(String nombre, String extension, double tamaño, LocalDate fechaCreacion, LocalDate fechaModificacion,
			String permisos) {
		super();
		this.nombre = nombre;
		this.extension = extension;
		this.tamaño = tamaño;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
		this.permisos = permisos;
	}

	public String getNombre() {
		return nombre;
	}

	public String getExtension() {
		return extension;
	}

	public double getTamaño() {
		return tamaño;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public LocalDate getFechaModificacion() {
		return fechaModificacion;
	}

	public String getPermisos() {
		return permisos;
	}
	
	@Override
	public String prettyPrint() {
		return "";
	}
}
