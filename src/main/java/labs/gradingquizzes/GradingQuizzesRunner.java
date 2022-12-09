package labs.gradingquizzes;

import java.util.List;
import java.util.Scanner;

public class GradingQuizzesRunner {
    private static final Scanner inputScanner = new Scanner(System.in);
    public static void main(final String[] args) {
        System.out.println("Enter number of questions in this quiz:");
        final int nQuestions = inputScanner.nextInt();

        System.out.println("Enter key for grading this quiz (space delimited):");
        inputScanner.nextLine();
        final List<Integer> key = GradingQuizzes.getSpaceDelimitedInts(inputScanner.nextLine(), nQuestions);

        while (true) {
            System.out.println("Enter answers to grade for this quiz (space delimited):");
            final List<Integer> answers = GradingQuizzes.getSpaceDelimitedInts(inputScanner.nextLine(), nQuestions);

            final long nCorrect = GradingQuizzes.computeNCorrect(answers, key);
            final double percentCorrect = (double)nCorrect / nQuestions;

            System.out.printf(
                    "Correct Answers: %d\nIncorrect Answers: %d\nPercent Correct: %.2f%n",
                    nCorrect,
                    nQuestions - nCorrect,
                    100 * percentCorrect
            );

            System.out.println("Grade another quiz? (y/n)");
            final String gradeAnotherChoice = inputScanner.nextLine();
            if (!gradeAnotherChoice.equalsIgnoreCase("y"))
                break;
        }
    }
}
