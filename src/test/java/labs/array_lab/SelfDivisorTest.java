package labs.array_lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SelfDivisorTest {
    @Test
    public void testFirstThreeSelfDivisorsFromTen() {
        System.out.println("Self divisors for firstNumSelfDivisors(10, 3):");
        final int[] divisors = SelfDivisor.firstNSelfDivisors(10, 3);
        final int[] expected = new int[] {11, 12, 15};

        assertArrayEquals(expected, divisors);

        for (int n : divisors)
            System.out.print(n + " ");
    }

    @Test
    public void testFirstFiveSelfDivisorsFromTwentyTwo() {
        System.out.println("\nSelf divisors for firstNumSelfDivisors(22, 5):");
        final int[] divisors = SelfDivisor.firstNSelfDivisors(22, 5);
        final int[] expected = new int[] {22, 24, 33, 36, 44};

        assertArrayEquals(expected, divisors);

        for (int n : divisors)
            System.out.print(n + " ");
    }
}
