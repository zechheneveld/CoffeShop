package com.example.supplies;

public class CaramelF extends AddOns {

    Beverage beverage;

    public CaramelF(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return "Caramel " + beverage.getDescription();
    }
    public double cost(){
        return 0.50 + beverage.cost();
    }
}
