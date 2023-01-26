package labs.arraylist_exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveElement {
    public static void main(final String[] args) {
        final List<String> list = new ArrayList<>(Arrays.asList("Red", "Green", "Orange", "White", "Black"));
        System.out.println(Arrays.toString(list.toArray()));

        list.remove(2);
        System.out.println("After removing 3rd element from the list:");
        System.out.println(Arrays.toString(list.toArray()));
    }
}
