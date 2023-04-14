package f_oop_part_two.c_polymorphism.challenge_one;

public class Movie {
    private final String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie() {
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");
    }

    /**
     * This kind of methods also known as
     * factory methods in programming design patterns.
     *
     * The Client does not have to know what it goes
     * in the background and also about subclasses
     * */
    public static Movie getMovie(String type, String title) {
        return switch (type.toUpperCase().charAt(0)) {
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }
}