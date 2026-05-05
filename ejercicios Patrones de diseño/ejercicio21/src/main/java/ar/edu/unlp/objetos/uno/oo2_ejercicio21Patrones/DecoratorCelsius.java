package ar.edu.unlp.objetos.uno.oo2_ejercicio21Patrones;

public class DecoratorCelsius extends DecoratorWeatherStation{
	
	public DecoratorCelsius(DecoratorWeatherStation anterior, HomeWeatherAdapter adapter) {
		super(anterior, adapter);
	}

	@Override
	public String obtenerInfo() {
		return this.getAdapter().displayData(true);
	}
	
	@Override
	public boolean esCelsius() {
		return true;
	}
}
