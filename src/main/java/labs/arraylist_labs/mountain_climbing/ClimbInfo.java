package labs.arraylist_labs.mountain_climbing;

public record ClimbInfo(String name, int time) {
    @Override
    public String toString() {
        return String.format("Peak Name: %s; Time: %d", name, time);
    }
}
