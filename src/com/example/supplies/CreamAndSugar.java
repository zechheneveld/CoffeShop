package com.example.supplies;

public class CreamAndSugar extends AddOns {

    Beverage beverage;

    public CreamAndSugar(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + " with Cream and Sugar";
    }
    public double cost(){
        return beverage.cost();
    }
}
