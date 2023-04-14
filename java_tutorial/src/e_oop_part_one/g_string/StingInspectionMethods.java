package e_oop_part_one.g_string;

public class StingInspectionMethods {

    /**
     * String inspection methods examination
     * */

    public static void main(String[] args) {
        printInformation("Hello World");
        printInformation("");
        printInformation("\t    \n");

        String helloWord = "Hello World";
        System.out.printf("index of r = %d %n", helloWord.indexOf('r'));
        System.out.printf("index of World = %d %n", helloWord.indexOf("World"));

        System.out.printf("index of l = %d %n", helloWord.indexOf("l"));
        System.out.printf("last index of l = %d %n", helloWord.lastIndexOf("l"));

        System.out.printf("index of l = %d %n", helloWord.indexOf("l", 3));
        System.out.printf("last index of l = %d %n", helloWord.lastIndexOf("l", 8));

    }

    public static void printInformation(String string) {

        if(string.isEmpty()){
            System.out.println("String is empty");
            return;
        }

        if(string.isBlank()){
            System.out.println("String is blank");
            return;
        }

        int length = string.length();
        System.out.printf("Length = %d %n", length);
        System.out.printf("First char = %c %n", string.charAt(0));
        System.out.printf("Last char = %c %n", string.charAt(length - 1));
    }
}
