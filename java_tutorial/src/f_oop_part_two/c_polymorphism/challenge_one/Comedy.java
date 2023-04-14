package f_oop_part_two.c_polymorphism.challenge_one;

public class Comedy extends Movie {
    public Comedy(String title) {
        super(title);
    }

    public void watchComedy(){
        System.out.println("Watching a Comedy!");
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Something funny happens",
                "Something even funnier happens",
                "Happy ending");
    }
}
