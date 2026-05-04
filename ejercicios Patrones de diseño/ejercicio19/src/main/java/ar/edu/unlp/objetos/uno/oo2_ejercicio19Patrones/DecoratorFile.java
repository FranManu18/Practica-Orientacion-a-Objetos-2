package ar.edu.unlp.objetos.uno.oo2_ejercicio19Patrones;

public abstract class DecoratorFile implements PrettyPrintable{
	private PrettyPrintable componente;
	private FileOO2 archivo;
	
	public DecoratorFile(PrettyPrintable componente, FileOO2 archivo) {
		super();
		this.componente = componente;
		this.archivo = archivo;
	}
	
	@Override
	public String prettyPrint() {
		String base=componente.prettyPrint();
		String propio=this.obtenerValor();
		if(base.isEmpty()) {
			return propio;
		}else {
			return base+"-"+propio;
		}
	}
	
	public abstract String obtenerValor();

	public FileOO2 getArchivo() {
		return archivo;
	}
	
	
}	
