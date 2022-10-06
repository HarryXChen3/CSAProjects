package test;

import java.util.Scanner;

public class CodingPractice3 {
    public static boolean isLeapYear(final int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }

    public static String letterGrade(final double grade) {
        return (grade >= 90 ? "A" : (grade >= 80 ? "B" : (grade >= 70 ? "C" : "D")));
    }

    public static double discrim(final double a, final double b, final double c) {
        return b * b - 4 * a * c;
    }

    public static String quadraticMsg(final double a, final double b, final double c) {
        final double x0, dx, x1;
        x0 = ((dx = discrim(a, b, c)) >= 0 ? (-b + Math.sqrt(dx))/(2*a) : Integer.MAX_VALUE);
        x1 = ((dx >= 0 ? (-b - Math.sqrt(dx))/(2*a) : Integer.MAX_VALUE));
        return (x0 == Integer.MAX_VALUE && x1 == Integer.MAX_VALUE) ? "No real roots." : String.format("x1 = %f, x2 = %f", x0, x1);
    }

    public static void main(final String[] args) {
        final Scanner inputScanner = new Scanner(System.in);
        System.out.println("Input a:");
        final double a = inputScanner.nextDouble();
        System.out.println("Input b:");
        final double b = inputScanner.nextDouble();
        System.out.println("Input c:");
        final double c = inputScanner.nextDouble();

        System.out.println(quadraticMsg(a, b, c));
    }
}
