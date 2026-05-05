package ar.edu.unlp.objetos.uno.oo2_ejercicio21Patrones;

public class DecoratorPromedio extends DecoratorWeatherStation{

	
	public DecoratorPromedio(DecoratorWeatherStation anterior, HomeWeatherAdapter adapter) {
		super(anterior, adapter);
	}

	@Override
	public String obtenerInfo() {
		return "Promedio: "+(int)this.getAdapter().getPromedio(this.esCelsius());
	}
}
