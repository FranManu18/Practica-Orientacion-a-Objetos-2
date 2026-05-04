package ar.edu.unlp.objetos.uno.oo2_ejercicio20Patrones;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestDatabaseAccess {
	private DatabaseAccess realDatabase;
    private DatabaseAccessProxy proxy;
    private final String correctKey = "contraseña123";
    private final String incorrectKey = "contraseña";
	
	@BeforeEach
	void setUp(){
		realDatabase=new DatabaseRealAccess();
		proxy=new DatabaseAccessProxy(new DatabaseRealAccess(),correctKey);
	}
	
	@Test
	public void testGetSearchResults() {
		Collection<String>result=realDatabase.getSearchResults("select * from comics where id=1");
		assertEquals(Arrays.asList("Spiderman", "Marvel"),result);
	}
	
	@Test
    void testGetSearchResultsNonExistingRecord() {
        Collection<String> result = realDatabase.getSearchResults("select * from comics where id=999");
        assertTrue(result.isEmpty());
    }
	
	@Test
	public void testInsertNewRow() {
		int id=realDatabase.insertNewRow(Arrays.asList("Patoruzú", "La flor"));
		assertEquals(3,id);
		Collection<String> result = realDatabase.getSearchResults("select * from comics where id=3");
        assertEquals(Arrays.asList("Patoruzú", "La flor"), result);
	}
	
	@Test
	public void testAutenticacionExitosa() {
		assertDoesNotThrow(() -> proxy.autenticarse(correctKey));
	}
	
	@Test
	public void testAutenticacionFallidaPorPassword() {
		Exception exception = assertThrows(RuntimeException.class, () -> 
        proxy.autenticarse(incorrectKey));
    assertEquals("Contraseña incorrecta", exception.getMessage());
	}
	
	@Test
	public void testAutenticacionFallidaPorUsuarioYaAutenticado() {
		proxy.autenticarse(correctKey);
		Exception exception = assertThrows(RuntimeException.class, () -> 
        proxy.autenticarse(incorrectKey));
    assertEquals("Sesion ya iniciada", exception.getMessage());
	}
	
	@Test
	public void testSalirExitoso() {
		proxy.autenticarse(correctKey);
		assertDoesNotThrow(() -> proxy.salir());
	}
	
	@Test
	public void testSalirFallidoPorSesionNoIniciada() {
		Exception exception = assertThrows(RuntimeException.class, () -> 
        proxy.salir());
    assertEquals("Sesion sin iniciar", exception.getMessage());
	}
}
