package ar.edu.unlp.objetos.uno.oo2_ejercicio5refactoring;

public class Company {
    private final double price;
    private final double promotionRate;

    public Company(double price, double promotionRate) {
        this.price = price;
        this.promotionRate = promotionRate;
    }

    public double price() {
        return this.price;
    }

    public double promotionRate() {
        return this.promotionRate;
    }
    
    public double finalPrice() {
    	return this.price*this.promotionRate;
    }
}
