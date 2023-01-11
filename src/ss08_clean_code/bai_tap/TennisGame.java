package ss08_clean_code.bai_tap;

public class TennisGame {
    public static String getScore(String theFirstPlayerName, String theSecondPlayerName, int scoreOfTheFirstName, int scoreOfTheSecondName) {
        String score = "";
        int tempScore = 0;
        boolean isDrawPoint = scoreOfTheFirstName == scoreOfTheSecondName;
        if (isDrawPoint) {
            score = getScore(scoreOfTheFirstName);
        } else {
            boolean isScoreGreater4 = scoreOfTheFirstName >= 4 || scoreOfTheSecondName >= 4;
            if (isScoreGreater4) {
                score = getScore(scoreOfTheFirstName, scoreOfTheSecondName);
            } else {
                score = getScore(scoreOfTheFirstName, scoreOfTheSecondName, score);
            }
        }
        return score;
    }

    private static String getScore(int scoreOfTheFirstName, int scoreOfTheSecondName, String score) {
        int tempScore;
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = scoreOfTheFirstName;
            else {
                score += "-";
                tempScore = scoreOfTheSecondName;
            }
            switch (tempScore) {
                case 0:
                    score += "Love";
                    break;
                case 1:
                    score += "Fifteen";
                    break;
                case 2:
                    score += "Thirty";
                    break;
                case 3:
                    score += "Forty";
                    break;
            }
        }
        return score;
    }

    private static String getScore(int scoreOfTheFirstName, int scoreOfTheSecondName) {
        String score;
        int skewedResult = scoreOfTheFirstName - scoreOfTheSecondName;
        if (skewedResult == 1) score = "Advantage player1";
        else if (skewedResult == -1) score = "Advantage player2";
        else if (skewedResult >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }

    private static String getScore(int scoreOfTheFirstName) {
        String score;
        switch (scoreOfTheFirstName) {
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
}
