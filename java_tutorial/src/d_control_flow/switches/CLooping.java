package d_control_flow.switches;

public class CLooping {
    public static void main(String[] args) {
        // loopWithFor();

        System.out.println("While result: " + loopWithWhile(100));
        System.out.println("Do While result: " + loopWithDoWhile(100));
    }

    public static void loopWithFor() {
        for (int i = 0; i < 5; i += 1) {
            System.out.println(i);
            if (i == 3) {
                break;
            }
        }
        System.out.println("The For Loop Ended");
    }

    public static int loopWithWhile(int i) {
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
        return i;
    }

    public static int loopWithDoWhile(int i){
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);

        return i;
    }
}
