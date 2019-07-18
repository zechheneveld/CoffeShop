package com.example.supplies;

public class HazelnutF extends AddOns {

        Beverage beverage;

        public HazelnutF(Beverage beverage){
            this.beverage = beverage;
        }

        public String getDescription(){
            return "Hazelnut " + beverage.getDescription();
        }
        public double cost(){
            return 0.50 + beverage.cost();
        }
}
