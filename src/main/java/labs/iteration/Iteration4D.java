package labs.iteration;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Iteration4D {
    private static final int HOURS_PER_DAY = 24;

    public static void main(final String[] args) {
        final Scanner inputScanner = new Scanner(System.in);
        System.out.println("\nTemperature Readings for 24 Hour Period\n");

        final int[] temps = new int[HOURS_PER_DAY];
        for (int i = 0; i < HOURS_PER_DAY; i++) {
            System.out.printf("Enter temp reading at %d hour(s): ", i);
            temps[i] = inputScanner.nextInt();
        }

        IntStream.range(0, temps.length)
                .reduce((a, b) -> temps[a] < temps[b] ? b : a)
                .ifPresent(i -> System.out.printf("The max temp was: %d at hour %d%n", temps[i], i));

        IntStream.range(0, temps.length)
                .reduce((a, b) -> temps[a] > temps[b] ? b : a)
                .ifPresent(i -> System.out.printf("The min temp was: %d at hour %d%n", temps[i], i));
    }
}
