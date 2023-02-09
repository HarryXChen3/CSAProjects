package labs.matrix_2d_fancyword;

import java.util.Scanner;

import static labs.matrix_2d_fancyword.FancyWord.displayHourglass;
import static labs.matrix_2d_fancyword.FancyWord.hourglass;

public class FancyWordRunner {
    final static Scanner inputScanner = new Scanner(System.in);

    public static void main(final String[] args) {
        System.out.println("Input expected number of words");
        final int amt = inputScanner.nextInt();

        System.out.println("Input words");
        inputScanner.nextLine();

        final String[] input = new String[amt];
        for (int i = 0; i < amt; i++)
            input[i] = inputScanner.nextLine();

        for (final String nextString: input) {
            displayHourglass(hourglass(nextString));
            System.out.println();
        }
    }
}
