package d_control_flow.switches;

public class BSwitchChallenge {
    public static void main(String[] args) {
        System.out.println(findNatoWordWithNewSwitch('D'));
        System.out.println(findNatoWordWithOldSwitch('A'));
    }

    public static String findNatoWordWithNewSwitch(char natoChar) {
        /**
         * Enhanced Switch
         * It came with JDK9
         * Reviewed in JDK12 an JDK13
         * Stabilized in JDK14
         * */
        return switch (natoChar) {
            case 'A' -> "Able";
            case 'B' -> "Baker";
            case 'C' -> "Charlie";
            default -> "Bad Char";
        };
    }

    public static String findNatoWordWithOldSwitch(char natoChar) {
        String natoWord = null;

        switch (natoChar) {
            case 'A':
                natoWord = "Able";
                break;
            case 'B':
                natoWord = "Baker";
                break;
            case 'C':
                natoWord = "Charlie";
                break;
            default:
                natoWord = "Bad Char";
                break;
        }
        return natoWord;
    }
}
