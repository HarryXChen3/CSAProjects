package labs.iteration;

import java.util.Scanner;

public class Iteration4C {
    private static long countChar(final String input, final char character) {
        return input.chars().filter(c -> Character.toLowerCase(c) == character).count();
    }

    public static void main (final String[] args) {
        final Scanner inputScanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the sentence or phrase (or quit to quit):");
            final String input = inputScanner.nextLine();
            if ("quit".equalsIgnoreCase(input))
                break;

            System.out.printf("Number of spaces: %d%n", countChar(input, ' '));
            System.out.printf("Number of a's: %d%n", countChar(input, 'a'));
            System.out.printf("Number of e's: %d%n", countChar(input, 'e'));
            System.out.printf("Number of s's: %d%n", countChar(input, 's'));
            System.out.printf("Number of t's: %d%n", countChar(input, 't'));
        }
    }
}
