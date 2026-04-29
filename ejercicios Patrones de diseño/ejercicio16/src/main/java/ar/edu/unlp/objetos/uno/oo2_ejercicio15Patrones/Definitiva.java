package ar.edu.unlp.objetos.uno.oo2_ejercicio15Patrones;

public class Definitiva extends Estado{

	public Definitiva(Excursion excursion) {
		super(excursion);
	}
	
	@Override
	public String getInformacion() {
		return "Nombre: "+this.getExcursion().getNombre() 
				+ " ,Costo: " + this.getExcursion().getCosto()
				+" ,Fecha de inicio: "+this.getExcursion().getFechaInicio()
				+" ,Fecha de fin: "+this.getExcursion().getFechaFin()
				+" ,Punto de encuentro: "+this.getExcursion().getPuntoEncuentro()
				+" ,Faltantes para Cupo Maximo: "+this.getExcursion().faltantesCupoMaximo();
	}
	
	@Override
	public void inscribirUsuario(Usuario usuario) {
		this.getExcursion().agregarInscripto(usuario);
		if(this.getExcursion().alcanzaCupoMaximo()) {
			this.getExcursion().cambiarEstado(new Llena(this.getExcursion()));
		}
	}
}
