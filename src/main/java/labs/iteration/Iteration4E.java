package labs.iteration;

import java.util.Scanner;

public class Iteration4E {
    private static void printPyramid(final int[][] p, final int n) {
        for (int[] ints : p) {
            for (int j = 0; j < ints.length; j++) {
                System.out.printf("%s%d ", " ".repeat(j == 0 ? (2 * (n - 1 - (ints.length / 2))) : 0), ints[j]);
            }
            System.out.println();
        }
    }

    private static void patternA(final int n) {
        for (int i = n; i >= 1; i--) {
            System.out.println("*".repeat(i));
        }
    }

    private static void patternB(final int n) {
        for (int i = 1; i <= n; i++) {
            System.out.printf("%s%s%n", " ".repeat(n - i), "*".repeat(i));
        }
    }

    private static void patternC(final int n) {
        for (int i = n; i >= 1; i--) {
            System.out.printf("%s%s%n", " ".repeat(n - i), "*".repeat(i));
        }
    }

    private static void patternD(final int n) {
        final int hl = ((n / 2) + 1);
        for (int i = 0; i < hl; i++)
            System.out.println("    *********".substring(i, hl + 2 * i));
        System.out.println("*".repeat(n));
        for (int i = hl; i > 0; i--)
            System.out.println("     **********".substring(i - 1, hl + (2 * i) - 3));
    }

    public static void main(final String[] args) {
        final Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter number of lines:");
        final int numLines = inputScanner.nextInt();

        final int[][] p1 = new int[numLines][];
        for (int i = 0; i < numLines; i++) {
            final int n = (1 + (2 * i));
            final int[] p1_i = new int[n];
            for (int j = 0; j < n; j++) {
                final int x = ((i + 1) - j);
                p1_i[j] = (x > 0 ? x : ((i + 1) + (j - (2 * i))));
            }

            p1[i] = p1_i;
        }

        System.out.println("Pyramid 1");
        printPyramid(p1, numLines);

        final int[][] p2 = new int[numLines][];
        for (int i = 0; i < numLines; i++) {
            final int n = (1 + (2 * i));
            final int[] p2_i = new int[n];
            for (int j = 0; j < n; j++) {
                final int x = (int)Math.pow(2, j);
                p2_i[j] = (x > Math.pow(2, i) ? ((int)Math.pow(2, i - (j - i))) : x);
            }

            p2[i] = p2_i;
        }

        System.out.println("Pyramid 2");
        printPyramid(p2, numLines);

        System.out.println();
        patternA(10);
        System.out.println();
        patternB(10);
        System.out.println();
        patternC(10);
        System.out.println();
        patternD(9);
    }
}
