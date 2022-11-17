package labs.linebreaker;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LineBreaker {
    public static String breakLines(final String input, final int n_chars) {
        final List<String> lines = Arrays.asList(input.split("(?<=\\G.{" + n_chars + "})"));
        return lines.stream()
                .map(s -> s + "\n")
                .collect(Collectors.joining());
    }
}
