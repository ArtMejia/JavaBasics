package com.mejia.objectfactory;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class UI {
    // one method for each type of data
    // all static methods
    // take in a question, and return a piece of data of the specific type required

    private static final Scanner scanner = new Scanner(System.in);

//  String, short, double, int , boolean, float, long, byte, char

//    public static String readString(String question) {
//        System.out.print(question);
//        String input = scanner.nextLine();
//        if (input.trim().equals("")) {
//            return readString(question);
//        } else {
//            return input;
//        }
//    }

//    public static String readString(String question) {
//        String input;
//        do {
//            System.out.println(question);
//            input = scanner.nextLine();
//        } while (input.trim().equals(""));
//            return input;
//    }

    public static String readString(String question) {
        while (true) {
            System.out.print(question + "\nInput: ");
            String input = scanner.nextLine().trim();
            if (!input.equals("")) {
                return input;
            } else
                System.out.println("\nYou can not leave the input blank");
        }
    }

    public static char readChar(String question) {
        while (true) {
            System.out.print(question + "\nInput: ");
            String input = scanner.nextLine().trim();
            if (input.length() == 1) {
                return input.charAt(0);
            } else if (input.equals("")) {
                System.out.println("\nYou can not leave the input blank");
            } else
                System.out.println("\nYou must only input one character");
        }
    }

    public static boolean readBoolean(String question) {
        while (true) {
            try {
                System.out.print(question + "\n(true/false) ");
                boolean input = scanner.nextBoolean();
                scanner.nextLine();
                return input;
            } catch (Exception exception) {
                System.out.println("Input must be true or false");
                scanner.nextLine();
            }
        }
    }

    public static int readInt(String question, int min, int max) {
        while (true) {
            try {
                System.out.print(question + "\n(" + min + " - " + max + "): ");
                int input = scanner.nextInt();
                scanner.nextLine();
                if (input <= max && input >= min) {
                    return input;
                } else {
                    System.out.println("input must be between " + min + " and " + max);
                }
            } catch (Exception exception) {
                System.out.println("input must be between " + min + " and " + max);
                scanner.nextLine();
            }
        }
    }

    public static short readShort(String question, short min, short max) {
        while (true) {
            try {
                System.out.print(question + "\n(" + min + " - " + max + "): ");
                short input = scanner.nextShort();
                scanner.nextLine();
                if (input <= max && input >= min) {
                    return input;
                } else {
                    System.out.println("input must be between " + min + " and " + max);
                }
            } catch (Exception exception) {
                System.out.println("input must be between " + min + " and " + max);
                scanner.nextLine();
            }
        }
    }

    public static double readDouble(String question, double min, double max) {
        while (true) {
            try {
                System.out.print(question + "\n(" + min + " - " + max + "): ");
                double input = scanner.nextDouble();
                scanner.nextLine();
                if (input <= max && input >= min) {
                    return input;
                } else {
                    System.out.println("input must be between " + min + " and " + max);
                }
            } catch (Exception exception) {
                System.out.println("input must be between " + min + " and " + max);
                scanner.nextLine();
            }
        }
    }

    public static long readLong(String question, long min, long max) {
        while (true) {
            try {
                System.out.print(question + "\n(" + min + " - " + max + "): ");
                long input = scanner.nextLong();
                scanner.nextLine();
                if (input <= max && input >= min) {
                    return input;
                } else {
                    System.out.println("input must be between " + min + " and " + max);
                }
            } catch (Exception exception) {
                System.out.println("input must be between " + min + " and " + max);
                scanner.nextLine();
            }
        }
    }

    public static byte readByte(String question, byte min, byte max) {
        while (true) {
            try {
                System.out.print(question + "\n(" + min + " - " + max + "): ");
                byte input = scanner.nextByte();
                scanner.nextLine();
                if (input <= max && input >= min) {
                    return input;
                } else {
                    System.out.println("input must be between " + min + " and " + max);
                }
            } catch (Exception exception) {
                System.out.println("input must be between " + min + " and " + max);
                scanner.nextLine();
            }
        }
    }

    public static float readFloat(String question, float min, float max) {
        while (true) {
            try {
                System.out.print(question + "\n(" + min + " - " + max + "): ");
                float input = scanner.nextFloat();
                scanner.nextLine();
                if (input <= max && input >= min) {
                    return input;
                } else {
                    System.out.println("input must be between " + min + " and " + max);
                }
            } catch (Exception exception) {
                System.out.println("input must be between " + min + " and " + max);
                scanner.nextLine();
            }
        }
    }
    //TODO: public static ArrayList<String> readListOfStrings (question, min, max)

    //TODO: public static String selectFromListOfString (question, ArrayList<String>)
//new
    public static boolean readYesOrNo(String question) {
        while (true) {
            String userInput = readString(question + "\n(y/n): ");
            char selection = userInput.toLowerCase().charAt(0);
            if (selection == 'y') return true;
            if (selection == 'n') return false;
            System.out.println("Input must be y or n");
        }
    }

    public static ArrayList<String> readListOfStrings(String question, byte min, byte max) {
        ArrayList<String> responses = new ArrayList<>();
        System.out.println(question);
        System.out.println("Please enter at least " + min + " inputs and the most " + max + " inputs.");
        for (int i = 0; i < max; i++) {
            String userInput = readString("\n(" + (i + 1) + "/" + max + ")");
            responses.add(userInput);
            if (responses.size() == max) {
                System.out.println("Maximum number of inputs have been entered");
            } else if (responses.size() >= min && !readYesOrNo("Would you like to continue?")) break;
        }
        System.out.println("Your inputs have been recorded");
        return responses;
    }

    public static void main(String[] args) {
        ArrayList<String> responses = readListOfStrings("test", (byte) 2, (byte) 4);
        System.out.println(responses);
    }
}


