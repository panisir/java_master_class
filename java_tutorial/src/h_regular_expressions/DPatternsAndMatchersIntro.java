package h_regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DPatternsAndMatchersIntro {
    /**
     *
     * PATTERN class
     *
     * With Also Java's Pattern class
     * we can manipulate strings using
     * regular expressions
     *
     * Because some java api's might want to work
     * with the patterns rather than a string
     * that represents a regular expressions.
     *
     * We can convert a regular expression into
     * a pattern using compile() method
     * Pattern.compile(*a*b) for instance
     */

    /**
     * MATCHER class
     * And then we use Matcher class
     * and Mather class works with char sequences
     * so it means we can use
     * - String
     * - StringBuffer
     * - StringBuilder
     * - and the other classes that implement that interface
     * */

    /**
     * WHEN TO USE MATCHER
     * Generally we use a matcher when we want to find
     * multiple occurrences of a pattern
     * OR
     * when we want to use same pattern with multiple
     * sequences
     * */
    public static void main(String[] args) {
        StringBuilder htmlText = new StringBuilder(
                "<h1>My Heading</h1>");
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p>This is a paragraph about something.</p>");
        htmlText.append("<p>This is another paragraph about something else.</p>");
        htmlText.append("<p>Here is the summary.</p>");

        String h2Pattern = ".*<h2>.*";
        Pattern pattern = Pattern.compile(h2Pattern);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());
    }
}
