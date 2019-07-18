package com.example.supplies;

public abstract class Beverage {

    String description = "Not a drink";

    public String getDescription(){
        return description;
    }
    public abstract double cost();
}
