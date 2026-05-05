package ar.edu.unlp.objetos.uno.oo2_ejercicio21Patrones;

import java.util.List;

public class HomeWeatherAdapter{
	private HomeWeatherStation station;

	public HomeWeatherAdapter(HomeWeatherStation station) {
		super();
		this.station = station;
	}
	
	public double getTemperaturaFarhenheit() {
		return station.getTemperatura();
	}
	
	public double fToC(double f) {
		return Math.round((f-32)/1.8);
	}
	
	public double tempAcelsius() {
		return fToC(this.getTemperaturaFarhenheit());
	}
	
	
	public double getPresion() {
		return station.getPresion();
	}
	
	public double getRadiacionSolar() {
		return station.getRadiacionSolar();
	}
	
	public List<Double>getTemperaturas(){
		return station.getTemperaturas();
	}
	
	public double getPromedio(boolean enCelsius) {
		double promedio=station.getTemperaturas().stream()
					.mapToDouble(t->t).sum() / station.getTemperaturas().size();
		if(enCelsius) {
			return fToC(promedio);
		}
		return promedio;
	}
	
	public double getTempMin(boolean enCelsius) {
		double min=station.getTemperaturas().stream()
				.mapToDouble(t->t).min().orElse(0);
		if(enCelsius) {
			return fToC(min);
		}
		return min;
	}
	
	public double getTempMax(boolean enCelsius) {
		double max=station.getTemperaturas().stream()
				.mapToDouble(t->t).max().orElse(0);
		if(enCelsius) {
			return fToC(max);
		}
		return max;
	}
	
	
	public String displayData(boolean enCelsius) {
		if(enCelsius) {
			return "Temperatura C: " + Math.round(this.tempAcelsius()) +";"+
				   	  " Presión atmosf: " + Math.round( station.getPresion()) +";"+
				   	  " Radiación solar: " + Math.round( station.getRadiacionSolar())+";";
		}
		return station.displayData();
	}

}
