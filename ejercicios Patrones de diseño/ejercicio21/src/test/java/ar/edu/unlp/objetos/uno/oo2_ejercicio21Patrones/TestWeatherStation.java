package ar.edu.unlp.objetos.uno.oo2_ejercicio21Patrones;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class TestWeatherStation {
	@Test
	public void testWeatherStation() {
		List<Double>temperaturas=new ArrayList<>();
		HomeWeatherStation home=new HomeWeatherStation(86,1008,200,temperaturas);
		HomeWeatherAdapter adapter=new HomeWeatherAdapter(home);
		DecoratorFarenheit fahrenheit=new DecoratorFarenheit(null,adapter);
		assertEquals("Temperatura F: 86; Presión atmosf: 1008; Radiación solar: 200;",fahrenheit.displayData());
		
		DecoratorCelsius celsius=new DecoratorCelsius(null,adapter);
		assertEquals("Temperatura C: 30; Presión atmosf: 1008; Radiación solar: 200;",celsius.displayData());
		
		DecoratorPromedio promedioCelsius=new DecoratorPromedio(celsius,adapter);
		assertEquals("Temperatura C: 30; Presión atmosf: 1008; Radiación solar: 200; Promedio: 30;",promedioCelsius.displayData());
		
		DecoratorPromedio promedioFahrenheit=new DecoratorPromedio(fahrenheit,adapter);
		assertEquals("Temperatura F: 86; Presión atmosf: 1008; Radiación solar: 200; Promedio: 86;",promedioFahrenheit.displayData());
	
		temperaturas.add(80.6);
		temperaturas.add(89.6);
		DecoratorMinYmax minYmax=new DecoratorMinYmax(promedioCelsius,adapter);
		assertEquals("Temperatura C: 30; Presión atmosf: 1008; Radiación solar: 200; Promedio: 30; Mínimo: 27 Máximo: 32;",minYmax.displayData());
	
		DecoratorMinYmax minYmax2=new DecoratorMinYmax(celsius,adapter);
		assertEquals("Temperatura C: 30; Presión atmosf: 1008; Radiación solar: 200; Mínimo: 27 Máximo: 32;",minYmax2.displayData());
	
		DecoratorPromedio promedio2=new DecoratorPromedio(minYmax2,adapter);
		assertEquals("Temperatura C: 30; Presión atmosf: 1008; Radiación solar: 200; Mínimo: 27 Máximo: 32; Promedio: 30;",promedio2.displayData());
	}
}
