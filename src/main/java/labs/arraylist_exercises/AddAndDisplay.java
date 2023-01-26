package labs.arraylist_exercises;

import java.util.Arrays;
import java.util.List;

public class AddAndDisplay {
    public static void main(final String[] args) {
        final List<String> list = Arrays.asList("Red", "Green", "Orange", "White", "Black");
        System.out.println(Arrays.toString(list.toArray()));
    }
}
