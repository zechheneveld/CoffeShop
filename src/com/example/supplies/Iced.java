package com.example.supplies;

public class Iced extends AddOns {

    Beverage beverage;

    public Iced(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return "Iced " + beverage.getDescription();
    }
    public double cost(){
        return (-0.25) + beverage.cost();
    }
}
