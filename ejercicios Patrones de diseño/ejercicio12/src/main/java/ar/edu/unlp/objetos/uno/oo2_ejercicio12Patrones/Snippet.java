package ar.edu.unlp.objetos.uno.oo2_ejercicio12Patrones;

import java.time.LocalDate;

public class Snippet {

	public static void main(String[] args) {
		AutoEnAlquiler auto=new AutoEnAlquiler(100,4,"Ford",new Flexible());
		Reserva reserva=new Reserva(5,LocalDate.of(2026, 02, 14),new Usuario("Francisco"),auto);
		System.out.println("Monto Flexible: "+reserva.montoAReembolsar(LocalDate.of(2026, 02, 10)));
		auto.setPolitica(new Moderada());
		System.out.println("Monto Moderado1: "+reserva.montoAReembolsar(LocalDate.of(2026, 02, 10)));
		System.out.println("Monto Moderado1: "+reserva.montoAReembolsar(LocalDate.of(2026, 02, 01)));
	}

}
