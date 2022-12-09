package labs.gradingquizzes;

import java.util.*;
import java.util.stream.IntStream;

public class GradingQuizzes {
    public static List<Integer> getSpaceDelimitedInts(final String input, final int nQuestions) {
        return Arrays.stream(input.split(" ", nQuestions))
                .mapToInt(Integer::valueOf)
                .boxed()
                .toList();
    }

    public static long computeNCorrect(final List<Integer> input, final List<Integer> key) {
        return IntStream.range(0, input.size())
                .filter(i -> Objects.equals(key.get(i), input.get(i)))
                .count();
    }
}
