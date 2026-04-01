package ar.edu.unlp.objetos.uno.oo2_ejercicio5refactoring;

import java.time.LocalDate;

public class Product {
	private TimePeriod timePeriod;

	public Product(TimePeriod timePeriod) {
		super();
		this.timePeriod = timePeriod;
	}
	
	public LocalDate startDate() {
        return this.timePeriod.start();
    }

    public LocalDate endDate() {
        return this.timePeriod.end();
    }

	public TimePeriod getTimePeriod() {
		return timePeriod;
	}
    
 
}
