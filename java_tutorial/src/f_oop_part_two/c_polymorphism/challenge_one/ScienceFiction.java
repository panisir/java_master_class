package f_oop_part_two.c_polymorphism.challenge_one;

public class ScienceFiction extends Movie {
    public ScienceFiction(String title) {
        super(title);
    }

    public void watchScienceFiction() {
        System.out.println("Watching an Science Fiction!");
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Bad Aliens do Bad Stuff",
                "Space guys chase aliens",
                "Planet blows");
    }
}
