package h_regular_expressions;

public class BCharacterClassAndBoundaryMatches {
    public static void main(String[] args) {

        /**
         * Upper and lower cases check both
         * this way we check the cases without using
         * toLowerCase or toUpperCase methods.
         * */
        String name = "melih";
        String name2 = "Melih";
        System.out.println(name.replaceAll("[Mm]elih", "Melih"));
        System.out.println(name2.replaceAll("[Mm]elih", "melih"));
        System.out.println("-----------");

        /**
         * EXCEPT [^...]
         * Except desired characters in regex pattern
         *
         * If we use a carrot in square brackets it does not mean
         * boundary match anymore
         *
         * This expression will replace all characters with X
         * expect 'z' and 'n'
         * */
        String dummyString = "AaaaAzAbBBBbnCCCC1z11errtyubUYUTzYU";
        System.out.println(dummyString.replaceAll("[^zn]", "X"));
        System.out.println("-----------");

        /**
         * CASE SENSITIVE
         *
         * Regular Expressions are case-sensitive
         * */
        System.out.println(dummyString.replaceAll("[AzubY]" ,"X"));
        System.out.println("-----------");

        /**
         * Character Ranges
         * We can specify some ranges like
         * a-f, all characters within the range of a and f exclusive
         * wil be replaced.
         * */

        String rangeString = "abcdfgğhıijklmnoprsştuüvyzABCDEFGĞHIİJKLMNOÖPRSŞTUÜVYZ123456789";
        System.out.println(rangeString.replaceAll("[a-f]", "X"));
        System.out.println(rangeString.replaceAll("[a-fA-F3-8]", "X"));
        System.out.println("-----------");

        /**
         * CASE SENSITIVITY ANOTHER WAY
         *
         * (?i) means check without case-sensitive
         *
         * IMPORTANT: See that the (?i) symbol does not include the
         * turkish characters like 'ı, ğ, İ'
         *
         * so we can add an 'u' to the end so (?iu)
         * but seen that it does not work for 'g' and 'Ğ'
         * */
        System.out.println(rangeString.replaceAll("(?i)[a-m]", "X"));
        System.out.println("-----------");

        /**
         * All number (digit) characters '\d' (digits)
         *
         * we used [0-9] but instead we can use '\d'
         * */
        System.out.println(rangeString.replaceAll("[0-9]", "X"));
        System.out.println(rangeString.replaceAll("\\d", "X"));
        System.out.println("-----------");

        /**
         * All non-number(non-digit) characters '\D' (digits)
         *
         * we used [A-Za-z] but instead we can use '\D'
         *
         * Seen that '\D' work better for unicodes and also for
         * turkish characters
         * */
        System.out.println(rangeString.replaceAll("[A-Za-z]", "X"));
        System.out.println(rangeString.replaceAll("\\D", "X"));
        System.out.println("-----------");

        /**
         * WHITE SPACES AND BLANKS (\s) OR (\W)
         * NON WHITE SPACE CHARACTERS (\S) OR (\w)
         *
         * */
        String whiteSpaceString = "I have some blanks, \t\ttabs and also a new line\n";
        System.out.println(whiteSpaceString);
        System.out.println(whiteSpaceString.replaceAll("\\s", ""));
        System.out.println(whiteSpaceString.replaceAll("\\t", ""));
        System.out.println(whiteSpaceString.replaceAll("\\S", "X"));
        System.out.println("-----------");

        System.out.println(whiteSpaceString.replaceAll("\\w" ,"X"));
        System.out.println(whiteSpaceString.replaceAll("\\W" ,"X"));
        System.out.println("-----------");

        /**
         * SURROUND (\b)
         *
         * */
        System.out.println(whiteSpaceString.replaceAll("\\b([\\w+]+)(?:\\W\\1\\b)+", "X"));
        System.out.println(whiteSpaceString.replaceAll("\\B", "X"));
    }
}
