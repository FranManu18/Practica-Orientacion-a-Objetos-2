package ar.edu.unlp.objetos.uno.oo2_ejercicio6.Refactoring;

public class ItemCarrito {
	private Producto producto;
	private int cantidad;
	
	public Producto getProducto() {
		return producto;
	}

	public int getCantidad() {
		return cantidad;
	}
	
	public double subTotal() {
		return this.producto.getPrecio()*this.cantidad;
	}
}
