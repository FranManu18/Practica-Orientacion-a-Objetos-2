package ar.edu.unlp.objetos.uno.oo2_ejercicio15Patrones;

public abstract class ConEspacio extends Estado{

	public ConEspacio(Excursion excursion) {
		super(excursion);
	}
	
	
	@Override
	public void inscribirUsuario(Usuario usuario) {
		this.getExcursion().agregarInscripto(usuario);
		if(this.getExcursion().faltantesCupoMaximo()==0) {
			this.getExcursion().cambiarEstado(new Llena(this.getExcursion()));
		}else if(this.getExcursion().alcanzaCupoMinimo()) {
			this.getExcursion().cambiarEstado(new Definitiva(this.getExcursion()));
		}
	}
}
