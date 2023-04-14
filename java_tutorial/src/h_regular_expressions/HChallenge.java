package h_regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HChallenge {
    public static void main(String[] args) {
        /**
         * Challenge 1
         * Write a regex that matches with
         * I want a bike.
         * */
        System.out.println("---------Challenge 1---------");
        String challenge1 = "I want a bike.";
        System.out.println(
                challenge1.matches("I want a bike."));

        /**
         * Challenge 2
         * Write a regex that matches
         * I want a bike. OR I want a ball.
         * */
        System.out.println("---------Challenge 2---------");
        System.out.println(challenge1.matches("I want a (bike\\.|ball\\.)"));

        /**
         * Challenge 3
         * Write a regex
         * \\w+ and use it with pattern
         * */
        System.out.println("---------Challenge 3---------");
        String wordRegex = "\\w+.";
        Pattern wordPattern = Pattern.compile(wordRegex);
        Matcher matcher = wordPattern.matcher("I want a bike.");
        System.out.println(matcher.matches());

        /**
         * Challenge 4
         * Replace all blanks with underscores
         * */
        System.out.println("---------Challenge 4---------");
        String challenge4 = "Replace all blanks with underscores";
        String challenge4Regex = "\\s";
        System.out.println(challenge4.replaceAll(challenge4Regex, "_"));
        // Pattern chal4Pat = Pattern.compile(challenge4Regex);
        // Matcher chal4mat = chal4Pat.matcher(challenge4);
        // System.out.println(chal4mat.matches());

        /**
         * Challenge 5 - 6
         * write a regex that match below entirely and
         * bulunan karakterleri kullanabileceğimiz
         * "aaabccccccccdddefffg"
         * */
        System.out.println("---------Challenge 5 - 6---------");
        String chal5 = "aaabccccccccdddefffg";
        String chal5Reg = "^a{3}bc{8}d{3}ef{3}g$"; // bu tam eşleşme
        // "[abcdefg]+" OR "[a-g]+" bunlar genel kapsar
        Pattern chal5Pat = Pattern.compile(chal5Reg);
        Matcher chal5Matcher = chal5Pat.matcher(chal5);
        System.out.println(chal5Matcher.matches());

        /**
         * Challenge 7
         * starts with series of letters and a dot and after
         * a series of numbers
         * */
        System.out.println("---------Challenge 7---------");
        String challenge7 = "abcd.135";
        // (+) burada bu karakter grubundan bir karakteri istediğin kadar koyabilirsin demek
        String regexC7 = "^[A-Z|a-z]+\\.[0-9]+$";
        // String regexC7 = "^[A-Z|a-z]+\\.\\d+$";
        Pattern patternC7 = Pattern.compile(regexC7);
        Matcher matcher7 = patternC7.matcher(challenge7);
        System.out.println(matcher7.matches());

        /**
         * Challenge 8
         * group this
         * "abcd.135uvqz.7tzik.999"
         *
         * and print the number groups
         * */
        System.out.println("---------Challenge 8---------");
        String stringC8 = "abcd.135uvqz.7tzik.999";
        // String regexC8 = "^[A-Z|a-z]+\\.[A-Z|a-z|\\d]+.[A-Z|a-z|\\d]+.\\d+$";
        String regexC8 = "[A-Za-z]+\\.(\\d+)";
        Pattern pattern8 = Pattern.compile(regexC8);
        Matcher matcher8 = pattern8.matcher(stringC8);
        while (matcher8.find()) {
            System.out.println("Occurrence: " + matcher8.group(1));
        }

        /**
         * Challenge 9
         * tabs used to separate the matches \t
         * with one exception
         * last match is new line \n
         * extract all the number
         *
         * "abcd.135\tuvqz.7\ttzik.999\n"
         * */
        System.out.println("---------Challenge 9---------");
        String string9 = "abcd.135\tuvqz.7\ttzik.999\n";
        // String regex9 = "[A-Za-z]+\\.(\\d+)\t\\|(\\d+)\n";
        String regex9 = "[A-Za-z]+\\.(\\d+)\\s";
        Pattern pattern9 = Pattern.compile(regex9);
        Matcher m9 = pattern9.matcher(string9);

        while (m9.find()) {
            System.out.println("Occurrences : " + m9.group(1));
        }

        /**
         * Challenge 10
         * Use same string with challenge 9
         * but this time instead of groups
         * print out their start and end indices.
         * Make those indices inclusive
         * */
        System.out.println("---------Challenge 10---------");
        String string10 = "abcd.135\tuvqz.7\ttzik.999\n";
        // String regex10 = "[A-Za-z]+\\.(\\d+)\t\\|(\\d+)\n";
        String regex10 = "[A-Za-z]+\\.(\\d+)\\s";
        Pattern pattern10 = Pattern.compile(regex10);
        Matcher m10 = pattern10.matcher(string10);
        int count10 = 0;
        while (m10.find()) {
            count10++;
            System.out.println("Occurrence "
                    + count10 + " : "
                    + "starts at : " + m10.start(1)
                    + " ends at : " + (m10.end(1) - 1));
        }

        /**
         * Challenge 11
         * "{0,2}, {0,5}, {1,3}, {2,4}"
         * */
        System.out.println("---------Challenge 11---------");
        String s11 = "{0, 2},{0, 5},{1, 3},{x, y},{2, 4}";
        // String r11 = "\\{[0-9],[ ][0-9]\\},";
        String r11 = "\\{(\\d+, \\d+)\\}";
        Pattern p11 = Pattern.compile(r11);
        Matcher m11 = p11.matcher(s11);
        while(m11.find()){
            System.out.println("Occurrence : " + m11.group(1));
        }

        /**
         * Challenge 12
         * make a match 5 digit US zip code.
         * "11111" for example
         * */
        System.out.println("---------Challenge 12---------");
        String s12 = "11111";
        String r12 = "^\\d{5}$";
        Pattern p12 = Pattern.compile(r12);
        Matcher m12 = p12.matcher(s12);
        System.out.println(m12.matches());

        /**
         * Challenge 13
         * addition to previous example
         * sometimes four digit might follow after dash
         * */
        System.out.println("---------Challenge 13---------");
        String s13 = "11111-1111";
        String r13 = "^\\d{5}-\\d{4}$";
        Pattern p13 = Pattern.compile(r13);
        Matcher m13 = p13.matcher(s13);
        System.out.println(m13.matches());

        /**
         * Challenge 14
         * Make the four digit after the dash optional
         * */
        System.out.println("---------Challenge 14---------");
        String s14 = "11111";
        String r14 = "^\\d{5}(-\\d{4})?$";
        Pattern p14 = Pattern.compile(r14);
        Matcher m14 = p14.matcher(s14);
        System.out.println(m14.matches());
    }
}
