package ar.edu.unlp.objetos.uno.oo2_ejercicio14Patrones;

import java.time.LocalDate;

public class Presupuesto {
	private Configuracion confi;
	private String nombreCliente;
	private LocalDate fecha;
	
	public Presupuesto(Configuracion confi, String nombreCliente, LocalDate fecha) {
		super();
		this.confi = confi;
		this.nombreCliente = nombreCliente;
		this.fecha = fecha;
	}
	
	
}
