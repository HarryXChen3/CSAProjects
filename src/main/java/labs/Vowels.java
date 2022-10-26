package labs;

import java.io.BufferedReader;
import java.util.Scanner;

public class Vowels {
    public static void main(final String[] args) {
        final Scanner inputScanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a word or q to quit:");

            final String input = inputScanner.nextLine();
            if (input.equalsIgnoreCase("q"))
                break;

            final long vowels = input.chars().filter(character -> "aeiou".contains((char)character + "")).count();
            System.out.printf("There are %d vowels in %s%n", vowels, input);
        }
    }
}
