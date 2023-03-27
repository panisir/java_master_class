package d_control_flow.switches;

public class EPalindromeNumbers {

    public static void main(String[] args) {
        System.out.println("Result: " + isPalindrome(1001));
    }

    public static boolean isPalindrome(int number) {
        int reversed = 0;
        int turn = 1;

        for (int temp = number; number > 0 ? temp > 0 : temp < 0; temp /= 10) {
            System.out.println("---- " + turn + ". turn ----");
            int digit = temp % 10;
            System.out.println("Digit: " + digit);
            reversed = reversed * 10 + digit;
            System.out.println("Reversed: " + reversed);
            System.out.println("Temp: " + temp);
            turn++;
        }

        System.out.println("-------");

        return number == reversed;

    }
}
