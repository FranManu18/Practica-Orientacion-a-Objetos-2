package ar.edu.unlp.objetos.uno.oo2_ejercicio8Patrones;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Paused implements EstadoToDo{
	public void start(ToDoItem toDo) {
		
	}
	public void togglePause(ToDoItem toDo) {
		toDo.setEstado(new InProgress());
	}
	public void finish(ToDoItem toDo) {
		toDo.setEstado(new Finished());
	}
	public Duration workedTime(ToDoItem toDo) {
		return Duration.between(toDo.getStartTime(),LocalDateTime.now());
	}
	public  void addComments(String comment,ToDoItem toDo) {
		toDo.agregarComentario(comment);
	}
}
