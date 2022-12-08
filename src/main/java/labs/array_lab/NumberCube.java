package labs.array_lab;

public class NumberCube {
    public int toss() {
        return (int)((Math.random() * 6) + 1);
    }

    public static int[] getCubeTosses(final NumberCube cube, final int numTosses) {
        final int[] tosses = new int[numTosses];
        for (int i = 0; i < numTosses; i++)
            tosses[i] = cube.toss();
        return tosses;
    }
}
