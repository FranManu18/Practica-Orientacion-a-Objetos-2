package ar.edu.unlp.objetos.uno.oo2_ejercicio21Patrones;

import java.util.List;

public abstract class DecoratorWeatherStation implements WeatherData{
	private DecoratorWeatherStation anterior;
	private HomeWeatherAdapter adapter;
	
	public DecoratorWeatherStation(DecoratorWeatherStation anterior, HomeWeatherAdapter adapter) {
		super();
		this.anterior = anterior;
		this.adapter = adapter;
	}

	@Override
	public double getTemperatura() {
		return adapter.getTemperaturaFarhenheit();
	}
	@Override
	public double getPresion() {
		return adapter.getPresion();
	}
	@Override
	public double getRadiacionSolar() {
		return adapter.getRadiacionSolar();
	}
	@Override
	public List<Double>getTemperaturas(){
		return adapter.getTemperaturas();
	}
	
	public boolean esCelsius() {
		if(anterior!=null) {
			return anterior.esCelsius();
		}
		return false;
	}
	
	@Override
	public String displayData() {
		if(anterior!=null) {
			return anterior.displayData()+ " " + this.obtenerInfo()+";";
		}
		return this.obtenerInfo();
	}
	
	public abstract String obtenerInfo();


	public HomeWeatherAdapter getAdapter() {
		return adapter;
	}
	
	
	
	
}
