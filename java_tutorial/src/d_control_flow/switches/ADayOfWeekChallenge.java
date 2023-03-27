package d_control_flow.switches;

public class ADayOfWeekChallenge {
    public static void main(String[] args) {
        System.out.println(printDayOfWeek(1));
        printNumberInWord(1);
    }

    public static void printNumberInWord(int number) {
        String word = switch (number) {
            case 0 -> "ZERO";
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "EIGHT";
            case 8 -> "NINE";
            case 9 -> "TEN";
            default -> "OTHER";
        };
        System.out.println(word);
    }

    private static String printDayOfWeek(int day) {
        return switch (day) {
            case 1 -> {
                yield "Sunday";
            }
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            default -> "Invalid Name";
        };
    }
}
