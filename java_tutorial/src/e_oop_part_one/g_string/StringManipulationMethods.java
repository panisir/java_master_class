package e_oop_part_one.g_string;

public class StringManipulationMethods {
    public static void main(String[] args) {
        String birthDate = "25/11/1982";
        int startIndex = birthDate.indexOf("1982");
        System.out.println("startIndex = " + startIndex);
        System.out.println("Birth year = " + birthDate.substring(startIndex));

        System.out.println("Month = " + birthDate.substring(3, 5));
        System.out.println("Day = " + birthDate.substring(0,2));

        String newDate = "25";
        /**
         * This way is valid but inefficient
         * Each call is a new creation of a String object
         * */
        newDate = newDate.concat("/");
        newDate = newDate.concat("11");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1982");
        System.out.println(newDate);

        /**
         * More efficient than previous concat calls
         * Java compiler recognizes this statement as
         * a single string because of the use of literals and
         * the plus operator.
         * */
        newDate = "25" + "/" + "11" + "/" + "1982";
        System.out.println(newDate);

        /**
         * It's called method chaining
         * Each concat call is still a new String object being created
         * instead of adding result to only one variable
         * It's still inefficient
         *
         * We are gonna see the most efficient way is StringBuilder classs
         * usage for that operation later.
         * */
        newDate = "25"
                .concat("/")
                .concat("11")
                .concat("/")
                .concat("1982");
        System.out.println(newDate);

        System.out.println(newDate.replace('/', '-'));
        System.out.println(newDate.replaceFirst("/", "-"));
        System.out.println(newDate.replaceAll("/", "----"));

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

        System.out.println("    ABC\n".repeat(3).indent(-2));
        System.out.println("-".repeat(20));

    }
}