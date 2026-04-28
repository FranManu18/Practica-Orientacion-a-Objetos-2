package ar.edu.unlp.objetos.uno.oo2_ejercicio14Patrones;

import java.time.LocalDate;

public class PresupuestoDirector {
	private ConfiguracionBuilder builder;
	private Catalogo catalogo;
	
	public PresupuestoDirector(ConfiguracionBuilder builder, Catalogo catalogo) {
		super();
		this.builder = builder;
		this.catalogo = catalogo;
	}
	
	public Presupuesto crearPresupuestoBasico(String nombreCliente) {
		builder.reset();
		builder.setProcesador(catalogo.getComponente("Procesador Basico"));
		builder.setRam(catalogo.getComponente("8 GB"));
		builder.setDisco(catalogo.getComponente("HDD 500 GB"));
		builder.setGabinete(catalogo.getComponente("Gabinete Estandar"));
		return new Presupuesto(builder.obtenerResultado(),nombreCliente,LocalDate.now());
	}
	
	public Presupuesto crearPresupuestoIntermedio(String nombreCliente) {
		builder.reset();
		builder.setProcesador(catalogo.getComponente("Procesador Intermedio"));
		builder.setRam(catalogo.getComponente("16 GB"));
		builder.setDisco(catalogo.getComponente("SSD 500GB"));
		builder.setTarjeta(catalogo.getComponente("GTX 1650"));
		builder.setGabinete(catalogo.getComponente("Gabinete Intermedio"));
		builder.setFuente(catalogo.getComponente("Fuente 800 w"));
		return new Presupuesto(builder.obtenerResultado(),nombreCliente,LocalDate.now());
	}
	
	public Presupuesto crearPresupuestoGamer(String nombreCliente) {
		builder.reset();
		builder.setProcesador(catalogo.getComponente("Procesador Gamer"));
		builder.setProcesador(catalogo.getComponente("Pad termico"));
		builder.setProcesador(catalogo.getComponente("Cooler"));
		builder.setRam(catalogo.getComponente("32 GB"));
		builder.setRam(catalogo.getComponente("32GB"));
		builder.setDisco(catalogo.getComponente("SSD 500GB"));
		builder.setDisco(catalogo.getComponente("SSD 1TB"));
		builder.setTarjeta(catalogo.getComponente("RTX 4090"));
		builder.setGabinete(catalogo.getComponente("Gabinete Gamer"));
		double consumoTotal=builder.obtenerResultado().getComponentes().stream().mapToDouble(c->c.getConsumo()).sum();
		double consumoFuente=Math.ceil(consumoTotal+consumoTotal*0.5);
		builder.setFuente(catalogo.getComponente("Fuente "+consumoFuente+" w"));
		return new Presupuesto(builder.obtenerResultado(),nombreCliente,LocalDate.now());
	}
}
