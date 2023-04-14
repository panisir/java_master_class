package h_regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FLogicalOperators {
    public static void main(String[] args) {
        String harry = "harry";
        System.out.println(harry.replaceAll("[H|h]arry", "X"));

        String hayriPitir = "Hayri pıtır";
        System.out.println(hayriPitir.replaceAll("[O|ı]ayri pıtır", "Harry Potter"));

        System.out.println("--------------------");

        // [^abc]
        String tvTest = "tstvtkt";
        // String tNotVRegExp = "t[^v]";
        String tNotVRegExp = "t(?!v)";
        Pattern tNotVPattern = Pattern.compile(tNotVRegExp);
        Matcher tNotVMatcher = tNotVPattern.matcher(tvTest);

        int count = 0;
        while(tNotVMatcher.find()){
            count++;
            System.out.println("Occurrence "
                    + count + " : "
                    + tNotVMatcher.start()
                    + " to "
                    + tNotVMatcher.end());
        }
    }
}