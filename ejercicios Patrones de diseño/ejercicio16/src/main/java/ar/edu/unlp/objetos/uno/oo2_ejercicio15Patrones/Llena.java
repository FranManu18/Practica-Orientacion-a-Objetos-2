package ar.edu.unlp.objetos.uno.oo2_ejercicio15Patrones;

public class Llena extends Estado{

	public Llena(Excursion excursion) {
		super(excursion);
	}
	
	@Override
	public String getInformacion() {
		return "Nombre: "+this.getExcursion().getNombre() 
				+ " ,Costo: " + this.getExcursion().getCosto()
				+" ,Fecha de inicio: "+this.getExcursion().getFechaInicio()
				+" ,Fecha de fin: "+this.getExcursion().getFechaFin()
				+" ,Punto de encuentro: "+this.getExcursion().getPuntoEncuentro();
	}
	
	@Override
	public void inscribirUsuario(Usuario usuario) {
		this.getExcursion().agregarListaDeEspera(usuario);
	}
}
