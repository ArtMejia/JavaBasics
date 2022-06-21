package com.mejia.challenge1;

public class Main {
    public static void main(String[] args) {
        String firstName = "Artenio";
        String lastName = "Mejia";

        String fullName = createFullName(firstName, lastName);

        NameGenerator nameGen = new NameGenerator();

        String generateFullName = nameGen.generateFullName("John", "Doe");

        System.out.println(fullName);

        System.out.println(createFullName("First", "Last"));

        System.out.println(generateFullName);

    }

    private static String createFullName(String firstname, String lastname) {
        return firstname + " " + lastname;
    }
}
