package com.mejia.objectfactory.nflteamfactory;

import com.mejia.objectfactory.UI;

import java.util.ArrayList;

public class NFLTeam {
    //String city, String name, long valuation, boolean isWinner, byte championships
    private String city;
    private String name;
    private ArrayList players;
    private long valuation;
    private boolean isWinner;
    private byte championships;

    public NFLTeam(String city, String name, ArrayList players, long valuation, boolean isWinner, byte championships) {
        this.city = city;
        this.name = name;
        this.players = players;
        this.valuation = valuation;
        this.isWinner = isWinner;
        this.championships = championships;
    }

    public String getCity() {
        return city;
    }

    public String getName() {
        return name;
    }

    public ArrayList getPlayers() {return players; }

    public long getValuation() {
        return valuation;
    }

    public boolean isWinner() {
        return isWinner;
    }

    public byte getChampionships() {
        return championships;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("City: '").append(city).append('\'');
        sb.append("\nName: '").append(name).append('\'');
        sb.append("\nPlayers: '").append(players).append('\'');
        sb.append("\nWorth: $").append(valuation);
        //(condition) ? (if true, do this) : (otherwise, do this)
        sb.append("\nWon SuperBowl: ").append(isWinner ? "Yes! Team owns a Vince Lombardi Trophy!" : "Not yet!");
        sb.append("\nSuperBowl Wins: ").append(championships);
        return sb.toString();
    }
}

