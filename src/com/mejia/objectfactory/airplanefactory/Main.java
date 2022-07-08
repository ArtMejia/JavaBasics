package com.mejia.objectfactory.airplanefactory;

import com.mejia.objectfactory.UI;

public class Main {
    public static void main(String[] args) {

//        private String modelName;
//        private String tailNumber;
//        private short passengerCap;
//        private int marketValue;
//        private double gasTank;
//        private boolean isFlying;

        System.out.println("Airplane Factory\n\n");

        String modelName = UI.readString("What is the model name?");
        String tailNumber = UI.readString("What is the tail number?");
        short passengerCap = UI.readShort("What is the passenger capacity?", (short) 0, (short) 300);
        int marketValue = UI.readInt("What is the planes market value?", 0, 1_000_000_000);
        double gasTank = UI.readDouble("What is the current gas tank percent (as a decimal)?", 0, 1);
        boolean isFlying = UI.readBoolean("Is the plane flying?");

        Airplane generatedPlane = new Airplane(modelName, tailNumber, passengerCap, marketValue, gasTank, isFlying);

        System.out.println(generatedPlane);

    }
}


