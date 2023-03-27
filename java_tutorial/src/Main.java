import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // System.out.println(getInputFromConsole(2021));
        //System.out.println(getInputFromScanner(2023));
        getInputFromScannerWithWhile();
    }

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi, What's your Name ? ");
        System.out.println("Hi, " + name + ", welcome to the course");
        return "";
    }

    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi What's your name");
        String name = scanner.nextLine();
        System.out.println("Hi, " + name + " welcome to the course");
        return "";
    }

    public static void getInputFromScannerWithWhile() {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";

        do {
            System.out.println("Hi What's your name");
            userInput = scanner.nextLine();
            if (!Objects.equals(userInput, "exit")) {
                System.out.println("Hi, " + userInput + " welcome to the course");
            }

        } while (!Objects.equals(userInput, "exit"));
    }
}