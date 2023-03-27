package b_intellij_basics.b_logical_and_ops;

public class LogicalAndOR {
    public static void main(String[] args) {
        int topScore = 99;
        int secondTopScore = 90;

        if(topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top and smaller than the top");
        }

        if(topScore > 90 || secondTopScore <= 90){
            System.out.println("Either or both of the conditions are true");
        }
    }
}