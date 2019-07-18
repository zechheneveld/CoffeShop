package com.example;

public class ListArrays {

    public static void drinkArray() {

        String [] drinks = {"Espresso - $2.00","Coffee - $1.75","Tea - $2.00","Lemonade - $3.00"};
        for(int i = 0; i < drinks.length; i++){
            System.out.println(drinks[i]);
        }

    }

    public static void optionsArray(){
        String[] options = {"Extra espresso shot (1.00)","Mocha (.50)","Lowfat milk (.75)","Milk (.75)","Cream and Sugar (no charge)",
                "Iced (-.25)","Flavoring - Caramel (.50)","Flavoring - Hazelnut (.50)","Flavoring - Vanilla (.50)"};
        for(int i = 0; i < options.length; i++) {
            System.out.println(options[i]);
        }
    }
}
