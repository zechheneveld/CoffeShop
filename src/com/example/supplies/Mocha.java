package com.example.supplies;

public class Mocha extends AddOns {

    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + " with Mocha";
    }
    public double cost(){
        return 0.50 + beverage.cost();
    }
}
