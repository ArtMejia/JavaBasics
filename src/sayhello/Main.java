package sayhello;
import com.mejia.challenge1.NameGenerator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // whatIsYourName();
        whatIsYourFullName();
        NameGenerator nameGenerator = new NameGenerator();

    }

    public static void  whatIsYourName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String firstName = scanner.nextLine().trim();
        System.out.println("Hello, nice to meet you " + firstName);
    }

    public static void whatIsYourFullName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your first name: ");
        String firstName = scanner.nextLine().trim();
        System.out.print("What is your last name: ");
        String lastName = scanner.nextLine().trim();
        System.out.println("Hello, nice to formally meet you " + firstName + " " + lastName);
    }

}
