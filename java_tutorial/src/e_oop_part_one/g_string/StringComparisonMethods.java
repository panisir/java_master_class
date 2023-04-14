package e_oop_part_one.g_string;

public class StringComparisonMethods {
    public static void main(String[] args) {
        String helloWorld = "Hello World";
        String helloWordLower = helloWorld.toLowerCase();

        if (helloWorld.equals(helloWordLower)) {
            System.out.println("Values match exactly");
        }

        if (helloWorld.equalsIgnoreCase(helloWordLower)) {
            System.out.println("Values match ignoring case");
        }

        if (helloWorld.startsWith("Hello")) {
            System.out.println("String starts with Hello");
        }

        if (helloWorld.endsWith("World")) {
            System.out.println("String ends with World");
        }

        if (helloWorld.contains("World")) {
            System.out.println("String contains World");
        }

        if(helloWorld.contentEquals("Hello World")){
            System.out.println("Values match exactly");
        }
    }
}
