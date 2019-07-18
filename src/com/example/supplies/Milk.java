package com.example.supplies;

public class Milk extends AddOns {

    Beverage beverage;

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + " with Milk";
    }
    public double cost(){
        return 0.75 + beverage.cost();
    }
}
