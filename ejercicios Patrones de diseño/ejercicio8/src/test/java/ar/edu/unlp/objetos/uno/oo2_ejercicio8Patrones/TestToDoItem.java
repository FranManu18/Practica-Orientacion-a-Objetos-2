package ar.edu.unlp.objetos.uno.oo2_ejercicio8Patrones;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestToDoItem {
	private ToDoItem item;
	
	@BeforeEach
	void setUp() {
		item=new ToDoItem("Item");
	}
	
	@Test
	public void testStartItem() {
		assertTrue(item.getEstado() instanceof Pending);
		item.start();
		assertTrue(item.getEstado() instanceof InProgress);
		item.start();
		assertTrue(item.getEstado() instanceof InProgress);
		item.setEstado(new Paused());
		item.start();
		assertTrue(item.getEstado() instanceof Paused);
		item.setEstado(new Finished());
		item.start();
		assertTrue(item.getEstado() instanceof Finished);
	}
	
	@Test
	public void testTogglePause() {
		assertThrows(RuntimeException.class, () -> item.togglePause());
		item.start();
		item.togglePause();
		assertTrue(item.getEstado() instanceof Paused);
		item.togglePause();
		assertTrue(item.getEstado() instanceof InProgress);
		item.setEstado(new Finished());
		assertThrows(RuntimeException.class, () -> item.togglePause());
	}
	
	@Test
	public void testFinish() {
		item.finish();
		assertTrue(item.getEstado() instanceof Pending);
		item.start();
		item.finish();
		assertTrue(item.getEstado() instanceof Finished);
		item.setEstado(new Paused());
		item.finish();
		assertTrue(item.getEstado() instanceof Finished);
		item.setEstado(new Finished());
		item.finish();
		assertTrue(item.getEstado() instanceof Finished);
	}
	
	@Test
	public void testWorkedTime() {
		assertThrows(RuntimeException.class, () -> item.workedTime());
	}
	
	@Test
	public void testAddComment() {
		item.setEstado(new Finished());
		item.addComments("Comentario");
		assertEquals(0,item.getComments().size());
		
		item.setEstado(new Pending());
		item.addComments("Comentario");
		
		item.setEstado(new InProgress());
		item.addComments("Comentario");
		
		item.setEstado(new Paused());
		item.addComments("Comentario");
		
		assertEquals(3,item.getComments().size());
		
	}
}
