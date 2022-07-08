package com.mejia.objectfactory.companyfactory;

import com.mejia.objectfactory.UI;

public class Main {
    public static void main(String[] args) {
//        private String name;
//        private short yearEstablished;
//        private double marketCap;

        System.out.println("Company Factory\n\n");

        String name = UI.readString("What is the company name?");
        short yearEstablished = UI.readShort("In what year was the company established?", (short) 0, (short) 2022);
        double marketCap = UI.readDouble("What is the companies market cap value (in billions)?", 0, 3000.00);

        Company generatedCompany = new Company(name, yearEstablished, marketCap);
        System.out.println(generatedCompany);

    }
}
