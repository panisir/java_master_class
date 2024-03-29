package i_lists.c_iterator.challenge;

public class Place {
    private String name;
    private int distance;

    public Place(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "Place{" +
                "name='" + name + '\'' +
                ", distance=" + distance +
                '}';
    }
}
