package ar.edu.unlp.objetos.uno.oo2_ejercicio8Patrones;

import java.time.Duration;
import java.time.LocalDateTime;

public class Pending implements EstadoToDo{
	public void start(ToDoItem toDo) {
		toDo.setEstado(new InProgress());
		toDo.setStartTime(LocalDateTime.now());
	}
	public void togglePause(ToDoItem toDo) {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
	}
	public void finish(ToDoItem toDo) {
		
	}
	public Duration workedTime(ToDoItem toDo) {
		throw new RuntimeException("El objeto ToDoItem no se inicio");
	}
	
	public  void addComments(String comment,ToDoItem toDo) {
		toDo.agregarComentario(comment);
	}
	
}
