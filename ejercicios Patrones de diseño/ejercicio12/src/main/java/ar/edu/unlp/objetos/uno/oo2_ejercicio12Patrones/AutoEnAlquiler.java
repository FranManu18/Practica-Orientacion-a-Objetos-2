package ar.edu.unlp.objetos.uno.oo2_ejercicio12Patrones;

public class AutoEnAlquiler {
	private double precioPorDia;
	private int cantidadPlazas;
	private String marca;
	private PoliticaDeCancelacion politica;
	
	public AutoEnAlquiler(double precioPorDia, int cantidadPlazas, String marca, PoliticaDeCancelacion politica) {
		super();
		this.precioPorDia = precioPorDia;
		this.cantidadPlazas = cantidadPlazas;
		this.marca = marca;
		this.politica = politica;
	}

	public double getPrecioPorDia() {
		return precioPorDia;
	}
	
	
	
	public void setPolitica(PoliticaDeCancelacion politica) {
		this.politica = politica;
	}

	public double montoAReembolsar(int dias,double montoAPagar) {
		return politica.montoAReembolsar(dias, montoAPagar);
	}
}
