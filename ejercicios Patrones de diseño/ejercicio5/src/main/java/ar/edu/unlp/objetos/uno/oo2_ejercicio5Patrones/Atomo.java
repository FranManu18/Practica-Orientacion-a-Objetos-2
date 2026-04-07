package ar.edu.unlp.objetos.uno.oo2_ejercicio5Patrones;

public class Atomo implements ElementoQuimico{
	private String nombre;
	private String simbolo;
	private int peso;
	private int carga;
	private boolean metal;
	
	
	
	public Atomo(String nombre, String simbolo, int peso, int carga, boolean metal) {
		super();
		this.nombre = nombre;
		this.simbolo = simbolo;
		this.peso = peso;
		this.carga = carga;
		this.metal = metal;
	}



	@Override
	public String formula() {
		return this.simbolo;
	}
	
	@Override
	public int pesoMolecular() {
		return this.peso;
	}
	
	@Override
	public int carga() {
		return this.carga;
	}
	
	@Override
	public boolean esValida() {
		return true;
	}
	
	
	public boolean isMetal() {
		return metal;
	}


	public Union crearUnion(ElementoQuimico otro,int cantidad) {
		Union union=new Union();
		union.agregar(otro, cantidad);
		return union;
	}
}
