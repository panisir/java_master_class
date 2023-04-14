package h_regular_expressions;

public class AIntro {
    public static void main(String[] args) {
        String alphaNumeric = "aEhbcDFEh121?!-ab21ooppEh";

        /**
         * The dot sign (.) is pattern for the all characters
         * */
        System.out.println("The original string : " + alphaNumeric);
        System.out.println(alphaNumeric.replaceAll(".", "0"));
        System.out.println("------------------");

        /**
         * CARROT (^) - START BOUNDARY
         * The carrot here, means it checks if the string starts with
         * the ab => ^ab
         *
         * The carrot is the boundary sign for the start
         * */
        System.out.println("The original string : " + alphaNumeric);
        System.out.println(alphaNumeric.replaceAll("^ab", "0"));
        System.out.println("------------------");

        /**
         * MATCH - THE ENTIRE STRING
         * With the match method the whole string has to be matched.
         * */
        System.out.println("The original string : " + alphaNumeric);
        System.out.println(alphaNumeric.matches("^abcDFEh121ab21oopp"));
        System.out.println(alphaNumeric.matches("^ab"));
        System.out.println("------------------");

        /**
         * DOLAR ($) - END BOUNDARY
         * The dolar sign checks for the boundary end with the given string
         *
         * */
        System.out.println("The original string : " + alphaNumeric);
        System.out.println(alphaNumeric.replaceAll("oopp$", "0"));

        String end = "afasfd5";
        System.out.println(end.matches("5$"));

        System.out.println("------------------");

        /**
         * Square Brackets ([]) - CHARACTER ARRAY
         * all characters within the square brackets will be replaced with the desired
         * characters one by one
         *
         * In this example :
         * all "a" chars will be replaced with X
         * all "2" chars will be replaced with X
         * all "p" chars will be replaced with X
         *
         * Replacement item may be anything
         * character or string or number
         *
         * */
        System.out.println("The original string : " + alphaNumeric);
        System.out.println(alphaNumeric.replaceAll("[a2p]", "X"));
        System.out.println(alphaNumeric.replaceAll("[a2p]", "Hello World"));
        System.out.println(alphaNumeric.replaceAll("[a2p]", "??--"));
        System.out.println("------------------");

        /**
         *
         * Multiple Square Brackets ([][]) - CHARACTER ARRAY
         * If we do the regex like below
         * it will search second array item for all the
         * items in first array one by one
         * for example look first if
         * there are any 'E' comes after 'a' if so, will replace 'aE' with the 'X'
         * */
        System.out.println(alphaNumeric.replaceAll("[a2p][Eh]", "X"));
        String twoArrayString = "ahbEcZ";
        System.out.println(twoArrayString.replaceAll("[abc][hEZ]", "X"));
        String threeArrayString = "1a2b3c4d5ee6ef";
        System.out.println(threeArrayString.replaceAll("[abc][123]", "X"));
        System.out.println(threeArrayString.replaceAll("[abce][f6]", "X"));
    }
}
