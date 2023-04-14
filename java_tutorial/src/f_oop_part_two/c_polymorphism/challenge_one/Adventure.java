package f_oop_part_two.c_polymorphism.challenge_one;

public class Adventure extends Movie {

    public Adventure(String title) {
        super(title);
    }
    public void watchAdventure(){
        System.out.println("Watching an Adventure!");
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Pleasant Scene",
                "Scary Music",
                "Something Bad Happens");
    }
}
