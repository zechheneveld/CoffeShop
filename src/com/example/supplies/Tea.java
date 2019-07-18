package com.example.supplies;

public class Tea extends Beverage {

    public Tea(){
        this.description = "Tea";
    }

    @Override
    public double cost(){
        return 2.00;
    }
}
