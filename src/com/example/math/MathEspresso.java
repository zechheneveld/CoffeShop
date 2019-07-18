package com.example.math;

import com.example.supplies.*;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import static com.example.ListArrays.optionsArray;
import static com.example.MainMenu.menu;

public class MathEspresso {

    public static void espresso(){

        Calendar calendar = Calendar.getInstance();
        Date now = calendar.getTime();

        Scanner sc = new Scanner(System.in);

        boolean test = true;

        // Test for Espresso

            Beverage espresso = new Espresso();
            while (test) {
                System.out.println();
                System.out.println("Would you like to add anything else?");
                System.out.println("******** Options ********");
                System.out.println();
                optionsArray();

                String reply = sc.nextLine();
                if (reply.equalsIgnoreCase("extra espresso shot")) {
                    espresso = new EspressoShot(espresso);
                    System.out.println(espresso.getDescription() + " " + "$" + espresso.cost());
                } else if (reply.equalsIgnoreCase("mocha")) {
                    espresso = new Mocha(espresso);
                    System.out.println(espresso.getDescription() + " " + "$" + espresso.cost());
                } else if (reply.equalsIgnoreCase("lowfat milk")) {
                    espresso = new LowfatMilk(espresso);
                    System.out.println(espresso.getDescription() + " " + "$" + espresso.cost());
                } else if (reply.equalsIgnoreCase("milk")) {
                    espresso = new Milk(espresso);
                    System.out.println(espresso.getDescription() + " " + "$" + espresso.cost());
                } else if (reply.equalsIgnoreCase("cream and sugar")) {
                    espresso = new CreamAndSugar(espresso);
                    System.out.println(espresso.getDescription() + " " + "$" + espresso.cost());
                } else if (reply.equalsIgnoreCase("iced")) {
                    espresso = new Iced(espresso);
                    System.out.println(espresso.getDescription() + " " + "$" + espresso.cost());
                } else if (reply.equalsIgnoreCase("caramel")) {
                    espresso = new CaramelF(espresso);
                    System.out.println(espresso.getDescription() + " " + "$" + espresso.cost());
                } else if (reply.equalsIgnoreCase("hazelnut")) {
                    espresso = new HazelnutF(espresso);
                    System.out.println(espresso.getDescription() + " " + "$" + espresso.cost());
                } else if (reply.equalsIgnoreCase("vanilla")) {
                    espresso = new VanillaF(espresso);
                    System.out.println(espresso.getDescription() + " " + "$" + espresso.cost());
                } else {
                    test = false;
                    System.out.println(now);
                    System.out.println("Your order is: " + espresso.getDescription() + " : " + "$" + espresso.cost());
                    System.out.println("Would you like to add another drink?");
                    String answer = sc.nextLine();
                    if(answer.equalsIgnoreCase("yes")){
                        menu();
                    }
                }
            }
        }
}
