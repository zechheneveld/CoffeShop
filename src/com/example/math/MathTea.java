package com.example.math;

import com.example.supplies.*;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import static com.example.ListArrays.optionsArray;
import static com.example.MainMenu.menu;

public class MathTea {
    public static void tea(){
        Calendar calendar = Calendar.getInstance();
        Date now = calendar.getTime();

        Scanner sc = new Scanner(System.in);

        boolean test = true;

        Beverage tea = new Tea();

        while(test) {
            System.out.println();
            System.out.println("Would you like to add anything else?");
            System.out.println("******** Options ********");
            System.out.println();
            optionsArray();
            String reply = sc.nextLine();
            if (reply.equalsIgnoreCase("extra espresso shot")) {
                tea = new EspressoShot(tea);
                System.out.println(tea.getDescription() + " " + "$"+tea.cost());
            }
            else if (reply.equalsIgnoreCase("mocha")) {
                tea = new Mocha(tea);
                System.out.println(tea.getDescription() + " " + "$"+tea.cost());
            }
            else if (reply.equalsIgnoreCase("lowfat milk")) {
                tea = new LowfatMilk(tea);
                System.out.println(tea.getDescription() + " " + "$"+tea.cost());
            }
            else if (reply.equalsIgnoreCase("milk")) {
                tea = new Milk(tea);
                System.out.println(tea.getDescription() + " " + "$"+tea.cost());
            }
            else if (reply.equalsIgnoreCase("cream and sugar")) {
                tea = new CreamAndSugar(tea);
                System.out.println(tea.getDescription() + " " + "$"+tea.cost());
            }
            else if (reply.equalsIgnoreCase("iced")) {
                tea = new Iced(tea);
                System.out.println(tea.getDescription() + " " + "$"+tea.cost());
            }
            else if (reply.equalsIgnoreCase("caramel")) {
                tea = new CaramelF(tea);
                System.out.println(tea.getDescription() + " " + "$"+tea.cost());
            }
            else if (reply.equalsIgnoreCase("hazelnut")) {
                tea = new HazelnutF(tea);
                System.out.println(tea.getDescription() + " " + "$"+tea.cost());
            }
            else if (reply.equalsIgnoreCase("vanilla")) {
                tea = new VanillaF(tea);
                System.out.println(tea.getDescription() + " " + "$"+tea.cost());
            } else {
                test = false;
                System.out.println(now);
                System.out.println("Your order is: " + tea.getDescription() + " : " + "$"+tea.cost());
                System.out.println("Would you like to add another drink?");
                String answer = sc.nextLine();
                if(answer.equalsIgnoreCase("yes")){
                    menu();
                }
            }
        }
    }
}
