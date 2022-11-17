package labs.monster;

public class Monster {
    private final String name;
    private final int size;

    public Monster(final String name, final int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() { return name; }

    public int getSize() { return size; }

    public boolean gt(final Monster other) { return this.size > other.getSize(); }
    public boolean lt(final Monster other) { return this.size < other.getSize(); }
    public boolean eq(final Monster other) { return this.size == other.getSize(); }

    @Override
    public boolean equals(final Object obj) {
        if (obj instanceof Monster)
            return this.name.equals(((Monster) obj).getName());

        return super.equals(obj);
    }

    @Override
    public String toString() {
        return name;
    }
}
