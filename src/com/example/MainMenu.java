package com.example;

import java.util.Scanner;

import static com.example.ListArrays.drinkArray;
import static com.example.math.MathCoffee.coffee;
import static com.example.math.MathEspresso.espresso;
import static com.example.math.MathLemonade.lemonade;
import static com.example.math.MathTea.tea;

public class MainMenu {

    public static void greeting(){
        System.out.println("***** Welcome to Caffinator Coffee Shop *****");
        System.out.println();
        System.out.println("***** Please start by entering your name *****");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("***** Welcome " + name + "! *****");
    }

    public static void menu(){
        Scanner sc = new Scanner(System.in);

        System.out.println("**** Please select which drink you would like ****");
        System.out.println();
        drinkArray();
        String str = sc.nextLine();
        // Test for Espresso
        if(str.equalsIgnoreCase("espresso")){
            espresso();
        }

        // Test for Coffee
        if(str.equalsIgnoreCase("coffee")){
            coffee();
        }

        // Test for Tea
        if(str.equalsIgnoreCase("tea")){
            tea();
        }

        // Test for Lemonade
        if(str.equalsIgnoreCase("lemonade")){
            lemonade();
        }
    }
}
