package com.example.supplies;

public class LowfatMilk extends AddOns {

    Beverage beverage;

    public LowfatMilk(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + " with Lowfat Milk";
    }
    public double cost(){
        return 0.75 + beverage.cost();
    }
}
