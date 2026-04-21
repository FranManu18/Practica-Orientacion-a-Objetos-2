package ar.edu.unlp.objetos.uno.oo2_ejercicio8Patrones;

import java.time.Duration;

public class Finished implements EstadoToDo{
	public void start(ToDoItem toDo) {
		
	}
	public void togglePause(ToDoItem toDo) {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
	}
	public void finish(ToDoItem toDo) {
		
	}
	public Duration workedTime(ToDoItem toDo) {
		return Duration.between(toDo.getStartTime(),toDo.getEndTime());
	}
	public void addComments(String comment,ToDoItem toDo) {
		
	}
}
