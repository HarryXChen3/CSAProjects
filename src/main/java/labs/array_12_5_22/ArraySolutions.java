package labs.array_12_5_22;

import java.util.*;

public class ArraySolutions {
    public static <E extends Comparable<E>, A extends Collection<E>> E max(final A collection) {
        E max = null;
        for (final E element: collection)
            if (max == null || element.compareTo(max) > 0)
                max = element;
        return max;
    }

    public static int max(final int[] array) {
        //return max(Arrays.stream(array).boxed().toList());
        int max = array[0];
        for (int i = 1; i < array.length; i++)
            if (array[i] > max)
                max = array[i];
        return max;
    }

    public static double max(final double[] array) {
        double max = array[0];
        for (int i = 1; i < array.length; i++)
            if (array[i] > max)
                max = array[i];
        return max;
    }

    public static <E> List<E> duplicates(final Collection<E> a) {
        final List<E> duplicates = new ArrayList<>(a.size());
        final HashSet<E> set = new HashSet<>(a.size());
        for (final E e: a) {
            if (set.contains(e))
                duplicates.add(e);
            set.add(e);
        }

        return duplicates;
    }

    public static int[] duplicates(final int[] a) {
        final List<Integer> dupes = duplicates(Arrays.stream(a).boxed().toList());
        return dupes.stream().mapToInt(i->i).toArray();
    }

    public static double[] duplicates(final double[] a) {
        final List<Double> dupes = duplicates(Arrays.stream(a).boxed().toList());
        return dupes.stream().mapToDouble(d->d).toArray();
    }

    public static int[] shift(final int[] a) {
        final int last = a[a.length - 1];
        for (int i = a.length - 2; i >= 0; i--)
            a[i + 1] = a[i];
        a[0] = last;
        return a;
    }
}
