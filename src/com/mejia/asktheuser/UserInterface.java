package com.mejia.asktheuser;
import com.mejia.asktheuser.Quiz;
import java.util.Scanner;

public class UserInterface {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        byte inches = quizFeetToInches();
        short question370X90 =  quiz370X90();
        int riPop = riPopulation();
        float ansFloat = quiz5div2();
        long usaPop = usaPopulation();
        double pi = pi();
        boolean broccoli = broccoli();
        String capital = capitalOfGA();

      //  Quiz finalQuiz = new Quiz(72, 29600, 1000000, 2.5, 329000000, 3.14159265, true, "Atlanta");

    }



        private static byte quizFeetToInches() {
        System.out.print("How many inches are in 6 feet?\nAnswer: ");
        byte userInches = scanner.nextByte();
        if (userInches == 72) {
            System.out.println("Correct");
        }   else
            System.out.println("Incorrect");
        scanner.nextLine();
        return userInches;
    }

    private static short quiz370X90() {
        System.out.print("What is 370 X 90?\nAnswer: ");
        short user370X90 = scanner.nextShort();
        if (user370X90 == 29_600) {
            System.out.println("Correct");
        } else
            System.out.println("Incorrect");
        scanner.nextLine();
        return user370X90;
    }

    private static int riPopulation() {
        System.out.print("What is the population of Rhode Island?\nAnswer: ");
        int userRIPopulation = scanner.nextInt();
        if (userRIPopulation >= 1_000_000 && userRIPopulation <= 1_100_000) {
            System.out.println("Correct");
        } else
            System.out.println("Incorrect");
        scanner.nextLine();
        return userRIPopulation;
    }

    private static float quiz5div2() {
        System.out.print("What is 5 divided by 2?\nAnswer: ");
        float user5div2 = scanner.nextFloat();
        if (user5div2 == 2.5F) {
            System.out.println("Correct");
        } else
            System.out.println("Incorrect");
        return user5div2;
    }

    private static long usaPopulation() {
        System.out.print("What is the population of the USA?\nAnswer: ");
        long userUSAPopulation = scanner.nextInt();
        if (userUSAPopulation >= 329_000_000 && userUSAPopulation <= 330_000_000) {
            System.out.println("Correct");
        } else
            System.out.println("Incorrect");
        scanner.nextLine();
        return userUSAPopulation;
    }

    private static double pi() {
        System.out.print("What is the value of PI (min 8 decimal points)?\nAnswer: ");
        double userPi = scanner.nextDouble();
        if (userPi >= 3.14159265 && userPi <= 3.14159265359) {
            System.out.println("Correct");
        } else
            System.out.println("Incorrect");
        scanner.nextLine();
        return userPi;
    }

    private static boolean broccoli() {
        System.out.print("Broccoli is green (true/false)?\nAnswer: ");
        boolean userBroccoli = scanner.nextBoolean();
        if (userBroccoli) {
            System.out.println("Correct");
        } else
            System.out.println("Incorrect");
        scanner.nextLine();
        return userBroccoli;
    }

    private static String capitalOfGA() {
        System.out.print("What is the capital of Georgia?\nAnswer: ");
        String userCapitalOfGA = scanner.nextLine();
        if (userCapitalOfGA.equals("Atlanta")) {
            System.out.println("Correct");
        } else
            System.out.println("Incorrect");
        return userCapitalOfGA;
    }
}




