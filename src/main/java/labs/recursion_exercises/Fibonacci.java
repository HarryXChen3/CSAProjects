package labs.recursion_exercises;

import java.util.Scanner;

public class Fibonacci {
    public static int fib(final int n) {
        // base cases
        if (n == 0) return 0;
        else if (n == 1 || n == 2) return 1;
        // recursive calls
        else return fib(n - 1) + fib(n - 2);
    }

    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number up to which Fibonacci Sequence to print:");
        final int maxN = scanner.nextInt();

        System.out.printf("Fibonacci Sequence up to %d numbers%n", maxN);
        for (int i = 1; i <= maxN; i++)
            System.out.printf("%d ", fib(i));
    }
}
