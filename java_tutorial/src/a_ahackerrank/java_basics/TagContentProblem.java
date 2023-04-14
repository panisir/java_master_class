package a_ahackerrank.java_basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentProblem {
    public static void main(String[] args) {
        String text = "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>";
        String tagRegex = "<(.+)>([^<]+)</\\1>";
        Pattern tagPattern = Pattern.compile(tagRegex);
        Matcher matcher = tagPattern.matcher(text);
        while(matcher.find()){
            System.out.println(matcher.group(2));
        }

    }
}