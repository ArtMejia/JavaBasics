package com.mejia.objectfactory.nflteamfactory;

import com.mejia.objectfactory.UI;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<NFLTeam> league = new ArrayList<>();

        System.out.println("NFL Team Factory");

        while (true) {
            System.out.println("\nMENU\n" + "_".repeat(20));
            System.out.println("1) Create A NFL Team");
            System.out.println("2) Show League");
            System.out.println("3) Exit The Program");
            byte menuChoice = UI.readByte("Choose an option", (byte) 1, (byte) 3);

            if (menuChoice == 3) break;
            else if (menuChoice == 2) {
                if (league.size() == 0) {
                    System.out.println("\nNo Teams in the League\n");
                    continue;
                }
                // Show league
                System.out.println("-".repeat(20));
                System.out.println("\nTEAM LEAGUE");
                for (int i = 0; i < league.size(); i++) {
                    System.out.println(i + 1 + ")\n" + league.get(i) + "\n");
                }
                System.out.println("-".repeat(20));
                continue;
            }

            NFLTeam generatedNFLTeam = createNFLTeam();
            league.add(generatedNFLTeam);
            System.out.println("\n\nCREATED NFL TEAM:\n" + generatedNFLTeam);
        }

        System.out.println("Thank you for using the program...");
    }

    private static NFLTeam createNFLTeam() {
        String city = UI.readString("What city is the team from?");
        String name = UI.readString("What is the team name?");
        long valuation = UI.readLong("How much is the team worth?", 0, 4_000_000_000L);
        boolean isWinner = UI.readBoolean("Has the team won a championship?");
        byte championships = UI.readByte("How many championships has the team won?", (byte )0, (byte )55);

        return new NFLTeam(city, name, valuation, isWinner, championships);
    }

}
