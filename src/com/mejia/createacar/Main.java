package com.mejia.createacar;

import com.mejia.challenge2.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        createACar();
        createACarObject();

//        Car userCar = new Car(userInputMake, userInputModel, 0, 0);
//        System.out.println("Your new car:\n\n" + userCar);
    }


    public static void createACar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello welcome to the Car Creator\n\n");
        System.out.print("ENTER CAR MAKE\nMake: ");
        String userInputMake = scanner.nextLine();
        System.out.print("ENTER CAR MODEL\nModel: ");
        String userInputModel = scanner.nextLine();
        System.out.print("ENTER CAR YEAR\nYear: ");
        String userInputYear = scanner.nextLine();
        System.out.print("ENTER OWNER\nOwner: ");
        String userInputOwner = scanner.nextLine();
        System.out.println(userInputOwner + " owns the " + userInputYear + " " + userInputMake + " " + userInputModel);
    }

    public static String createACarObject() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER CAR MAKE\nMake: ");
        String userInputMake = scanner.nextLine();
        System.out.print("ENTER CAR MODEL\nModel: ");
        String userInputModel = scanner.nextLine();
        System.out.print("ENTER CAR MILEAGE\nMileage: ");
        int userInputMileage = scanner.nextInt();
        System.out.println("ENTER CAR GAS TANK PERCENTAGE\nPercentage: ");
        float userInputGasTankPercentage = scanner.nextFloat();

        Car userCar = new Car(userInputMake, userInputModel, userInputMileage, userInputGasTankPercentage);
        {
            return "Make: " + userInputMake + " Model: " + userInputModel + " Mileage: " + userInputMileage + " Gas Tank: " + userInputGasTankPercentage;
        }

    }

}
