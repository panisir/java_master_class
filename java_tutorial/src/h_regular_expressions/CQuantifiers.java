package h_regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CQuantifiers {
    public static void main(String[] args) {
        /** <= QUANTIFIERS => */
        String thirdAplhaNumericString = "abcDeeeF12Ghhiiiiijkl99z";
        System.out.println(thirdAplhaNumericString.replaceAll("^abcDeee", "YYY"));
        /**
         * Quantifier specify how often an element in a regular expression
         * can occur
         * character{occurrencesCount}
         * example : "^abcDe{3}" => abcDeee
         * */
        System.out.println(thirdAplhaNumericString.replaceAll("^abcDe{3}", "YYY"));
        // prints YYYF12Ghhiiiiijkl99z

        System.out.println(thirdAplhaNumericString.replaceAll("^abcDe{2}", "YYY"));
        // prints YYYeF12Ghhiiiiijkl99z

        /**
         * Another way to specify occurrences is
         * adding (+) at the end of the desired character
         * */
        System.out.println(thirdAplhaNumericString.replaceAll("^abcDe+", "YYY"));
        // prints YYYF12Ghhiiiiijkl99z

        String occurrences = "aaaaBBBccccDDDD";
        System.out.println(occurrences.replaceAll("^a+", "X"));
        System.out.println(occurrences.replaceAll("^a+B+c+D+", "X"));

        /**
         * (*) quantifier
         *
         * it's going to replace the string whether it's got an e or not.
         * */
        String thirdAplhaNumericString2 = "abcDF12Ghhiiiiijkl99z";
        System.out.println(thirdAplhaNumericString2.replaceAll("^abcDe*", "X"));
        // prints XF12Ghhiiiiijkl99z

        /**
         * {x,y} quantifier
         *
         * it's going to replace the string whether it's got an e or not.
         * */
        System.out.println(thirdAplhaNumericString.replaceAll("^abcDe{1,2}", "YYY"));
        // prints YYYeF12Ghhiiiiijkl99z

        /**
         * (+) and (*) combinations
         * */
        System.out.println(thirdAplhaNumericString.replaceAll("h+i*j", "Y"));

    }
}
