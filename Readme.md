
## Refactorización en IntelliJ



* **Rename** 
-Cambiamos 'm_score1, m_score2' por 'pointsPlayer1. pointsPlayer2'
-Rename variable pointPlayer1 a pointsPlayers en GetTieScores
* **Remove variable**:
-Remove variable score form getTieScores
-Remove  switch en GetTieScores por una tabla string y un if-else 
-Remover la variable score de los paramétros y lo metí dentro de la función getRegularScores 
-Remove switch de la función getRegularScores creando una tabla string
-Remove blucle for, string vacío, int tempScore por una tabla String y un return de la función getRegularScores.
* **Move**: 
* **Extract Constant**: 
* **Extract Local Variable**:

* **Convert Local Variable to Field**: 
* **Extract Method**:
 -Cambié 'pointsPlayer1 == pointsPlayer2' por un extract method  'isTie(pointsPlayer1, pointsPlayer2)'.
 -getAdvangeOrWin
 -score = getAdvangeOrWinScores(pointsPlayer1, pointsPlayer2);
 -score = getRegularScores(pointsPlayer1, pointsPlayer2, score);
*  **Refactor delete**
 -Remove variable tempScore

* **Change Method Signature**:

* **Inline**:
-Refactor: Inline method a la función isAdvantageOrWin para que vuelva a la función getScore.
-Refactor: Inline method a la función getAdvantageOrWinScores para que vuelva a la función getScore.
  
* **Extract Interface**: 
* **Extract Superclass**: 


