package labs.array_lab;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class HorseBarnTest {
    @Test
    public void testHorseBarn() {
        final HorseBarn barn = new HorseBarn(3);
        final List<Horse> horses = Arrays.asList(
                new Horse("Trigger", 1340),
                new Horse("Silver",1210),
                new Horse("Duke", 1410)
        );

        barn.fill(horses);

        final int triggerIndex = barn.findHorseAtSpace("Trigger");
        final int silverIndex = barn.findHorseAtSpace("Silver");
        final int cocoIndex = barn.findHorseAtSpace("Coco");

        assertEquals(0, triggerIndex);
        assertEquals(1, silverIndex);
        assertEquals(-1, cocoIndex);

        System.out.println("Index of Trigger should be 0 and is " + triggerIndex);
        System.out.println("Index of Silver should be 1 and is " + silverIndex);
        System.out.println("Index of Coco should be -1 and is " + cocoIndex);
    }
}
