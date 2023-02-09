package labs.matrix_2d_sum;

import java.util.Arrays;

public class MatrixSumming {
    public static final int[][] matrix =
            {{1, 2, 3, 4, 5},
            {6, 7, 8, 9, 0},
            {6, 7, 1, 2, 5},
            {6, 7, 8, 9, 0},
            {5, 4, 3, 2, 1}};

    public static int[] getNeighbors(final int x, final int y) {
        final int[] neighbors = new int[8];
        final int n_cols = matrix[0].length;
        final int n_rows = matrix.length;

        int n = 0;
        for (int col = y-1; col < (y+2); col++) {
            for (int row = x-1; row < (x+2); row++) {
                if ((x != row || y != col) &&
                        (0 <= col && col < n_cols) &&
                        (0 <= row && row < n_rows)) {
                    neighbors[n] = matrix[col][row];
                    n++;
                }
            }
        }

        return neighbors;
    }

    public static int getNeighborSum(final int x, final int y) {
        return Arrays.stream(getNeighbors(x, y)).sum() + matrix[y][x];
    }
}
