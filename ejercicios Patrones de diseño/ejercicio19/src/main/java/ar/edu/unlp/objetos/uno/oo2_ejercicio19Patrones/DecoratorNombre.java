package ar.edu.unlp.objetos.uno.oo2_ejercicio19Patrones;

public class DecoratorNombre extends DecoratorFile{

	public DecoratorNombre(PrettyPrintable componente, FileOO2 archivo) {
		super(componente, archivo);
	}
	
	@Override
	public String obtenerValor() {
		return this.getArchivo().getNombre();
	}
}
