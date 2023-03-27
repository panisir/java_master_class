package d_control_flow.switches;

public class GEvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
    }

    public static int getEvenDigitSum(int number) {
        int sum = 0;
        if(number < 0){
            return -1;
        }

        for(int temp = number; temp > 0; temp /= 10){
            if((temp % 10) % 2 != 0){
                continue;
            }
            sum += temp % 10;
        }

        return sum;
    }
}
