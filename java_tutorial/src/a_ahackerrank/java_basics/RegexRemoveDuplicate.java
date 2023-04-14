package a_ahackerrank.java_basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexRemoveDuplicate {
    public static void main(String[] args) {
        String s1 = "Goodbye bye bye world world world";
        String r1 = "\\b(\\w+)(?:\\W+\\1\\b)+";
        // String r1 = "(?:a|b)c";
        Pattern p1 = Pattern.compile(r1, Pattern.CASE_INSENSITIVE);
        Matcher m1 = p1.matcher(s1);

        int count = 0;
        while (m1.find()) {
            System.out.println(m1.group(1));
        }
    }
}
