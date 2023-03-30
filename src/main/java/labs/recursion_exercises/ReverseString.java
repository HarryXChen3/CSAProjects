package labs.recursion_exercises;

import java.util.Scanner;

public class ReverseString {
    public static String reverse(final String str) {
        // base case
        if ((str == null) || (str.length() <= 1))
            return str;

        // recursive call
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter string to reverse:");
            final String input = scanner.nextLine();

            System.out.printf("original string: %s, reversed string %s%n", input, reverse(input));
        }
    }
}
