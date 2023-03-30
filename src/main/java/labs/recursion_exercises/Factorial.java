package labs.recursion_exercises;

public class Factorial {
    final static long maxN = 10;

    public static long fact(final long n) {
        // base case
        if (n == 0) return 1;
        // recursive call
        else return n * fact(n - 1);
    }

    public static void main(final String[] args) {
        for (long i = 0; i <= maxN; i++)
            System.out.printf("Factorial of %d using recursion: %d%n", i, fact(i));
    }
}
