package d_control_flow.switches;

public class LoopingAndContinue {
    public static void main(String[] args) {
        // loopWithContinue(0);
        System.out.println(10 % 10);
    }

    public static void loopWithContinue(int number){
        while(number < 50){
            number += 1;
            if(number % 5 != 0){
                continue;
            }
            System.out.print(number + " ");
        }
    }
}
