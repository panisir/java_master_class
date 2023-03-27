package d_control_flow.switches;

import java.util.Scanner;

public class JReadingInputChallenge {
    public static void main(String[] args) {
        System.out.println("Result is : " + sumInputNumber());
    }

    public static int sumInputNumber() {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        int numberCount = 1;
        do {
            System.out.println("Please Enter the " + numberCount + ". number");
            try {
                sum += Integer.parseInt(scanner.nextLine());
                numberCount++;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid Number");
            }
        } while (numberCount < 6);

        return sum;
    }

}
