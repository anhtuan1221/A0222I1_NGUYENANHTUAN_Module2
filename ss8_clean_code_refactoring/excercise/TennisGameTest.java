package ss8_clean_code_refactoring.excercise;

public class TennisGameTest {
    public static final String ZERO_SCORE = "Love";
    public static final String ONE_SCORE = "Fifteen";
    public static final String TWO_SCORE = "Thirty";
    public static final String THREE_SCORE = "Forty";
    public static final String ALL = "All";
    public static final String WIN = "Win";
    public static final String DEUCE = "Deuce";
    public static final String ADVANTAGE = "Advantage";

    public static String getScore(String playerOneName, String playerTwoName, int playerOneScore, int playerTwoScore) {
        //deuce
        if (playerOneScore == playerTwoScore) {
            return displayDeuce(playerOneScore);
        }
        //advantage or win
        if (playerOneScore >= 4 || playerTwoScore >= 4) {
            return displayAdvantageOrWin(playerOneName, playerTwoName, playerOneScore, playerTwoScore);
        }
        //translate score
        return displayScore(playerOneScore, playerTwoScore);
    }

    private static String displayDeuce(int score) {
        return translateScore(score) + "-" + ALL;
    }

    private static String displayAdvantageOrWin(String playerOneName, String playerTwoName, int playerOneScore, int playerTwoScore) {
        int minusResult = playerOneScore - playerTwoScore;

        if (minusResult == 1) {
            return ADVANTAGE + " " + playerOneName;
        } else if (minusResult == -1) {
            return ADVANTAGE + " " + playerTwoName;
        } else if (minusResult >= 2) {
            return WIN + " " + playerOneName;
        } else {
            return WIN + " " + playerTwoName;
        }
    }

    private static String displayScore(int playerOneScore, int playerTowScore) {
        return translateScore(playerOneScore) + "-" + translateScore(playerTowScore);
    }

    private static String translateScore(int score) {
        switch (score) {
            case 0:
                return ZERO_SCORE;
            case 1:
                return ONE_SCORE;
            case 2:
                return TWO_SCORE;
            case 3:
                return THREE_SCORE;
            default:
                return DEUCE;
        }
    }
}
