package com.mejia.objectfactory.airplanefactory;

import com.mejia.objectfactory.UI;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Airplane> hanger = new ArrayList<>();

        System.out.println("Airplane Factory\n\n");

        while (true) {
            System.out.println("\nMENU\n" + "_".repeat(20));
            System.out.println("1) Create A Plane");
            System.out.println("2) Show Hanger");
            System.out.println("3) Exit The Program");
            byte menuChoice = UI.readByte("Choose an option", (byte) 1, (byte) 3);

            
            if (menuChoice == 3) break;
            else if (menuChoice == 2) {
                if (hanger.size() == 0) {
                    System.out.println("\nNo Airplanes in Hanger\n");
                    continue;
                }
                //Show Hanger
                System.out.println("-".repeat(20));
                System.out.println("\nAIRPLANE HANGER");
                for (int i = 0; i < hanger.size(); i++) {
                    System.out.println(i+1 + ")\n" + hanger.get(i) + "\n");
                }
                System.out.println("-".repeat(20));
                continue;
            }
            //if the code gets to this point, the user will create a plane
            Airplane generatedAirplane = createAirplane();
            hanger.add(generatedAirplane);
            System.out.println("\n\nCREATED AIRPLANE:\n" + generatedAirplane);
        }

        System.out.println("\nThank you for using the program...");

    }

    private static Airplane createAirplane() {
        String modelName = UI.readString("What is the model name?");
        String tailNumber = UI.readString("What is the tail number?");
        short passengerCap = 100;//UI.readShort("What is the passenger capacity?", (short) 0, (short) 300);
        int marketValue = 1_000_000_000;//UI.readInt("What is the planes market value?", 0, 1_000_000_000);
        double gasTank = .5;//UI.readDouble("What is the current gas tank percent (as a decimal)?", 0, 1);
        boolean isFlying = false;//UI.readBoolean("Is the plane flying?");

        return new Airplane(modelName, tailNumber, passengerCap, marketValue, gasTank, isFlying);
    }
}


