package com.mejia.challenge2;

public class Car {

    private String make;
    private String model;
    private int mileage;
    private float gasTankPercentage;

    public Car(String make, String model, int mileage, float gasTankPercentage) {
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.gasTankPercentage = gasTankPercentage;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public float getGasTankPercentage() {
        return gasTankPercentage;
    }


    @Override
    public String toString() {
        return "Make: " + make + " Model: " + model + " Mileage: " + mileage + " Gas Tank: " + gasTankPercentage;
    }

}

