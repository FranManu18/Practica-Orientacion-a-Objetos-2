package ar.edu.unlp.objetos.uno.oo2_ejercicio8Patrones;

import java.time.Duration;

public interface EstadoToDo {
	public abstract void start(ToDoItem toDo);
	public abstract void togglePause(ToDoItem toDo);
	public abstract void finish(ToDoItem toDo);
	public abstract Duration workedTime(ToDoItem toDo);
	public abstract void addComments(String comment,ToDoItem toDo);
	
}
