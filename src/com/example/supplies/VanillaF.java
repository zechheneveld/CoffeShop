package com.example.supplies;

public class VanillaF extends AddOns {

    Beverage beverage;

    public VanillaF(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return "Vanilla " + beverage.getDescription();
    }
    public double cost(){
        return 0.50 + beverage.cost();
    }
}
