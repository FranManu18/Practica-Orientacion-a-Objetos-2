package ar.edu.unlp.objetos.uno.oo2_ejercicio6Patrones;

public class SandwichDirector {
	private SandwichBuilder builder;

	public SandwichDirector(SandwichBuilder builder) {
		super();
		this.builder = builder;
	}
	
	public void construirClasico() {
        builder.reset();
        builder.setPan("Brioche", 100);
        builder.setAderezo("Mayonesa", 20);
        builder.setPrincipal("Ternera", 300);
        builder.setAdicional("Tomate", 80);
    }

    public void construirVegano() {
        builder.reset();
        builder.setPan("Integral", 100);
        builder.setAderezo("Salsa Criolla", 20);
        builder.setPrincipal("Milanesa de Gírgolas", 500);
    }

    public void construirVegetariano() {
        builder.reset();
        builder.setPan("Semillas", 120);
        builder.setPrincipal("Provoleta", 200);
        builder.setAdicional("Berenjenas", 100);
    }

    public void construirSinTacc() {
        builder.reset();
        builder.setPan("Chipá", 150);
        builder.setAderezo("Tártara", 18);
        builder.setPrincipal("Pollo", 250);
        builder.setAdicional("Verduras", 200);
    }
}
