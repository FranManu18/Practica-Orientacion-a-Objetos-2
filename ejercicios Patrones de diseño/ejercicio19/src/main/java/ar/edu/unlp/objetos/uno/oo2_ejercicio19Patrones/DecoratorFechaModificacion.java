package ar.edu.unlp.objetos.uno.oo2_ejercicio19Patrones;

public class DecoratorFechaModificacion extends DecoratorFile{

	public DecoratorFechaModificacion(PrettyPrintable componente, FileOO2 archivo) {
		super(componente, archivo);
	}
	
	@Override
	public String obtenerValor() {
		return this.getArchivo().getFechaModificacion().toString();
	}
}
