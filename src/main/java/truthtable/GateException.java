package truthtable;

public class GateException extends RuntimeException {
    public GateException(final Gates gate, final String message) {
        super(String.format("%s gate threw GateInputException: %s", gate.name(), message));
    }

    public GateException(final String message) { this(Gates.UNKNOWN, message); }
    public GateException(final Gates gate) { this(gate, "unknown exception"); }
    public GateException() { this(Gates.UNKNOWN); }
}
