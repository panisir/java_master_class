package c_exressions_statements_metods.a_method_challenge;

public class MethodChallenge {
    public static void main(String[] args) {

        int meloScore = calculateHighScorePosition(1500);
        int keloScore = calculateHighScorePosition(1000);
        int seloScore = calculateHighScorePosition(500);
        int celoScore = calculateHighScorePosition(100);
        int feloScore = calculateHighScorePosition(25);

        displayHighScorePosition("melo", meloScore);
        displayHighScorePosition("kelo", keloScore);
        displayHighScorePosition("selo", seloScore);
        displayHighScorePosition("celo", celoScore);
        displayHighScorePosition("felo", feloScore);

    }

    static void displayHighScorePosition (String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position: " + playerPosition + " on the high score list");
    }

    static int calculateHighScorePosition(int playerScore) {
        if(playerScore >= 1000){
            return 1;
        } else if(playerScore >= 500){ // refactored: && playerScore < 1000
            return 2;
        } else if(playerScore >= 100) { // refactored: && playerScore < 500
            return 3;
        } // refactored:  else{ return 4; }

        return 4;
    }
}
