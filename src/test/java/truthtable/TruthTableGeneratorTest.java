package truthtable;

import org.junit.jupiter.api.Test;
import truthtable.gates.AND;
import truthtable.gates.NOT;
import truthtable.gates.OUT;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class TruthTableGeneratorTest {
    @Test
    public void tempTest() {
        final AND and = new AND();
        final AND otherAnd = new AND();
        final NOT not = new NOT();
        final OUT out = new OUT();
        final TruthTableGenerator truthTableGenerator = new TruthTableGenerator(
                Map.of(
                        "A", List.of(and, out),
                        "B", List.of(and, otherAnd, out),
                        "C", List.of(not, otherAnd, out)
                )
        );

        System.out.println(truthTableGenerator.compute());
    }
}
