package ar.edu.unlp.objetos.uno.oo2_ejercicio5refactoring;

import java.time.LocalDate;

public class CarRental extends Product {
    private double cost;
    private TimePeriod timePeriod;
    private Company company;

    public CarRental(double cost, TimePeriod timePeriod, Company company) {
        super(timePeriod);
    	this.cost = cost;
        this.company = company;
    }
    
    

    public double getCost() {
		return cost;
	}

    

	public void setCost(double cost) {
		this.cost = cost;
	}


    public double price() {
        return this.company.finalPrice();
    }

    public double cost() {
        return this.cost;
    }
}
