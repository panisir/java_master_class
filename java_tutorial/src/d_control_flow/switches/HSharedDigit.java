package d_control_flow.switches;

public class HSharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 21));

        int year = 2022;
        String userBirth = "1999";
        int dateOfBirth = Integer.parseInt(userBirth);

        System.out.println("Age = " + (year + dateOfBirth));
    }

    public static boolean hasSharedDigit(int n1, int n2) {
        if ((10 < n1 && n1 < 99) || (10 < n2 && n2 < 99)) {

            for (int temp1 = n1; temp1 > 0; temp1 /= 10) {
                int digit1 = temp1 % 10;
                for (int temp2 = n2; temp2 > 0; temp2 /= 10) {
                    int digit2 = temp2 % 10;
                    if (digit2 == digit1) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
