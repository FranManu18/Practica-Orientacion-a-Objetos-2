package ar.edu.unlp.objetos.uno.oo2_ejercicio18Patrones;

public class PersonajeConcreteBuilder implements PersonajeBuilder{
	private Personaje personaje;

	public PersonajeConcreteBuilder(Personaje personaje) {
		super();
		this.personaje = personaje;
	}
	
	@Override
	public void reset() {
		personaje=new Personaje();
	}
	
	@Override
	public void asignarArmadura(Armadura armadura) {
		personaje.setArmadura(armadura);
	}
	
	@Override
	public void asignarArma(Arma arma) {
		personaje.setArma(arma);
	}
	
	@Override
	public  void asignarHabilidad(String habilidad) {
		personaje.setHabilidad(habilidad);
	}
	
	@Override
	public Personaje obtenerResultado() {
		return personaje;
	}
}
