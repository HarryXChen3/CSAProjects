package labs.trackinggrades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    private static final Scanner inputScanner = new Scanner(System.in);

    private final String name;
    private final List<Double> testScores = new ArrayList<>();

    public Student(final String name) {
        this.name = name;
    }

    public void inputGrades(final int nGrades) {
        for (int i = 0; i < nGrades; i++) {
            System.out.printf("Enter grade #%d: ", i + 1);
            testScores.add(Double.valueOf(inputScanner.nextLine()));
        }
    }

    public void inputGrades() {
        int i = 0;
        while (true) {
            System.out.printf("Enter grade #%d or stop to stop: ", i + 1);
            final String input = inputScanner.nextLine();
            if ("stop".equalsIgnoreCase(input))
                break;

            testScores.add(Double.valueOf(input));
            i++;
        }
    }

    public double getAverage() {
        return testScores.stream()
                .mapToDouble(d -> d)
                .average()
                .orElseThrow();
    }

    @Override
    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder(String.format("Name: %s", name));
        for (int i = 0; i < testScores.size(); i++)
            stringBuilder.append(String.format("\nTest #%d", i));

        return stringBuilder.toString();
    }
}
