package com.mejia.challenge2;

public class Main {
    public static void main(String[] args) {

        Car nameCar = new Car();

        String Car1 = nameCar.generateCar("Chevy", "Camaro 2SS", 10000, (float) 0.10 );
        String Car2 = nameCar.generateCar("Ford", "Mustang", 30000, (float) 0.50);
        String Car3 = nameCar.generateCar("Dodge", "Hellcat", 100, (float) 0.90);

        System.out.println(Car1);
        System.out.println(Car2);
        System.out.println(Car3);

//        System.out.println(createCar("Chevy", "Camaro 2SS", 10000, (float) 0.10));
//        System.out.println(createCar("Ford", "Mustang", 30000, (float) 0.50));
//        System.out.println(createCar("Dodge", "Hellcat", 100, (float) 0.90));
    }


    private static String createCar(String make, String model, int mileage, float gasTankPercentage) {
        return  make + " " + model + " " + mileage + " " + gasTankPercentage;
    }
}
