package com.example.math;

import com.example.supplies.*;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import static com.example.ListArrays.optionsArray;
import static com.example.MainMenu.menu;

public class MathCoffee {
    public static void coffee(){
        Calendar calendar = Calendar.getInstance();
        Date now = calendar.getTime();

        Scanner sc = new Scanner(System.in);
        Beverage coffee = new Coffee();
        boolean test = true;

        while(test) {
            System.out.println();
            System.out.println("Would you like to add anything else?");
            System.out.println("******** Options ********");
            System.out.println();
            optionsArray();
            String reply = sc.nextLine();

            if (reply.equalsIgnoreCase("extra espresso shot")) {
                coffee = new EspressoShot(coffee);
                System.out.println(coffee.getDescription() + " " + "$"+coffee.cost());
            }
            else if (reply.equalsIgnoreCase("mocha")) {
                coffee = new Mocha(coffee);
                System.out.println(coffee.getDescription() + " " + "$"+coffee.cost());
            }
            else if (reply.equalsIgnoreCase("lowfat milk")) {
                coffee = new LowfatMilk(coffee);
                System.out.println(coffee.getDescription() + " " + "$"+coffee.cost());
            }
            else if (reply.equalsIgnoreCase("milk")) {
                coffee = new Milk(coffee);
                System.out.println(coffee.getDescription() + " " + "$"+coffee.cost());
            }
            else if (reply.equalsIgnoreCase("cream and sugar")) {
                coffee = new CreamAndSugar(coffee);
                System.out.println(coffee.getDescription() + " " + "$"+coffee.cost());
            }
            else if (reply.equalsIgnoreCase("iced")) {
                coffee = new Iced(coffee);
                System.out.println(coffee.getDescription() + " " + "$"+coffee.cost());
            }
            else if (reply.equalsIgnoreCase("caramel")) {
                coffee = new CaramelF(coffee);
                System.out.println(coffee.getDescription() + " " + "$"+coffee.cost());
            }
            else if (reply.equalsIgnoreCase("hazelnut")) {
                coffee = new HazelnutF(coffee);
                System.out.println(coffee.getDescription() + " " + "$"+coffee.cost());
            }
            else if (reply.equalsIgnoreCase("vanilla")) {
                coffee = new VanillaF(coffee);
                System.out.println(coffee.getDescription() + " " + "$"+coffee.cost());
            } else {
                test = false;
                System.out.println(now);
                System.out.println("Your order is: " + coffee.getDescription() + " : " + "$"+coffee.cost());
                System.out.println("Would you like to add another drink?");
                String answer = sc.nextLine();
                if(answer.equalsIgnoreCase("yes")){
                    menu();
                }
            }
        }
    }
}
