package labs.array_lab;

public class Horse {
    private final String name;
    private final int weight;

    public Horse(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    @SuppressWarnings("unused")
    public int getWeight() {
        return weight;
    }
}
