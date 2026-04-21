package ar.edu.unlp.objetos.uno.oo2_ejercicio8Patrones;

import java.time.Duration;
import java.time.LocalDateTime;

public class InProgress implements EstadoToDo{
	public void start(ToDoItem toDo) {
		
	}
	public void togglePause(ToDoItem toDo) {
		toDo.setEstado(new Paused());
	}
	public void finish(ToDoItem toDo) {
		toDo.setEstado(new Finished());
		toDo.setEndTime(LocalDateTime.now());
	}
	public Duration workedTime(ToDoItem toDo) {
		return Duration.between(toDo.getStartTime(),LocalDateTime.now());
	}
	public  void addComments(String comment,ToDoItem toDo) {
		toDo.agregarComentario(comment);
	}
}
