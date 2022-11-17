package labs.linebreaker;

import java.util.Scanner;

public class LineBreakerRunner {
    public static void main(final String[] args) {
        final Scanner inputScanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a phrase to split or (q) to quit");
            final String input = inputScanner.nextLine();
            if ("q".equalsIgnoreCase(input))
                break;

            System.out.println("Enter number of characters to split by:");
            final int n_chars = inputScanner.nextInt();

            System.out.println(LineBreaker.breakLines(input, n_chars));
            inputScanner.nextLine();
        }
    }
}
