package ar.edu.unlp.objetos.uno.oo2_ejercicio21Patrones;

import java.util.List;

public class HomeWeatherStation implements WeatherData{
	private double temperatura;
	private double presion;
	private double radiacionSolar;
	private List<Double>temperaturas;
	
	public HomeWeatherStation(double temperatura, double presion, double radiacionSolar, List<Double> temperaturas) {
		super();
		this.temperatura = temperatura;
		this.presion = presion;
		this.radiacionSolar = radiacionSolar;
		this.temperaturas = temperaturas;
		temperaturas.add(temperatura);
	}
	
	@Override
	public double getTemperatura() {
		return temperatura;
	}
	@Override
	public double getPresion() {
		return presion;
	}
	@Override
	public double getRadiacionSolar() {
		return radiacionSolar;
	}
	@Override
	public List<Double> getTemperaturas() {
		return temperaturas;
	}
	
	@Override
	public String displayData() {
		return "Temperatura F: " + (long)this.getTemperatura() +";"+
			   	  " Presión atmosf: " + (long)this.getPresion() +";"+
			   	  " Radiación solar: " + (long)this.getRadiacionSolar()+";";
	}
	
	
}
