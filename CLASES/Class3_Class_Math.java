public class Class3_Class_Math {
    public static void main(String[] args) {
    //?--------------------------------------Clase Math en JAVA--------------------------------------?//
    int a = 2;
    int b = 4;
    /*
     *                     ¿Que es la clase Math?
     * La clase math en JAVA contiene un muestrario de métodos que nos permitirán realizar 
     * calculo matematicos.
     * //!Metodos de la clase Math:
     * Math.sqrt(n): Raíz cuadrada de un número.
     * Math.pow(base, exponente): Potencia de un número. Base y exponente son de tipo **double**.
     * Math.sin(ángulo): Seno del ángulo.
     * Math.cost(ánuglo): Coseno del ángulo.
     * Math.tan(ángulo): Tangente del ángulo.
     * Math.atan(ángulo): Arcotangente del ángulo.
     * Math.round(decimal): Redondeo de un número.
     * Math.PI: Constante de clase con el número PI.
     */
    //!----------------------------------------EJEMPLOS:----------------------------------------------!//
    //! EJEMPLO 1, RAIZ CUADRADA DE UN NUMERO
    /*
    * Math.sqrt devuelve siempre un valor **double**, tomar esto en cuenta al almacenar el valor
    * double c = Math.sqrt(a); Estaría correcto hacer esto ya que es de tipo **double**
     */
    System.out.println("Raiz cuadrada de a: " + Math.sqrt(a));
    System.out.println("Raiz cuadrada de b: " + Math.sqrt(b));
    //!-------------------------------------------------------------------------------------------------
    //! EJEMPLO 2,  POTENCIA DE UN NÚMERO
    /*
    * Math.POW devuelve siempre un valor **double**, tomar esto en cuenta al almacenar el valor
    * double c = Math.pow(a,b); Estaría correcto hacer esto ya que es de tipo **double**
     */
    System.out.println("Potencia de a**b:" + Math.pow(a, b));
    //!----------------------------------------------------------------------------------------------!//
    //!-------------------------------------------------------------------------------------------------
    //! EJEMPLO 3, CONSTANTE PI
    /*
    * Math.PI devuelve siempre un valor **double** constante, tomar esto en cuenta al almacenar el valor
    * double c = Math.PI; Estaría correcto hacer esto ya que es de tipo **double**
     */
    System.out.println("CONTASTEN PI: " + Math.PI);
    //!----------------------------------------------------------------------------------------------!//   
    //! EJEMPLO 4, Rodendo de un número
    /*
    * Math.round devuelve un valor de acuerdo al tipo de variable al que se le pasara como argumento
    * Math.round(float arg) -> Retornará un int.
    * Math.round(double arg) -> Retornará un long.
     */
    float c = 1.52323f;
    double d = 1.5675454343;
    System.out.println("Rondeo de C tipo float a int: " + Math.round(c));
    System.out.println("Rondeo de D tipo double a long: " + Math.round(d));
    //!----------------------------------------------------------------------------------------------!//   
    //?---------------------------------------------------------------------------------------------?//
    }
}
