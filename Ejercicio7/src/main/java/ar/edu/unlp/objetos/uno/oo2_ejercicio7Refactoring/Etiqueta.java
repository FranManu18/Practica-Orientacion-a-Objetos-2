package ar.edu.unlp.objetos.uno.oo2_ejercicio7Refactoring;

public abstract class Etiqueta {
	 protected String nombreProducto;
	 protected double precio;

	 public Etiqueta(String nombre, double precio) {
	    this.nombreProducto = nombre;
	    this.precio = precio;
	 }
	 
	 public abstract String getTitulo();
	 
	 public abstract void getPrecios();
	 
	 public void generar() {
		 System.out.println(this.getTitulo());
		 System.out.println("Producto: " + nombreProducto);
		 this.getPrecios();
		 System.out.println("-----------------------");
	 }
}

class EtiquetaSimple extends Etiqueta {
    public EtiquetaSimple(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public String getTitulo() {
    	return "--- ETIQUETA BÁSICA ---";
    }
    
    @Override
    public void getPrecios() {
    	 System.out.println("Precio: $" + precio);
    }
}

class EtiquetaDetalle extends Etiqueta {
    public EtiquetaDetalle(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public String getTitulo() {
    	return "--- ETIQUETA DETALLE ---";
    }
    
    @Override
    public void getPrecios() {
    	  System.out.println("Producto: " + nombreProducto);
          System.out.println("Precio sin imp.: $" + (precio * 0.79));
    }
}

