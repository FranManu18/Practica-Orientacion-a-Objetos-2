package ar.edu.unlp.objetos.uno.oo2_ejercicio6Patrones;

public class Main {

	public static void main(String[] args) {
		SandwichConcreteBuilder builder = new SandwichConcreteBuilder();
        SandwichDirector director = new SandwichDirector(builder);

        director.construirClasico();
        Sandwich clasico = builder.obtenerResultado();
        System.out.println("Precio Clásico: $" + clasico.calcularPrecio());

        director.construirVegano();
        Sandwich vegano = builder.obtenerResultado();
        System.out.println("Precio Vegano: $" + vegano.calcularPrecio());

	}

}
