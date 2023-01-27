package labs.arraylist_labs;

import java.util.Arrays;
import java.util.List;

public class Delimiters {
    private final String openDelimiter;
    private final String closedDelimiter;

    public Delimiters(final String openDelimiter, final String closedDelimiter) {
        this.openDelimiter = openDelimiter;
        this.closedDelimiter = closedDelimiter;
    }

    public List<String> getDelimitersList(final String[] tokens) {
        return Arrays.stream(tokens)
                .filter(token -> openDelimiter.equals(token) || closedDelimiter.equals(token))
                .toList();
    }

    public static void main(final String[] args)
    {
        final Delimiters d1 = new Delimiters("(", ")");
        final String[] tokens = {"(", "x + y", ")", " * 5" };
        final List<String> res1 = d1.getDelimitersList(tokens);
        System.out.println("It should print [(, )] and it prints" + res1);

        final Delimiters d2 = new Delimiters("<q>", "</q>");
        final String[] tokens2 = {"<q>", "yy", "</q>", "zz", "</q>"};
        final List<String> res2 = d2.getDelimitersList(tokens2);
        System.out.println("It should print [<q>, </q>, </q>] and it prints " + res2);
    }

}
