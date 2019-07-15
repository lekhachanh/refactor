public class TennisGame {

    public static String getScore(String playerName, int playerScore) {
        String score = "";

        switch (playerScore) {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;
        }
        return score;
    }

    public static int isAdvantage(int player1Score, int player2Score) {
        if (player1Score >= 4 || player2Score >= 4) {
            int minusResult = player1Score - player2Score;
            if (minusResult == 1) {
                return 1;
            } else if (minusResult == -1) {
                return -1;
            }
        }
        return 0;
    }

    public static int isWin(int player1Score, int player2Score) {
        if (player1Score >= 4 || player2Score >= 4) {
            int minusResult = player1Score - player2Score;
            if (minusResult >= 2) {
                return 1;
            } else {
                return -1;
            }
        }
        return 0;
    }
}