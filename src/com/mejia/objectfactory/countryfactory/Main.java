package com.mejia.objectfactory.countryfactory;

import com.mejia.objectfactory.UI;

public class Main {
    public static void main(String[] args) {
//        private String name;
//        private int population;
//        private String capital;

        System.out.println("Country Factory\n\n");

        String name = UI.readString("What is the name of the country");
        int population = UI.readInt("What is the population of the country?", 0, 2_000_000_000);
        String capital = UI.readString("What is the capital of the country?");

        Country generatedCountry = new Country(name, population, capital);
        System.out.println(generatedCountry);

    }
}
