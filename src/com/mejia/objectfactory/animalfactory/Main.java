package com.mejia.objectfactory.animalfactory;

import com.mejia.objectfactory.UI;

public class Main {

    public static void main(String[] args) {

//        private String species;
//        private short legs;
//        private boolean isTerrestrial;

        System.out.println("Animal Factory\n\n");

        String species = UI.readString("What is the name of the species?");
        short legs = UI.readShort("How many legs does this species have?", (short) 0, (short) 100);
        boolean terrestrial = UI.readBoolean("Is this animal terrestrial?");

        Animal generatedAnimal = new Animal(species, legs, terrestrial);
        System.out.println(generatedAnimal);

    }
}
