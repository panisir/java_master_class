package d_control_flow.switches;

public class FFirstLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(10));
    }

    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }
        int lastDigit = number % 10;
        int firstDigit = 0;
        for(int temp = number; temp > 0; temp /= 10){
            firstDigit = temp % 10;
        }
        return firstDigit + lastDigit;
    }
}
