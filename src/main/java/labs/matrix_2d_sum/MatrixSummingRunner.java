package labs.matrix_2d_sum;

import java.util.Scanner;

public class MatrixSummingRunner {
    final static Scanner inputScanner = new Scanner(System.in);

    public static void main(final String[] args) {
        System.out.println("Matrix values");
        for (final int[] outer : MatrixSumming.matrix) {
            for (final int inner : outer) {
                System.out.print(" " + inner);
            }
            System.out.println();
        }

        System.out.println("Input expected number of coordinates");
        final int amt = inputScanner.nextInt();

        System.out.println("Input coordinates seperated by space");
        inputScanner.nextLine();

        final String[] input = new String[amt];
        for (int i = 0; i < amt; i++)
            input[i] = inputScanner.nextLine();

        for (final String nextString: input) {
            final String[] splitBySpace = nextString.split(" ");
            final int row = Integer.parseInt(splitBySpace[0]);
            final int col = Integer.parseInt(splitBySpace[1]);

            System.out.printf("The sum of %d, %d is %d.%n", row, col, MatrixSumming.getNeighborSumByRowCol(row, col));
        }
    }
}
