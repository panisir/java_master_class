package b_intellij_basics;

public class SectionChallenge {
    public static void main(String[] args) {
        double firstValueDouble = 20.00d;
        double secondValueDouble = 80.00d;
        double result = (firstValueDouble + secondValueDouble) * 100.00d;
        double remainder = result % 40.00d;
        boolean isRemainderZero = (remainder == 0) ? true : false;
        System.out.println("Remainder is zero: " + isRemainderZero);

        if(!isRemainderZero) {
            System.out.println("Got Some Remainder");
        }

    }
}
