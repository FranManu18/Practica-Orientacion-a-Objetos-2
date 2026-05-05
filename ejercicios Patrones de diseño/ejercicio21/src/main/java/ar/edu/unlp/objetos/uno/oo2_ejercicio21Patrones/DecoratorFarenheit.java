package ar.edu.unlp.objetos.uno.oo2_ejercicio21Patrones;

public class DecoratorFarenheit extends DecoratorWeatherStation{

	public DecoratorFarenheit(DecoratorWeatherStation anterior, HomeWeatherAdapter adapter) {
		super(anterior, adapter);
	}
	
	@Override
	public String obtenerInfo() {
		return this.getAdapter().displayData(false);
	}
	
	@Override
	public boolean esCelsius() {
		return false;
	}
}
