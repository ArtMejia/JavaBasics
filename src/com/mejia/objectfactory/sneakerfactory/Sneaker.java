package com.mejia.objectfactory.sneakerfactory;

public class Sneaker {
    private String brand;
    private String model;
    private byte size;
    private boolean isNew;
    private short price;
    private int serialNumber;

    public Sneaker(String brand, String model, byte size, boolean isNew, short price, int serialNumber) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.isNew = isNew;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public byte getSize() {
        return size;
    }

    public void setSize(byte size) {
        this.size = size;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public short getPrice() {
        return price;
    }

    public void setPrice(short price) {
        this.price = price;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sneaker{");
        sb.append("brand='").append(brand).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", size=").append(size);
        sb.append(", isNew=").append(isNew);
        sb.append(", price=").append(price);
        sb.append(", serialNumber=").append(serialNumber);
        sb.append('}');
        return sb.toString();
    }
}
