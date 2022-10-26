package truthtable;

import java.util.Arrays;
import java.util.List;

public interface Gate {
    List<Boolean> compute(final List<Boolean> in);
    default List<Boolean> compute(final Boolean... in) {
        return compute(Arrays.asList(in));
    }
    Gates getGate();
}
