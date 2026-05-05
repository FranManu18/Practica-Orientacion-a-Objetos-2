package ar.edu.unlp.objetos.uno.oo2_ejercicio21Patrones;

public class DecoratorMinYmax extends DecoratorWeatherStation{

	public DecoratorMinYmax(DecoratorWeatherStation anterior, HomeWeatherAdapter adapter) {
		super(anterior, adapter);
	}

	@Override
	public String obtenerInfo() {
		return "Mínimo: "+(int)this.getAdapter().getTempMin(this.esCelsius())+
				" Máximo: "+(int)this.getAdapter().getTempMax(this.esCelsius());
	}
}
