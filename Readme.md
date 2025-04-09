
## Refactorización en IntelliJ



* **Rename** 
-Cambiamos 'm_score1, m_score2' por 'pointsPlayer1. pointsPlayer2'
* **Remove variable**:
-Remove variable score form getTieScores
* **Move**: 
* **Extract Constant**: 
* **Extract Local Variable**:

* **Convert Local Variable to Field**: 
* **Extract Method**:
 -Cambié 'pointsPlayer1 == pointsPlayer2' por un extract method  'isTie(pointsPlayer1, pointsPlayer2'.
 -getAdvangeOrWin
 -score = getAdvangeOrWinScores(pointsPlayer1, pointsPlayer2);
 -score = getRegularScores(pointsPlayer1, pointsPlayer2, score);
*  **Refactor delete**
 -Remove variable tempScore

* **Change Method Signature**:

* **Inline**:
  ```
  File fichero = new File("datos.dat");
  PrintWriter escritor;
  escritor = new PrintWriter(fichero);

  PrintWriter escritor = new PrintWriter(new File("datos.dat"));
  ```
  
* **Extract Interface**: 
* **Extract Superclass**: 


