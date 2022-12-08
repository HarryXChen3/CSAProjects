package labs.array_lab;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberCubeTest {
    @Test
    public void testGetCubeTosses() {
        final NumberCube cube = new NumberCube();
        final int numTosses = 9;

        final int[] tosses = NumberCube.getCubeTosses(cube, numTosses);

        assertEquals(numTosses, tosses.length);
        if (tosses.length < numTosses) {
            System.out.println("It looks like you are not returning an array of the correct size:");
            System.out.println(Arrays.toString(tosses));
        } else {
            System.out.println("You returned an array of the correct size:");
            System.out.println(Arrays.toString(tosses));
        }
    }
}
