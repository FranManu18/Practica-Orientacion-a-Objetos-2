package ar.edu.unlp.objetos.uno.oo2_ejercicio18Patrones;

public class PersonajeDirector {
	private PersonajeConcreteBuilder builder;

	public PersonajeDirector(PersonajeConcreteBuilder builder) {
		super();
		this.builder = builder;
	}
	
	public Personaje crearGuerrero(String nombre) {
		builder.reset();
		builder.asignarArmadura(new DeAcero());
		builder.asignarArma(new Espada());
		builder.asignarHabilidad("Combate cuerpo a cuerpo");
		builder.obtenerResultado().setNombre(nombre);
		return builder.obtenerResultado();
	}
	
	public Personaje crearMago(String nombre) {
		builder.reset();
		builder.asignarArmadura(new DeCuero());
		builder.asignarArma(new Baston());
		builder.asignarHabilidad("Magia y combate a distancia");
		builder.obtenerResultado().setNombre(nombre);
		return builder.obtenerResultado();
	}
	
	public Personaje crearArquero(String nombre) {
		builder.reset();
		builder.asignarArmadura(new DeCuero());
		builder.asignarArma(new Arco());
		builder.asignarHabilidad("Disparo de flechas");
		builder.obtenerResultado().setNombre(nombre);
		return builder.obtenerResultado();
	}
	
	public Personaje crearThoor(String nombre) {
		builder.reset();
		builder.asignarArmadura(new DeHierro());
		builder.asignarArma(new Martillo());
		builder.asignarHabilidad("Lanzar rayos y combate a distancia");
		builder.obtenerResultado().setNombre(nombre);
		return builder.obtenerResultado();
	}
}
