package labs.matrix_2d_fancyword;

import java.util.Objects;

public class FancyWord {
    public static String[][] hourglass(final String input) {
        final int inputLength = input.length();
        final String[][] out = new String[inputLength][inputLength];

        final String[] splitByChars = input.split("");
        out[0] = splitByChars;
        out[inputLength - 1] = splitByChars;

        int pos = 1;
        for (int i = 1; i < (inputLength - 1); i++) {
            for (int j = 0; j < inputLength; j++) {
                if (j == pos || j == (inputLength - 1 - pos))
                    out[i][j] = splitByChars[j];
            }

            if (pos <= (inputLength / 2))
                pos++;
            else
                pos--;
        }

        return out;
    }

    public static void displayHourglass(final String[][] hourglass) {
        for (final String[] outer : hourglass) {
            for (final String inner : outer) {
                if (Objects.nonNull(inner))
                    System.out.print(inner);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
