package h_regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EMatchersFindAndGroup {

    /**
     * How can we find out the occurrences there are
     * AND
     * Where they actually occur
     */

    public static void main(String[] args) {
        System.out.println("---------Example 1-----------");
        StringBuilder htmlText = new StringBuilder(
                "<h1>My Heading</h1>");
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p>This is a paragraph about something.</p>");
        htmlText.append("<p>This is another paragraph about something else.</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>Here is the summary.</p>");

        String h2Pattern = "<h2>";
        Pattern pattern = Pattern.compile(h2Pattern);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());
        System.out.println();

        System.out.println("---------Example 2-----------");
        /**
         * RESET THE MATCHER'S STATE
         * (!) We can only use a matcher once
         * (!) Matchers have an internal state that is updated
         * whenever we use it.
         *
         * So we reset the matcher since its state
         * has been updated in previous statement
         *
         * */
        matcher.reset();

        /**
         * FIND method usage
         *
         * The code below finds pattern occurrences
         * one by one how many of them and where they are
         * */
        int count = 0;
        while (matcher.find()) {
            count++;
            System.out.println(
                    "Occurrence "
                            + count
                            + " : "
                            + matcher.start()
                            + " to "
                            + matcher.end());
        }
        System.out.println();


        System.out.println("---------Example 3-----------");
        String h2GroupPattern = "(<h2>.*</h2>)";
        Pattern groupPattern = Pattern.compile(h2GroupPattern);
        Matcher groupMatcher = groupPattern.matcher(htmlText);
        System.out.println(groupMatcher.matches());
        groupMatcher.reset();

        /**
         * GREEDY AND LAZY QUANTIFIERS
         * The code below gives all string between the first <h2> and the last</h2>
         * tag exclusively.
         *
         * It's because we used "(<h2>.*</h2>)" pattern.
         * (*) is a greedy quantifier
         * It grabs as much text as it can.
         * */
        while (groupMatcher.find()) {
            System.out.println("Occurrence : " + groupMatcher.group(1));
        }

        System.out.println();


        System.out.println("---------Example 4-----------");
        /**
         * (?) MARK
         * TURNING THE QUANTIFIER FROM GREEDY INTO LAZY
         * We will add (?) mark right after the (*) quantifier
         * and it will change the greedy behavior of (*)
         * and it gives occurrences as groups
         * instead of the whole text between
         * */

        String h2GroupPattern2 = "(<h2>.*?</h2>)";
        Pattern groupPattern2 = Pattern.compile(h2GroupPattern2);
        Matcher groupMatcher2 = groupPattern2.matcher(htmlText);
        System.out.println(groupMatcher.matches());
        groupMatcher2.reset();

        while (groupMatcher2.find()) {
            System.out.println("Occurrence : " + groupMatcher2.group(1));
        }
        System.out.println();

        System.out.println("---------Example 5-----------");
        String h2TextGroups = "(<h2>)(.+?)(</h2>)";
        Pattern h2TextPattern = Pattern.compile(h2TextGroups);
        Matcher h2TextMatcher = h2TextPattern.matcher(htmlText);

        while (h2TextMatcher.find()) {
            System.out.println("Occurrences: " + h2TextMatcher.group(2));
        }
        System.out.println();


        System.out.println("---------Example 6-----------");
        String number = "+90 545 287 35 72";
        String turkisNumberRegex = "^[+]90{1}[ ]{1}[\\d]{3}[ ]{1}[\\d]{3}[ ]{1}[\\d]{2}[ ]{1}[0-9]{2}";
        Pattern turkishNumberPattern = Pattern.compile(turkisNumberRegex);
        Matcher turkishNumberMatcher = turkishNumberPattern.matcher(number);
        System.out.println(turkishNumberMatcher.matches());

        System.out.println();


        System.out.println("---------Example 7-----------");
        String email = "melihh.korkmaz@gmail.com";
        String emailRegex = "^[A-Z|a-z]+@[A-Z|a-z]+\\.com";
        Pattern emailPattern = Pattern.compile(emailRegex);
        Matcher emailMatcher = emailPattern.matcher(email);
        System.out.println(emailMatcher.matches());
    }
}
