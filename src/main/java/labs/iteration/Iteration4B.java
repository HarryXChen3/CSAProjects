package labs.iteration;

import java.util.Scanner;

public class Iteration4B {
    public static void main(final String[] args) {
        final Scanner inputScanner = new Scanner(System.in);
        while (true) {
            final int input;
            while (true) {
                System.out.println("Enter a 4+ digit positive number:");
                final int nextIn = inputScanner.nextInt();
                if (nextIn >= 1000) {
                    input = nextIn;
                    break;
                } else
                    System.out.println("That number doesn't satisfy the requirements");
            }

            System.out.println(new StringBuilder(String.valueOf(input)).reverse());
            System.out.println("Do you want to run this again? (y/n)");

            inputScanner.nextLine();
            if (!"y".equalsIgnoreCase(inputScanner.nextLine())) {
                System.out.println("Thanks for using this program!");
                break;
            }
        }
    }
}
