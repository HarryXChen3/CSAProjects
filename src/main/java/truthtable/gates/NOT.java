package truthtable.gates;

import truthtable.Gate;
import truthtable.GateException;
import truthtable.Gates;

import java.util.Collections;
import java.util.List;

public class NOT implements Gate {
    private static final Gates gate = Gates.NOT;

    @Override
    public List<Boolean> compute(final List<Boolean> in) {
        if (in.size() != gate.getIn())
            throw new GateException(gate, "compute called with invalid input length");

        return Collections.singletonList(!in.get(0));
    }

    @Override
    public Gates getGate() { return gate; }
}
