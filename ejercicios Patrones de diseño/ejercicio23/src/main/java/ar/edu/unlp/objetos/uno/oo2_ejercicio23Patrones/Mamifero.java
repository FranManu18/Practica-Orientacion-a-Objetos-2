package ar.edu.unlp.objetos.uno.oo2_ejercicio23Patrones;

import java.time.LocalDate;

public class Mamifero {
	private String identificador;
	private String especie;
	private LocalDate fechaNacimiento;
	private Mamifero padre;
	private Mamifero madre;
	
	public Mamifero(String identificador, String especie, LocalDate fechaNacimiento, Mamifero padre, Mamifero madre) {
		super();
		this.identificador = identificador;
		this.especie = especie;
		this.fechaNacimiento = fechaNacimiento;
		this.padre = padre;
		this.madre = madre;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Mamifero getPadre() {
		return padre;
	}

	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}

	public Mamifero getMadre() {
		return madre;
	}

	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	
	public Mamifero getAbueloMaterno() {
		return this.madre.getPadre();
	}
	
	public Mamifero getAbuelaMaterna() {
		return this.madre.getMadre();
	}
	
	public Mamifero getAbueloPaterno() {
		return this.padre.getPadre();
	}
	
	public Mamifero getAbuelaPaterna() {
		return this.padre.getMadre();
	}
	
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		if(madre==null || padre==null) {
			return false;
		}
		
		if(madre==unMamifero || padre==unMamifero) {
			return true;
		}
		
		if(madre.tieneComoAncestroA(unMamifero) || padre.tieneComoAncestroA(unMamifero)) {
			return true;
		}
		return false;
	}
	
}
