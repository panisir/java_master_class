package a_ahackerrank.java_basics;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserNameValidRegex {
    public static void main(String[] args) {
        boolean quit = false;
        Scanner scanner = new Scanner(System.in);
        // String regex = "^[A-Za-z]\\w{2,5}$";
        String regex = "^[a-z]\\w{2,5}$";
        while(!quit){
            System.out.print("Enter Name : ");
            String name = scanner.nextLine();
            name = name.replaceAll("\\s", "");

            if(name.toLowerCase().substring(0,1).equals("q")){
                quit = true;
                break;
            }
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(name);
            if(m.matches()){
                System.out.println("Name is valid");
            }else {
                System.out.println("Name is invalid, please enter a valid name");
            }


        }
    }
}
