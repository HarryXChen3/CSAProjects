package labs.array_lab;

import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

public class HorseBarn {
    private final Horse[] spaces;

    public HorseBarn(final int stalls) {
        this.spaces = new Horse[stalls];
    }

    public void fill(final List<Horse> horses) {
        for (int i = 0; i < spaces.length; i++)
            spaces[i] = horses.get(i);
    }

    public int findHorseAtSpace(final String name) {
        Objects.requireNonNull(name);
        return IntStream.range(0, spaces.length)
                .filter(i -> name.equals(spaces[i].getName()))
                .findFirst()
                .orElse(-1);
    }
}
