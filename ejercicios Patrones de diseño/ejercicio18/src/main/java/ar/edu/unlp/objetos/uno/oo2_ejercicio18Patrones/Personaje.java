package ar.edu.unlp.objetos.uno.oo2_ejercicio18Patrones;

public class Personaje {
	private String nombre;
	private Armadura armadura;
	private Arma arma;
	private String habilidad;
	private int vida;
	
	public Personaje() {
		this.vida=100;
	}
	
	

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public void setArmadura(Armadura armadura) {
		this.armadura = armadura;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}

	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}
	
	public void restarVida(int cantidad) {
		this.vida-=cantidad;
	}
	
	public boolean puedeCombatir() {
		return this.vida>0;
	}
	
	public void combatir(Personaje p2) {
		if(this.puedeCombatir() && p2.puedeCombatir()) {
			p2.restarVida(this.arma.dañoContra(p2.getArmadura()));
		}
	}

	public Armadura getArmadura() {
		return armadura;
	}
	
	
	
	
}
