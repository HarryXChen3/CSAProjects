package labs;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CodingPractice3 {
    private final static List<Integer> leapYears = Arrays.asList(1908, 1972, 2024, 2028, 2116, 2204, 2412);
    private final static List<Integer> nonLeapYears = Arrays.asList(2066, 2074, 1998, 2001, 2015, 2022, 2023);

    /**
     * Returns a boolean representing whether a certain year is a leap year
     * @param year the year to check against
     * @return a boolean, true if year is a leap year, false if not
     */
    public static boolean isLeapYear(final int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }

    /**
     * Returns a letter A, B, C, or D of a numerical grade
     * @param grade the numerical grade
     * @return A, B, C, D (letter grading system)
     */
    public static String letterGrade(final double grade) {
        return (grade >= 90 ? "A" : (grade >= 80 ? "B" : (grade >= 70 ? "C" : "D")));
    }

    /**
     * Returns the discriminant of the quadratic formula (b^2 - 4ac)
     * @param a coefficient a
     * @param b coefficient b
     * @param c coefficient c
     * @return a double representing the discriminant of ax^2 + bx + c
     */
    public static double discriminant(final double a, final double b, final double c) {
        return b * b - 4 * a * c;
    }

    /**
     * Returns a string that can be displayed for the roots of a quadratic ax^2 + bx + c
     * @param a coefficient a
     * @param b coefficient b
     * @param c coefficient c
     * @return a String of either "No real roots." or "x1 = <i>the first root</i>, x2 = <i>the second root</i>"
     */
    public static String quadraticMsg(final double a, final double b, final double c) {
        final double x0, dx, x1;
        x0 = ((dx = discriminant(a, b, c)) >= 0 ? (-b + Math.sqrt(dx))/(2*a) : Integer.MAX_VALUE);
        x1 = ((dx >= 0 ? (-b - Math.sqrt(dx))/(2*a) : Integer.MAX_VALUE));
        return (x0 == Integer.MAX_VALUE && x1 == Integer.MAX_VALUE) ? "No real roots." : String.format("x1 = %f, x2 = %f", x0, x1);
    }

    public static void testQuadraticMsg() {
        final Scanner inputScanner = new Scanner(System.in);
        System.out.println("Input a:");
        final double a = inputScanner.nextDouble();
        System.out.println("Input b:");
        final double b = inputScanner.nextDouble();
        System.out.println("Input c:");
        final double c = inputScanner.nextDouble();

        System.out.println(quadraticMsg(a, b, c));
    }

    /**
     * 3. Write Java code to read an integer from the user,
     * then print even if that number is an even number or odd otherwise.
     * You may assume that the user types a valid integer
     */
    public static void evenOdd() {
        final Scanner inputScanner = new Scanner(System.in);
        System.out.println("Type a number:");
        final int x0 = inputScanner.nextInt();
        System.out.println((x0 % 2 == 0) ? "even" : "odd");
    }

    /**
     * 4. Write a Java program that reads an integer and check whether it is negative, zero, or positive
     */
    public static void negZeroPos() {
        final Scanner inputScanner = new Scanner(System.in);
        System.out.println("Input a number:");
        final int x0 = inputScanner.nextInt();
        System.out.println((x0 < 0) ? "Number is negative" : (x0 == 0 ? "Number is zero" : "Number is positive"));
    }

    public static void main(final String[] args) {
        for (final int leapYear : leapYears)
            if (!isLeapYear(leapYear))
                throw new AssertionError(String.format("isLeapYear returned false for leap year (%d)", leapYear));

        for (final int nonLeapYear : nonLeapYears)
            if (isLeapYear(nonLeapYear))
                throw new AssertionError(String.format("isLeapYear returned true for non-leap year (%d)", nonLeapYear));

        assert "A".equals(letterGrade(90));
        assert "B".equals(letterGrade(89));
        assert "C".equals(letterGrade(75));
        assert "D".equals(letterGrade(60));

        testQuadraticMsg();
        evenOdd();
        negZeroPos();
    }
}
