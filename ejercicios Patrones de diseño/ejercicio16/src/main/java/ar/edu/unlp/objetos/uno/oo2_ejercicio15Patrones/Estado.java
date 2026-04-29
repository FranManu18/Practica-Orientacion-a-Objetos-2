package ar.edu.unlp.objetos.uno.oo2_ejercicio15Patrones;

public abstract class Estado {
	private Excursion excursion;

	public Estado(Excursion excursion) {
		super();
		this.excursion = excursion;
	}
	
	
	
	public Excursion getExcursion() {
		return excursion;
	}



	public abstract String getInformacion();
	
	public abstract void inscribirUsuario(Usuario usuario);
}
