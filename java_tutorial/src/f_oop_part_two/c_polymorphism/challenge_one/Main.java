package f_oop_part_two.c_polymorphism.challenge_one;

public class Main {
    public static void main(String[] args) {
         // Movie adventureMovie = Movie.getMovie("Comedy", "Recep İvedik");
         // adventureMovie.watchMovie();

       /** This code compiles but get exception at run time
        *  ClassCastException

        Adventure jaws = (Adventure) Movie.getMovie("C", "Jaws");
        jaws.watchMovie(); */

       /**
        * This gets error 'cause still did not cast to comedy tpye
        * Object comedy = Movie.getMovie("C", "GORA");
        * Movie comedyMovie = (Movie) comedy;
        * comedyMovie.watchComedy();
        * */

         // Object comedy = Movie.getMovie("C", "GORA");
         // Comedy comedyMovie = (Comedy) comedy;
         // comedyMovie.watchComedy();

        var airplane = new Comedy("Airplane");
        airplane.watchComedy();

    }
}
