
## Refactorización en IntelliJ

<details>
<summary>Descripción</summary>

IntelliJ tiene distintos [métodos de refactorización](https://www.jetbrains.com/help/idea/refactoring-source-code.html)

Dependiendo de sobre qué mostremos el menú de refactorización, nos ofrecerá unas u otras opciones.

Para refactorizar pulsaremos click derecho sobre el nombre del elemento deseado, y deplegaremos la opción *Refactor* del menu contextual.

Los **métodos de refactorización**, también llamados **patrones de refactorización**, nos permiten plantear casos y previsualizar las posibles soluciones que se nos ofrecen.

Podemos seleccionar diferentes elementos para mostrar su menú de refactorización (una clase, una variable, método, bloque de instrucciones, expresion, etc ). A continuación se muestras algunos de los métodos más comunes:

* **Rename**: Es la opción empleada para cambiar el identificador a cualquier elemento (nombre de variable, clase, método, paquete, directorio, etc). Cuando lo aplicamos, se cambian todas las veces que aparece dicho identificador.
-Cambiamos 'm_score1, m_score2' por 'pointsPlayer1. pointsPlayer2'
* **Move**: Mueve una clase (fichero .java)de un paquete a otro y se cambian todas las referencias. También se realiza la misma operación arrastrando la clase de un paquete a otro en el explorador de eclipse.

* **Extract Constant**: Convierte un número o cadena literal en una constante. Se puede ver donde se realizarán los cambios, y también el estado antes y después de refactorizar. Después, todas las apariciones de esa cadena se sustituyen por el nombre de la constante. Esto se utiliza modificar el valor en un solo lugar.

* **Extract Local Variable**: Convierte un número o cadena literal en una variable de ámbito local. Si esa misma cadena de texto existe fuera del bloque o del método, no se aplica el cambio. Parecido al patrón anterior, pero para aplicar dentro de método o bloques de código entre llaves { }.

* **Convert Local Variable to Field**: Convierte una variable local en un atributo privado de la clase. Después de aplicar el patrón de refactorización, todos los usos de la variable local se sustituyen por el atributo.

* **Extract Method**: Convierte un bloque de código en un método, a partir de un bloque cerrado por llaves { }. Eclipse ajusta las parámetros y el retorno del método. Es muy útil cuando detectamos `bad smells` en métodos muy largos, o en bloques de código que se repiten.
 -Cambié 'pointsPlayer1 == pointsPlayer2' por un extract method  'isTie(pointsPlayer1, pointsPlayer2'
* **Change Method Signature**: Permite cambiar el nombre del método y los parámetros que recibe. Se actualizarán todas las dependencias y llamadas al método dentro del proyecto actual.

* **Inline**: Nos permite ajustar una referencia a una variable o método en una sola linea de código.
  ```
  File fichero = new File("datos.dat");
  PrintWriter escritor;
  escritor = new PrintWriter(fichero);

  PrintWriter escritor = new PrintWriter(new File("datos.dat"));
  ```
  
* **Extract Interface**: Este patrón de refactorización nos permite seleccionar los métodos de una clase para crear una `Interface`. Una `Interface` es una plantilla que define los métodos acerca de lo que puede hacer una clase. Define los métodos de una clase (Nombre, parámetros y tipo de retorno) pero no los desarrolla.

* **Extract Superclass**: Permite crear una superclase (clase padre) con los métodos y atributos que seleccionemos de una clase concreta. Lo usamos cuando la clase con la que trabajamos podría tener cosas en común con otras clases, las cuales serían también subclases de la superclase creada.
</details>


