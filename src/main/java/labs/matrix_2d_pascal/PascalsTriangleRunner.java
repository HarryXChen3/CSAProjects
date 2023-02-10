package labs.matrix_2d_pascal;

import java.util.Scanner;

public class PascalsTriangleRunner {
    final static Scanner inputScanner = new Scanner(System.in);
    public static void main(final String[] args) {
        System.out.println("Input Number of Rows for Pascal's Triangle ");
        final int triangleSize = inputScanner.nextInt();
        System.out.println(PascalsTriangle.generate(triangleSize - 1));
    }
}
