package labs.arraylist_exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareLists {
    private static <T> List<String> compare(final List<T> primary, final List<T> secondary) {
        final List<String> result = new ArrayList<>(primary.size());
        primary.forEach(t -> result.add(secondary.contains(t) ? "Yes" : "No"));
        return result;
    }

    public static void main(final String[] args) {
        final List<String> list1 = Arrays.asList("Red", "Green", "Black", "White", "Pink");
        final List<String> list2 = Arrays.asList("Red", "Green", "Black", "Pink");
        System.out.println(Arrays.toString(compare(list1, list2).toArray()));
    }
}
