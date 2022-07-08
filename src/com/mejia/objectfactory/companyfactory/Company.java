package com.mejia.objectfactory.companyfactory;

public class Company {
    //Fields: name (String), yearEstablished (short), marketCap (double)
    private String name;
    private short yearEstablished;
    private double marketCap;

    public Company(String name, short yearEstablished, double marketCap) {
        this.name = name;
        this.yearEstablished = yearEstablished;
        this.marketCap = marketCap;
    }

    public String getName() {
        return name;
    }

    public short getYearEstablished() {
        return yearEstablished;
    }

    public double getMarketCap() {
        return marketCap;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", yearEstablished=" + yearEstablished +
                ", marketCap=" + marketCap +
                '}';
    }
}
