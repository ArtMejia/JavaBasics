package com.mejia.objectfactory.nflteamfactory;

public class NFLTeam {
    //String city, String name, long valuation, byte championships
    private String city;
    private String name;
    private long valuation;
    private byte championships;

    public NFLTeam(String city, String name, long valuation, byte championships) {
        this.city = city;
        this.name = name;
        this.valuation = valuation;
        this.championships = championships;
    }

    public String getCity() {
        return city;
    }

    public String getName() {
        return name;
    }

    public long getValuation() {
        return valuation;
    }

    public byte getChampionships() {
        return championships;
    }

    @Override
    public String toString() {
        return "NFLTeam{" +
                "city='" + city + '\'' +
                ", name='" + name + '\'' +
                ", valuation=" + valuation +
                ", championships=" + championships +
                '}';
    }
}

