public class Main {
    /**
     * metodo para devolver la puntuacion de tenis
     */
    public static String getScore(int pointsPlayer1, int pointsPlayer2) {


        if (GetTieScores(pointsPlayer1, pointsPlayer2)) {
            return GetTieScores(pointsPlayer1);
        }
        else if (isAdvantageOrWin(pointsPlayer1, pointsPlayer2))
        {
            return getAdvangeOrWinScores(pointsPlayer1, pointsPlayer2);
        }
        else
        {
            return getRegularScores(pointsPlayer1, pointsPlayer2);

        }

    }

    private static String getRegularScores(int pointsPlayer1, int pointsPlayer2) {
        String score = "";
        int tempScore;
        for (int i = 1; i<3; i++)
        {
            if (GetTieScores(i, 1)) tempScore = pointsPlayer1;
            else { score +="-"; tempScore = pointsPlayer2;}
            switch(tempScore)
            {
                case 0:
                    score +="Love";
                    break;
                case 1:
                    score +="Fifteen";
                    break;
                case 2:
                    score +="Thirty";
                    break;
                case 3:
                    score +="Forty";
                    break;
            }
        }
        return score;
    }

    private static String getAdvangeOrWinScores(int pointsPlayer1, int pointsPlayer2) {
        String score;
        int minusResult = pointsPlayer1 - pointsPlayer2;
        if (GetTieScores(minusResult, 1)) score ="Advantage player1";
        else if (GetTieScores(minusResult, -1)) score ="Advantage player2";
        else if (minusResult>=2) score = "Win for player1";
        else score ="Win for player2";
        return score;
    }

    private static boolean isAdvantageOrWin(int pointsPlayer1, int pointsPlayer2) {
        return pointsPlayer1 >= 4 || pointsPlayer2 >= 4;
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