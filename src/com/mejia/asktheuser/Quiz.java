package com.mejia.asktheuser;

public class Quiz {

    private byte inches;
    private short question370X90;
    private int riPop;
    private float ansFloat;
    private long usaPop;
    private double pi;
    private boolean broccoli;
    private String capital;

    public Quiz(byte inches, short question370X90, int riPop, float ansFloat, long usaPop, double pi, boolean broccoli, String capital) {
        this.inches = inches;
        this.question370X90 = question370X90;
        this.riPop = riPop;
        this.ansFloat = ansFloat;
        this.usaPop = usaPop;
        this.pi = pi;
        this.broccoli = broccoli;
        this.capital = capital;
    }

    public byte getInches() {
        return inches;
    }

    public void setInches(byte inches) {
        this.inches = inches;
    }

    public short getQuestion370X90() {
        return question370X90;
    }

    public void setQuestion370X90(short question370X90) {
        this.question370X90 = question370X90;
    }

    public int getRiPop() {
        return riPop;
    }

    public void setRiPop(int riPop) {
        this.riPop = riPop;
    }

    public float getAnsFloat() {
        return ansFloat;
    }

    public void setAnsFloat(float ansFloat) {
        this.ansFloat = ansFloat;
    }

    public long getUsaPop() {
        return usaPop;
    }

    public void setUsaPop(long usaPop) {
        this.usaPop = usaPop;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public boolean isBroccoli() {
        return broccoli;
    }

    public void setBroccoli(boolean broccoli) {
        this.broccoli = broccoli;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    @Override
    public String toString() {
        return "Quiz{" +
                "inches=" + inches +
                ", question370X90=" + question370X90 +
                ", riPop=" + riPop +
                ", ansFloat=" + ansFloat +
                ", usaPop=" + usaPop +
                ", pi=" + pi +
                ", broccoli=" + broccoli +
                ", capital='" + capital + '\'' +
                '}';
    }
}
