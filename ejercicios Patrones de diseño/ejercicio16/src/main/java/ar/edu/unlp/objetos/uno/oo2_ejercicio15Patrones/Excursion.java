package ar.edu.unlp.objetos.uno.oo2_ejercicio15Patrones;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Excursion {
	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String puntoEncuentro;
	private double costo;
	private int cupoMinimo;
	private int cupoMaximo;
	private Estado estado;
	private List<Usuario>listaDeEspera;
	private List<Usuario>inscriptos;
	
	public Excursion(String nombre, LocalDate fechaInicio, LocalDate fechaFin, String puntoEncuentro, double costo,
			int cupoMinimo, int cupoMaximo) {
		super();
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.puntoEncuentro = puntoEncuentro;
		this.costo = costo;
		this.cupoMinimo = cupoMinimo;
		this.cupoMaximo = cupoMaximo;
		this.estado=new Provisoria(this);
		this.listaDeEspera=new ArrayList<>();
		this.inscriptos=new ArrayList<>();
	}
	
	public void cambiarEstado(Estado estado) {
		this.estado=estado;
	}
	
	public void agregarInscripto(Usuario usuario) {
		this.inscriptos.add(usuario);
	}
	
	public void agregarListaDeEspera(Usuario usuario) {
		this.listaDeEspera.add(usuario);
	}
	
	public int faltantesCupoMaximo() {
		return this.cupoMaximo-this.inscriptos.size();
	}
	
	public int faltantesCupoMinimo() {
		return this.cupoMinimo-this.inscriptos.size();
	}
	
	public boolean alcanzaCupoMinimo() {
		return this.inscriptos.size()==this.cupoMinimo;
	}
	
	public boolean alcanzaCupoMaximo() {
		return this.inscriptos.size()==this.cupoMaximo;
	}
	
	public void inscribir(Usuario unUsuario) {
		this.estado.inscribirUsuario(unUsuario);
	}
	
	public String obtenerInformacion() {
		return this.estado.getInformacion();
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public String getPuntoEncuentro() {
		return puntoEncuentro;
	}

	public double getCosto() {
		return costo;
	}

	public List<Usuario> getListaDeEspera() {
		return listaDeEspera;
	}

	public List<Usuario> getInscriptos() {
		return inscriptos;
	}
	
	
	
	
	
}
