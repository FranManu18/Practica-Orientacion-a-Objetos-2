package ar.edu.unlp.objetos.uno.oo2_ejercicio6.Refactoring;

import java.time.LocalDateTime;

public class Post {
	private String texto;
	private LocalDateTime fecha;
	private Usuario usuario;
	
	public Post(String texto, LocalDateTime fecha, Usuario usuario) {
		super();
		this.texto = texto;
		this.fecha = fecha;
		this.usuario = usuario;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public Usuario getUsuario() {
		return usuario;
	}
	
	
	
}
