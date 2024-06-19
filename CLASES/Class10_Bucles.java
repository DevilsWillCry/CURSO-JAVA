//import javax.swing.JOptionPane;
import java.util.Scanner;

public class Class10_Bucles {
    public static void main(String[] args) {
        //? --------------------------------------BUCLES-------------------------------------- ?//
        /*
         * Los bucles den Java se dividen en dos categorias: 
         * -Bucles indeterminados
         * -Bucles determinados
         * 
         * -Bucles indeterminados:
         *     * While
         *     * Do-While
         * - Bucles Determinados:
         *     * For
         *     * ForEach
         * La función del bucle es repetir una serie de lineas de código dentro de un programa.
         * 
         * Sintaxis Bucles indeterminados:
         *
         *  -While (condición){
         *     Linea de código 1. ↓ ↑
         *     Linea de código 2. ↓ ↑  → Ciclará hasta cumplir la condición del While
         *     Linea de código 3. ↓ ↑
         * }
         * - Do{
         *      -Linea de código 1 ↓ ↑
         *      -Linea de código 2 ↓ ↑  -> Ciclará al menos una vez antes de la condición while
         *      -Linea de código 3 ↓ ↑
         *  }While(condición);
         * 
         * Sintaxis Bucles determinados:
         * 
         * For convencional:
         * - for (inicio bucle; Condición bucle; Contador bucle) {
         *      Linea de código 1  ↓ ↑      
         *      Linea de código 2  ↓ ↑ --> Ciclará una cantidad n determinada dada en los argumentos iniciales
         *      Linea de código 3  ↓ ↑
         *  }
         * ForEach:
         *   String[] args = {"HOLA" , "MUNDO"};
         * - for (String string : args) {
         *      Linea de código 2  ↓ ↑      
         *      Linea de código 1  ↓ ↑ --> Ciclará una cantidad n determinada dada en los argumentos iniciales
         *      Linea de código 3  ↓ ↑
         * }
         */
        //? ---------------------------------------------------------------------------------- ?//
        //! ----------------------------------EJEMPLOS---------------------------------------- !//
        //! --------------------------------EJEMPLO WHILE------------------------------------- !//
        //String validation = "Miguel";
        //String password = "";
        //while(validation.equals(password) == false){
        //    password = JOptionPane.showInputDialog("Inserte la contraseña, Ejemplo While:");
        //    if (validation.equals(password) == false){
        //        System.out.println("Contraseña Incorrecta");
        //    }
        //}
        //System.out.println("Contraseña Correcta, acceso permitido...");
        //! ---------------------------------------------------------------------------------- !//
        //! -----------------------------ADIVINA EL NÚMERO-----------------------------------  !//
        /*
         * 
         */
        int N = (int) (Math.random()*100);
        Scanner MyTurn = new Scanner(System.in);
        int MyTurnN = 0;
        int Intentos = 10;
        while(MyTurnN != N){
            System.out.println("===========================");
            System.out.println("Inserte un número: ");
            System.out.println("===========================");
            MyTurnN = MyTurn.nextInt();
            if(MyTurnN < N && Intentos != 0){
                System.out.println("El número es más grande..");
                Intentos--;
                System.out.printf("Te quedan: %d intentos D: \n", Intentos);
            }
            else if(MyTurnN > N && Intentos != 0){
                System.out.println("El número es más pequeño..");
                Intentos--;
                System.out.printf("Te quedan: %d intentos D: \n", Intentos);
            }
            else{
                System.out.println("¡Has ganado!"); 
            }
            if (Intentos == 0){
                System.out.println("Has perdido :c, te quedaste sin intentos");
                break;
            }
        }
        MyTurn.close();
        //! ---------------------------------------------------------------------------------- !//
        //! ---------------------------------------------------------------------------------- !//

    }
}
