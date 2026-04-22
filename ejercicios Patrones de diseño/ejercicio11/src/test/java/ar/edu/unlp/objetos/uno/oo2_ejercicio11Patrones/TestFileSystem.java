package ar.edu.unlp.objetos.uno.oo2_ejercicio11Patrones;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestFileSystem {
	private FileSystem file;
	
	@BeforeEach
	void setUp() {
		Directorio raiz=new Directorio("Raiz",LocalDate.now());
		file=new FileSystem(raiz);
		raiz.agregarElemento(new Archivo("Archivo 1",LocalDate.of(2024, 01, 01),100));
		Directorio directorio2=new Directorio("Directorio 2",LocalDate.of(2026, 02, 01));
		raiz.agregarElemento(directorio2);
		directorio2.agregarElemento(new Archivo("Archivo 2",LocalDate.of(2026, 01, 01),150));
		Directorio directorio3=new Directorio("Directorio 3",LocalDate.of(2026, 02, 01));
		directorio3.agregarElemento(new Archivo("Archivo 3",LocalDate.of(2025, 01, 01),50) );
		directorio3.agregarElemento(new Archivo("Archivo 4",LocalDate.of(2025, 05, 01),50) );	
		raiz.agregarElemento(directorio3);
	}
	
	@Test
	public void testTamañoTotal() {
		assertEquals(446,file.tamañoTotalOcupado());
	}
	
	@Test
	public void testArchivoMasGrande() {
		assertEquals("Archivo 2",file.archivoMasGrande().getNombre());
	}
	
	@Test
	public void testArchivoMasNuevo() {
		assertEquals("Archivo 2",file.archivoMasNuevo().getNombre());
	}
	
	@Test
	public void testBuscar() {
		assertEquals("Directorio 3",file.buscar("Directorio 3").getNombre());
	}
	
	@Test
	public void testBuscarTodos() {
		assertEquals(1,file.buscarTodos("Directorio 3").size());
	}
	
	@Test
	public void testListaDeContenido() {
		System.out.println(file.listarContenido());
	}
}
