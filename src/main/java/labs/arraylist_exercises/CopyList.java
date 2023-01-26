package labs.arraylist_exercises;

import java.util.Arrays;
import java.util.List;

public class CopyList {
    @SuppressWarnings("unused")
    public static void main(final String[] args) {
        List<String> list1 = Arrays.asList("1", "2", "3", "4");
        final List<String> list2 = Arrays.asList("A", "B", "C", "D");

        System.out.printf("List1: %s%n", Arrays.toString(list1.toArray()));
        System.out.printf("List2: %s%n", Arrays.toString(list2.toArray()));

        list1 = list2.stream().toList();
        System.out.println("Copy List2 to List1");

        System.out.printf("List1: %s%n", Arrays.toString(list1.toArray()));
        System.out.printf("List2: %s%n", Arrays.toString(list2.toArray()));
    }
}
