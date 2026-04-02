package ar.edu.unlp.objetos.uno.oo2_ejercicio6.Refactoring;

import java.text.MessageFormat;

public class Supermercado {
	public void notificarPedido(long nroPedido,Cliente cliente) {
		String notificacion=MessageFormat.format("Estimado cliente, se le informa que hemos recibido su pedido con número {0}, el cual será enviado a la dirección {1}",
				new Object[] {nroPedido,cliente.getDireccionFormateada()});
		System.out.println(notificacion);
	}
}
