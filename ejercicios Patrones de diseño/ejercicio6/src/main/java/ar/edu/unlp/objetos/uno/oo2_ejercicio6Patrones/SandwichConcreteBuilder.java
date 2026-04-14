package ar.edu.unlp.objetos.uno.oo2_ejercicio6Patrones;

public class SandwichConcreteBuilder implements SandwichBuilder{
	private Sandwich sandwich;
	
	@Override
	public void reset() {
		sandwich=new Sandwich();
	}
	
	@Override
	public void setPan(String nombre,double precio) {
		sandwich.agregarComponente(new Componente(nombre,precio));
	}
	
	@Override
	public void setAderezo(String nombre,double precio) {
		sandwich.agregarComponente(new Componente(nombre,precio));
	}
	
	@Override
	public void setPrincipal(String nombre,double precio) {
		sandwich.agregarComponente(new Componente(nombre,precio));
	}
	
	@Override
	public void setAdicional(String nombre,double precio) {
		sandwich.agregarComponente(new Componente(nombre,precio));
	}
	
	@Override
	public Sandwich obtenerResultado() {
		return sandwich;
	}
}
