public class Main {
    /**
     * metodo para devolver la puntuacion de tenis
     */
    public static String getScore(int pointsPlayer1, int pointsPlayer2) {


        if (GetTieScores(pointsPlayer1, pointsPlayer2)) {
            return GetTieScores(pointsPlayer1);
        }
        else if ((pointsPlayer1 >= 4 || pointsPlayer2 >= 4)&& (pointsPlayer1 - pointsPlayer2 == 1|| pointsPlayer1 - pointsPlayer2 ==-1))
        {
            String score = "";
            int minusResult = pointsPlayer1 - pointsPlayer2;
            if (GetTieScores(minusResult, 1)) score ="Advantage player1";
            else if (GetTieScores(minusResult, -1)) score ="Advantage player2";
            return score;
        }
    
        else if (pointsPlayer1 >= 4 || pointsPlayer2 >= 4)
    {
        String score;
        int minusResult = pointsPlayer1 - pointsPlayer2;
        if (minusResult>=2) score = "Win for player1";
        else score ="Win for player2";
        return score;
    }
        else
        {
            return getRegularScores(pointsPlayer1, pointsPlayer2);

        }

    }

    private static String getRegularScores(int pointsPlayer1, int pointsPlayer2) {

        String[] regularScores = {"Love", "Fifteen", "Thirty", "Forty"};
        return regularScores[pointsPlayer1] + "-" + regularScores[pointsPlayer2];
    }

    private static String GetTieScores(int pointsPlayer) {
        String[] tieScores = {"Love-All", "Fifteen-All", "Thirty-All", "Forty-All"};
        if (pointsPlayer >= 0 && pointsPlayer <= 3) {
            return tieScores[pointsPlayer];
        } else {
            return "Deuce";
        }
    }

    private static boolean GetTieScores(int pointsPlayer1, int pointsPlayer2) {
        return pointsPlayer1 == pointsPlayer2;
    }
}