package ar.edu.unlp.objetos.uno.oo2_ejercicio19Patrones;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class TestFileOO2 {
	@Test
	public void testOO2(){
		FileOO2 archivo = new FileOO2("documento", ".pdf", 1024,
		        LocalDate.of(2024, 1, 1),
		        LocalDate.of(2024, 6, 1),
		        "rwxr--r--");
		
		PrettyPrintable vista=new DecoratorExtension(new DecoratorNombre(archivo,archivo),archivo);
		assertEquals("documento-.pdf",vista.prettyPrint());
		
		vista=new DecoratorExtension(new DecoratorFechaCreacion(new DecoratorNombre(archivo,archivo),archivo),archivo);
		assertEquals("documento-2024-01-01-.pdf",vista.prettyPrint());
		
		vista=new DecoratorExtension(new DecoratorPermisos(new DecoratorTamaño(new DecoratorNombre(archivo,archivo),archivo),archivo),archivo);
		assertEquals("documento-1024.0 bytes-rwxr--r---.pdf",vista.prettyPrint());
	}
}
