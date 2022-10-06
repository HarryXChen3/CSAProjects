package test;

import java.util.Scanner;

public class ConditionalStatementLab {
    public static void main(final String[] args) {
        final Scanner inputScanner = new Scanner(System.in);
        System.out.println("Input first number:");
        final int x0 = inputScanner.nextInt();
        System.out.println("Input second number:");
        final int x1 = inputScanner.nextInt();
        System.out.println("Input third number:");
        final int x2 = inputScanner.nextInt();
        System.out.println(x0 == x1 && x1 == x2 ? "All numbers are equal" : (x0 != x1 && x1 != x2 ? "All numbers are different" : "Neither all are equal or different"));
    }
}
