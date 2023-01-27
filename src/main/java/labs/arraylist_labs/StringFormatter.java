package labs.arraylist_labs;

import java.util.ArrayList;
import java.util.List;

public class StringFormatter {
    public static int totalLetters(final List<String> words) {
        return words.stream()
                .mapToInt(String::length)
                .reduce(0, Integer::sum);
    }

    public static void main(final String[] args) {
        final List<String> myWords = new ArrayList<>();
        myWords.add("A");
        myWords.add("frog");
        myWords.add("is");
        System.out.println("Should print 7 and prints: " + totalLetters(myWords));

        final List<String>words2 = new ArrayList<>();
        words2.add("Hi");
        words2.add("Bye");
        System.out.println("Should print 5 and prints: " + totalLetters(words2));
    }
}
