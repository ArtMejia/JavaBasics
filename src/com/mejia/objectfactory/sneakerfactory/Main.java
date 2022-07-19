package com.mejia.objectfactory.sneakerfactory;

import com.mejia.objectfactory.UI;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList collection = new ArrayList<>();

        System.out.println("Sneaker Factory!");

        while (true) {

            System.out.println("\nMENU\n" + "_".repeat(20));
            System.out.println("1. Create a Sneaker");
            System.out.println("2. View Collection");
            System.out.println("0. Exit");
            byte menuChoice = UI.readByte("Select Option", (byte)0, (byte)2);

            if (menuChoice == 0) break;
            else if (menuChoice == 2) {
                if (collection.size() == 0) {
                    System.out.println("Collection is empty");
                    continue;
                }


            }


        }
    }
}
