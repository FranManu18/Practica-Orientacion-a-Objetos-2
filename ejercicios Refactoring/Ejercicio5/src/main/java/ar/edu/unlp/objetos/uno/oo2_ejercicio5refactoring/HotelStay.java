package ar.edu.unlp.objetos.uno.oo2_ejercicio5refactoring;

import java.time.LocalDate;

public class HotelStay extends Product {
    private double cost;
    private Hotel hotel;

    public HotelStay(double cost, TimePeriod timePeriod, Hotel hotel) {
    	super(timePeriod);
        this.cost = cost;
        this.hotel = hotel;
    }
    
    

    public double getCost() {
		return cost;
	}



	public void setCost(double cost) {
		this.cost = cost;
	}


    public double priceFactor() {
    	double quote=this.cost;
        return quote / this.price();
    }

    public double price() {
        return this.getTimePeriod().duration() * this.hotel.discountedNights();
    }
}
