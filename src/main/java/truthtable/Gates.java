package truthtable;

public enum Gates {
    AND(2, 1),
    NOT(1, 1),
    OR(2, 1),
    OUT(1, 1),

    UNKNOWN(0, 0);

    private final int in;
    private final int out;
    Gates(final int in, final int out) {
        this.in = in;
        this.out = out;
    }

    public int getIn() { return in; }
    public int getOut() { return out; }
}
