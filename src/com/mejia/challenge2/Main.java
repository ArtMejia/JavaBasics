package com.mejia.challenge2;

public class Main {
    public static void main(String[] args) {

//        String Car1 = nameCar.generateCar("Chevy", "Camaro 2SS", 10000, (float) 0.10 );
//        String Car2 = nameCar.generateCar("Ford", "Mustang", 30000, (float) 0.50);
//        String Car3 = nameCar.generateCar("Dodge", "Hellcat", 100, (float) 0.90);

//        System.out.println(Car1);
//        System.out.println(Car2);
//        System.out.println(Car3);

//        System.out.println(createCar("Chevy", "Camaro 2SS", 10000, (float) 0.10));
//        System.out.println(createCar("Ford", "Mustang", 30000, (float) 0.50));
//        System.out.println(createCar("Dodge", "Hellcat", 100, (float) 0.90));

        Car car1 = new Car("Chevy", "Camaro 2SS", 10000, .10f);
        Car car2 = new Car("Ford", "Mustang", 30000, .50f);
        Car car3 = new Car("Dodge", "Hellcat", 100, .9f);

//        System.out.println(car1.make + " " + car1.model);
//        System.out.println(car2.make + " " + car2.model);
//        System.out.println(car3.make + " " + car3.model);

//        Car[] carsArray = {car1, car2, car3};
//        for (Car car : carsArray) {
//            System.out.println(car.make + " " + car.model);

//        Car[] carsArray = {car1, car2, car3};
//        for (Car car : carsArray) {
//            System.out.println(car.getMake() + " " + car.getModel());
//
//        }

        Car[] carsArray = {car1, car2, car3};
        for (int i = 0; i < carsArray.length; i++) {
            System.out.println(carsArray[i]);
        }
    }


//    private static String createCar(String make, String model, int mileage, float gasTankPercentage) {
//        return  "Make:" + make + " Model:" + model + " Mileage:" + mileage + " GTP:" + gasTankPercentage;
//    }

    //private static Integer randomCar(int)

}
