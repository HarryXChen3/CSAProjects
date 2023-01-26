package labs.arraylist_exercises;

import java.util.Arrays;
import java.util.List;

public class SwapElements {
    public static void main(final String[] args) {
        final List<String> list = Arrays.asList("Red", "Green", "Black", "White", "Pink");
        final String firstElem = list.get(0);

        System.out.println("ArrayList before swap:");
        list.forEach(System.out::println);

        list.set(0, list.get(2));
        list.set(2, firstElem);

        System.out.println("ArrayList after swap:");
        list.forEach(System.out::println);
    }
}
