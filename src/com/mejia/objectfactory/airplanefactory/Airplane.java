package com.mejia.objectfactory.airplanefactory;

import java.util.ArrayList;

public class Airplane {

    // ModelName, tailNumber, passengerCap, marketValue, gasTank, isFlying
    private String modelName;
    private String tailNumber;
    private ArrayList crew;
    private short passengerCap;
    private int marketValue;
    private double gasTank;
    private boolean isFlying;

    public Airplane(String modelName, String tailNumber, ArrayList crew, short passengerCap, int marketValue, double gasTank, boolean isFlying) {
        this.modelName = modelName;
        this.tailNumber = tailNumber;
        this.crew = crew;
        this.passengerCap = passengerCap;
        this.marketValue = marketValue;
        this.gasTank = gasTank;
        this.isFlying = isFlying;
    }

    public String getModelName() {
        return modelName;
    }

    public String getTailNumber() {
        return tailNumber;
    }

    public ArrayList getCrew() {
        return crew;
    }

    public short getPassengerCap() {
        return passengerCap;
    }

    public int getMarketValue() {
        return marketValue;
    }

    public double getGasTank() {
        return gasTank;
    }

    public boolean isFlying() {
        return isFlying;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("Model: '").append(modelName).append('\'');
        sb.append("\nTail Number: '").append(tailNumber).append('\'');
        sb.append("\nCrew Members: ").append(crew).append('\'');
        sb.append("\nPassenger Capacity: ").append(passengerCap);
        sb.append("\nPrice: ").append(marketValue);
        sb.append("\nFuel %=").append(gasTank*100).append("%");
        //(condition) ? (if true, do this) : (otherwise, do this)
        sb.append("\nThe plane is ").append(isFlying ? "35,000ft in the air!" : "on the ground");
        return sb.toString();
    }
}
