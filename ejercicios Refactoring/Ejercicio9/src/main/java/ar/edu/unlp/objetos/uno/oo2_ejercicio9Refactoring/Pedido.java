package ar.edu.unlp.objetos.uno.oo2_ejercicio9Refactoring;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class Pedido {
	private Cliente cliente;
	private List<Producto>productos;
	private FormaDePago formaPago;
	
	public Pedido(Cliente cliente, List<Producto> productos, FormaDePago formaPago) {
		this.cliente = cliente;
		this.productos = productos;
		this.formaPago = formaPago;
	}
	
	public double getCostoTotal() {
		double costoProductos=this.productos.stream()
				.mapToDouble(p->p.getPrecio())
				.sum();
		return descuentoAntiguedad(costoProductos+formaPago.extra(costoProductos));
	}
	
	public double descuentoAntiguedad(double valor) {
		if(this.cliente.getAntiguedad()>5) {
			return valor*0.9;
		}
		return valor;
	}
	
}


