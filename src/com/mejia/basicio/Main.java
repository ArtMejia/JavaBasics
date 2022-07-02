package com.mejia.basicio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        personalQuestions();

    }

    private static void personalQuestions() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your first name?\nFirst Name: ");
        String userFirstName = scanner.nextLine();
        System.out.print("What is your last name?\nLast Name: ");
        String userLastName = scanner.nextLine();
        System.out.print("How old are you?\nAge: ");
        byte userAge = scanner.nextByte();
        scanner.nextLine();
        System.out.print("What city do you live in?\nCity: ");
        String userCity = scanner.nextLine();
        System.out.print("Do you own a car?\nTrue/False: ");
        boolean userCarStatus = scanner.nextBoolean();
        System.out.println("Hello " + userFirstName + " " + userLastName + ", nice to formally meet you. I see you are " + userAge + " years old and live in " + userCity + ", what a great city!");

    }
}
