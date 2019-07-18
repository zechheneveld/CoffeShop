package com.example.math;

import com.example.supplies.Beverage;
import com.example.supplies.Lemonade;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import static com.example.MainMenu.menu;

public class MathLemonade {

    public static void lemonade(){
        Calendar calendar = Calendar.getInstance();
        Date now = calendar.getTime();
        Scanner sc = new Scanner(System.in);
        Beverage lemonade = new Lemonade();
        System.out.println(now);
        System.out.println("Your order is: " + lemonade.getDescription() + " : " + "$"+lemonade.cost());
        System.out.println("Would you like to add another drink?");
        String answer = sc.nextLine();
        if(answer.equalsIgnoreCase("yes")){
            menu();
        }
    }
}
