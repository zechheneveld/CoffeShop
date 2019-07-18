package com.example;

import java.util.Scanner;

import static com.example.MainMenu.greeting;
import static com.example.MainMenu.menu;


public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        greeting();
        menu();

    }
}
