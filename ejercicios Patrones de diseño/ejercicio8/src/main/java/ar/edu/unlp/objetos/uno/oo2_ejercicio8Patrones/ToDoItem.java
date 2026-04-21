package ar.edu.unlp.objetos.uno.oo2_ejercicio8Patrones;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {
	private EstadoToDo estado;
	private String name;
	private List<String>comments;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	
	public ToDoItem(String name) {
		super();
		this.name = name;
		estado=new Pending();
		comments=new ArrayList<>();
	}

	public void setEstado(EstadoToDo estado) {
		this.estado = estado;
	}
	
	public void agregarComentario(String comentario) {
		comments.add(comentario);
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}
	
	public void start() {
		estado.start(this);
	}
	
	public void togglePause() {
		estado.togglePause(this);
	}
	public void finish() {
		estado.finish(this);
	}
	public Duration workedTime() {
		return estado.workedTime(this);
	}
	public  void addComments(String comment) {
		estado.addComments(comment, this);
	}

	public EstadoToDo getEstado() {
		return estado;
	}

	public List<String> getComments() {
		return comments;
	}
	
	
}
