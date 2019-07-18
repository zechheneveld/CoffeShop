package com.example.supplies;

public class Lemonade extends Beverage {

    public Lemonade(){
        this.description = "Lemonade";
    }

    @Override
    public double cost(){
        return 3.00;
    }
}
