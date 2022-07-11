package com.mejia.objectfactory.nflteamfactory;

import com.mejia.objectfactory.UI;

public class Main {
    public static void main(String[] args) {
//        private String city;
//        private String name;
//        private long valuation;
//        private boolean winner;
//        private byte championships;

        System.out.println("NFL Team Factory");

        String city = UI.readString("What city is the team from?");
        String name = UI.readString("What is the team name?");
        long valuation = UI.readLong("How much is the team worth?", 0, 4_000_000_000L);
        boolean winner = UI.readBoolean("Has the team won a championship?");
        byte championships = UI.readByte("How many championships has the team won?", (byte )0, (byte )55);

        NFLTeam generatedNFLTeam = new NFLTeam(city, name, valuation, winner, championships);
        System.out.println(generatedNFLTeam);
    }
}
