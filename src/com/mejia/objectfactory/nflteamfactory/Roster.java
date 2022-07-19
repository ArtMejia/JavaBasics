package com.mejia.objectfactory.nflteamfactory;

import java.util.ArrayList;

public class Roster extends NFLTeam {
    private String quarterback;
    private String wideReceiver;
    private String runningBack;

    public Roster(String city, String name, ArrayList players, long valuation, boolean isWinner, byte championships) {
        super(city, name, players, valuation, isWinner, championships);
    }

}
