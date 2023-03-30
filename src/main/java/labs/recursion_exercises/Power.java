package labs.recursion_exercises;

import java.util.Scanner;

public class Power {
    public static int pow(final int a, final int n) {
        // base case
        if (n == 0)
            return 1;

        // recursive call
        return a * pow(a, n-1);
    }

    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter power expression (ex. 2^5)");
            final String inputLine = scanner.nextLine();
            final String[] split = inputLine.split("\\^");
            final int base = Integer.parseInt(split[0]);
            final int power = Integer.parseInt(split[1]);

            System.out.printf("%d to the power %d := %d%n", base, power, pow(base, power));
        }
    }
}
