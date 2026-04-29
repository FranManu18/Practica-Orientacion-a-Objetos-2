package ar.edu.unlp.objetos.uno.oo2_ejercicio15Patrones;

public class Provisoria extends Estado{

	public Provisoria(Excursion excursion) {
		super(excursion);
	}
	
	@Override
	public String getInformacion() {
		return "Nombre: "+this.getExcursion().getNombre() 
				+ " ,Costo: " + this.getExcursion().getCosto()
				+" ,Fecha de inicio: "+this.getExcursion().getFechaInicio()
				+" ,Fecha de fin: "+this.getExcursion().getFechaFin()
				+" ,Punto de encuentro: "+this.getExcursion().getPuntoEncuentro()
				+" ,Faltantes para Cupo Minimo: "+this.getExcursion().faltantesCupoMinimo();
	}
	
	@Override
	public void inscribirUsuario(Usuario usuario) {
		this.getExcursion().agregarInscripto(usuario);
		if(this.getExcursion().alcanzaCupoMinimo()) {
			this.getExcursion().cambiarEstado(new Definitiva(this.getExcursion()));
		}
	}
}
