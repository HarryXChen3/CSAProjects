package labs.array_12_5_22;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ArraySolutionsTest {
    @Test
    public void testMaxIntArray() {
        final int[] ints = {5, 7, 9, 12, 56, 2, -8, -924, 34, 78, 982, 94, 12, 4, 67};
        assertEquals(982, ArraySolutions.max(ints));
    }

    @Test
    public void testMaxDoubleArray() {
        final double[] doubles = {8, 2, 5, 7, 5.6, 99.4, 9241, -928.3, 192942.85, 24, 445.9};
        assertEquals(192942.85, ArraySolutions.max(doubles));
    }

    @Test
    public void testMaxCollections() {
        final List<Integer> integers = Arrays.asList(67, 7, 132, 4, 2, -2, -78, -2412, 23, 456, 24, 94, 2);
        final List<Double> doubles = Arrays.asList(6d, 24.2, 124d, 2.89, 24.425, 0.24, -24412.2, -95.2, 944.24, 9982.24);

        assertEquals(456, ArraySolutions.max(integers));
        assertEquals(9982.24, ArraySolutions.max(doubles));
    }

    @Test
    public void testDuplicateIntArray() {
        final int[] ints = {5, 5, 6, 8, 8, 12, 56, 2, -8, -924, 924, 34, 78, 2, 982, 94, 12, 4, -8, 67};
        final int[] duplicates = ArraySolutions.duplicates(ints);

        assertArrayEquals(new int[] {5, 8, 2, 12, -8}, duplicates);
    }

    @Test
    public void testDuplicateDoubleArray() {
        final double[] doubles = {8, 8, 2, 5, 7, 7, 5.6, 99.4, 9241, -928.3, 192942.85, -928.3, 24, 445.9, 5.6};
        final double[] duplicates = ArraySolutions.duplicates(doubles);
        assertArrayEquals(new double[] {8, 7, -928.3, 5.6}, duplicates);
    }

    @Test
    public void testShiftIntArray() {
        final int[] ints = {5, 7, 9, 12, 56, 2, -8, -924, 34, 78, 982, 94, 12, 4, 67};
        final int[] shifted = {67, 5, 7, 9, 12, 56, 2, -8, -924, 34, 78, 982, 94, 12, 4};

        assertArrayEquals(shifted, ArraySolutions.shift(ints));
    }
}
