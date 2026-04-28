package ar.edu.unlp.objetos.uno.oo2_ejercicio14Patrones;

public class ConfiguracionConcreteBuilder implements ConfiguracionBuilder{
	private Configuracion confi;
	
	@Override
	public void reset() {
		confi=new Configuracion();
	}
	
	@Override
	public  void setProcesador(Componente procesador) {
		confi.agregarComponente(procesador);;
	}
	
	@Override
	public void setRam(Componente ram) {
		confi.agregarComponente(ram);
	}
	
	@Override
	public void setDisco(Componente disco) {
		confi.agregarComponente(disco);
	}
	
	@Override
	public void setTarjeta(Componente tarjeta) {
		confi.agregarComponente(tarjeta);
	}
	
	@Override
	public void setGabinete(Componente gabinete) {
		confi.agregarComponente(gabinete);
	}
	
	@Override
	public void setFuente(Componente fuente) {
		confi.agregarComponente(fuente);
	}
	
	@Override
	public Configuracion obtenerResultado() {
		return confi;
	}
}
