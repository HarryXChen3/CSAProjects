package labs.matrix_2d_pascal;

public class PascalsTriangle {
    public static long factorial(final long i) {
        if (i == 0)
            return 1;
        return i * factorial(i - 1);
    }

    public static int nSpaces(final int n, final int size) {
        return Math.max(0, size - n + 1);
    }

    public static String generate(final int size) {
        final StringBuilder builder = new StringBuilder();
        for (int i = 0; i <= size; i++) {
            builder.append(" ".repeat(nSpaces(i, size)));

            for (int j = 0; j <= i; j++) {
                builder.append(" ").append(factorial(i) / (factorial(i - j) * factorial(j)));
            }

            builder.append("\n");
        }

        return builder.toString();
    }
}
