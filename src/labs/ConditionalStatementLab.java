package labs;

import java.util.Scanner;

public class ConditionalStatementLab {
    /**
     * 1. Write a Java program to get a number from the user and print whether it is positive or negative.
     * <p>
     * <b>Test Data</b><br>
     * Input number: 35<br>
     * Expected Output : Number is positive
     * </p>
     */
    public static void posNeg() {
        final Scanner inputScanner = new Scanner(System.in);
        System.out.println("Input number:");
        System.out.println(inputScanner.nextInt() >= 0 ? "Number is positive" : "Number is negative");
    }

    /**
     * 2. Take three numbers from the user and print the greatest number.
     * <p>
     * <b>Test Data</b><br>
     * Input the 1st number: 25<br>
     * Input the 2nd number: 78<br>
     * Input the 3rd number: 87<br>
     * Expected Output : The greatest: 87
     */
    public static void greatestNum() {
        final Scanner inputScanner = new Scanner(System.in);
        System.out.println("Input the 1st number:");
        final int x0 = inputScanner.nextInt();
        System.out.println("Input the 2nd number:");
        final int x1 = inputScanner.nextInt();
        System.out.println("Input the 3rd number:");
        final int x2 = inputScanner.nextInt();
        System.out.println("The greatest: " + (x0 > x1 && x0 > x2 ? x0 : (x1 > x0 && x1 > x2 ? x1 : x2)));
    }

    /**
     * 3. Write a Java program that reads an integer and check whether it is negative, zero, or positive.
     */
    public static void negZeroPos() {
        final Scanner inputScanner = new Scanner(System.in);
        System.out.println("Input a number:");
        final int x0 = inputScanner.nextInt();
        System.out.println(x0 == 0 ? "Number is zero" : (x0 > 0 ? "Number is positive" : "Number is negative"));
    }

    /**
     * 4. Write a Java program that reads a floating-point number. If the number is zero it prints "zero", otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.
     */
    public static void negZeroPosSmallLarge() {
        final Scanner inputScanner = new Scanner(System.in);
        System.out.println("Input a number:");
        final double x0 = inputScanner.nextDouble();
        System.out.println(x0 == 0 ? "zero" : ((x0 > 0 ? "positive" : "negative") + (Math.abs(x0) < 1 ? "small" : (x0 > 1000000 ? "large" : ""))));
    }

    /**
     * 5. Write a Java program that reads a positive integer and count the number of digits the number (less than ten billion) has.
     */
    public static void digitsInNumber() {
        final Scanner inputScanner = new Scanner(System.in);
        System.out.println("Input an integer number less than ten billion:");
        final String x0 = inputScanner.nextLine();
        System.out.println("Number of digits in the number: " + x0.length());
    }

    /**
     * 6. Write a Java program that accepts three numbers and prints "All numbers are equal" if all three numbers are equal, "All numbers are different" if all three numbers are different and "Neither all are equal nor different" otherwise.
     */
    public static void numSameDiff() {
        final Scanner inputScanner = new Scanner(System.in);
        System.out.println("Input first number:");
        final int x0 = inputScanner.nextInt();
        System.out.println("Input second number:");
        final int x1 = inputScanner.nextInt();
        System.out.println("Input third number:");
        final int x2 = inputScanner.nextInt();
        System.out.println(
                x0 == x1 && x1 == x2
                        ? "All numbers are equal"
                        : (
                                x0 != x1 && x1 != x2
                                        ? "All numbers are different"
                                        : "Neither all are equal or different"
                )
        );
    }

    public static void main(final String[] args) {
        posNeg();
        greatestNum();
        negZeroPos();
        negZeroPosSmallLarge();
        digitsInNumber();
        numSameDiff();
    }
}
