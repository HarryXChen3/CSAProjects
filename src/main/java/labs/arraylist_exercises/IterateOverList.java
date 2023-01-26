package labs.arraylist_exercises;

import java.util.Arrays;
import java.util.List;

public class IterateOverList {
    public static void main(final String[] args) {
        final List<String> list = Arrays.asList("Red", "Green", "Orange", "White");
        list.forEach(System.out::println);
    }
}
