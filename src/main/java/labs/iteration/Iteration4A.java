package labs.iteration;

import java.util.Scanner;

public class Iteration4A {
    private static int sumN(final int n) {
        if (n < 10)
            return (n * (n + 1) / 2);
        int d = (int)(Math.log10(n));
        int[] a = new int[d+1];
        a[0] = 0; a[1] = 45;
        for (int i = 2; i <= d; i++)
            a[i] = a[i-1] * 10 + 45 *
                    (int)(Math.ceil(Math.pow(10, i-1)));

        int p = (int)(Math.ceil(Math.pow(10, d)));
        int msd = n / p;

        return (msd * a[d] + (msd * (msd - 1) / 2) * p +
                msd * (1 + n % p) + sumN(n % p));
    }

    public static void main(final String[] args) {
        //Part 1
        final int ct = (new Scanner(System.in)).nextInt();
        for (int i = 0; i < ct; i++)
            System.out.printf("%d I love Computer Science!!%n", i + 1);

        //Part 2
        System.out.printf("Printed this message %d times.", ct);
        //Part 3
        System.out.printf("The sum of the numbers from 1 to %d is %d", ct, sumN(ct));
    }
}
