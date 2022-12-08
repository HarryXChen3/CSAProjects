package labs.array_lab;

public class SelfDivisor {
    public static boolean isSelfDivisor(final int number) {
        int currNumber = number;
        int digit;

        while (currNumber > 0) {
            digit = currNumber % 10;
            if (digit == 0 || number % digit != 0) return false;
            currNumber = currNumber / 10;
        }

        return true;
    }

    public static int[] firstNSelfDivisors(final int start, final int n) {
        final int[] selfDivisors = new int[n];
        int d = start;
        int i = 0;
        while (i < n) {
           if (isSelfDivisor(d)) {
               selfDivisors[i] = d;
               i++;
           }

           d++;
        }

        return selfDivisors;
    }
}
