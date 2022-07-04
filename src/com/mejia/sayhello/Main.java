package com.mejia.sayhello;
import com.mejia.challenge1.NameGenerator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // whatIsYourName();
           whatIsYourFullName();
        // NameGenerator nameGenerator = new NameGenerator();

    }

    public static void  whatIsYourName() {
        //1) Create a scanner instance
        Scanner scanner = new Scanner(System.in);
        //2) Ask the question
        System.out.print("Please enter your name?\nName: ");
        //3) Receive user input. trim() removes all trailing and extra spaces/white space
        String firstName = scanner.nextLine().trim();
        //4) Use the user input
        System.out.println("Hello, nice to meet you " + firstName + ". " + "I hope you have a great day!");
    }

    public static void whatIsYourFullName() {
        //1) Create a scanner instance
        Scanner scanner = new Scanner(System.in);
        //2) Ask the question
        System.out.print("What is your first name?\nFirst Name: ");
        //3) Receive user input
        String firstName = scanner.nextLine().trim().toUpperCase();
        //4) Ask another question
        System.out.print("What is your last name?\nLast Name: ");
        //5) Receive user input
        String lastName = scanner.nextLine().trim().toUpperCase();
        //6) Use both user inputs

        String fullName = new NameGenerator().generateFullName(firstName, lastName);

        System.out.println("Hello, nice to formally meet you " + firstName + " " + lastName);
        System.out.println(fullName);
    }
}
