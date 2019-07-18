package com.example.supplies;

public class EspressoShot extends AddOns {

    Beverage beverage;

    public EspressoShot(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + " with an extra shot of espresso";
    }
    public double cost(){
        return 1.00 + beverage.cost();
    }
}
