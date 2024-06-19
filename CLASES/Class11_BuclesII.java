import java.util.Scanner;

public class Class11_BuclesII {
    public static void main(String[] args) {
        //? --------------------------------------BUCLES II-------------------------------------- ?//
        /*
         *  En Bucles II haremos unos ejemplos de Do While.
         *  Donde la Sintaxis es la siguiente: 
         * 
         *  -Do{
         *     -Linea de código 1 ↓ ↑
         *     -Linea de código 2 ↓ ↑  -> Ciclará al menos una vez antes de la condición while
         *     -Linea de código 3 ↓ ↑
         * }While(condición);
        */
        //? ------------------------------------------------------------------------------------- ?//
        //! -------------------------------------EJEMPLOS--------------------------------------- !//
        //! -----------------------------------EJEMPLO DO WHILE--------------------------------- !//
        /*
         * En este caso haremos un juego de adivinar un número usando la librería Math.random()
         * de java.lang, biblioteca predeterminada que usa java
         * 
         * Primeramento usaremos do-while, en este caso queremos que se ejecuta al menos una vez
         * antes de evaluar la condición de While.
         * 
         * En este caso pediremos al usuario un número que almacenaremos en la variable "Numero".
         * Una vez hecho esto haremos los condicionales para cuando un número es mayor o menor
         * y en caso de ser los mismo saldremos del ciclo do-while e imprimeremos que hemos ganado
         * y la cantidad de intentos que nos tomo adivinar el número.
         * 
         */
        int RandomN = (int) (Math.random() * 100);
        int Numero = 0;
        int Intentos = 0;
        Scanner MyNumber = new Scanner(System.in);
        do{
            System.out.println("===========================");
            System.out.println("Inserte un número entero: ");
            System.out.println("===========================");
            Numero = MyNumber.nextInt();
            if(Numero < RandomN){
                System.out.println("El número es más grande. D:");
                Intentos++;
            }
            else if(Numero > RandomN){
                System.out.println("El número es más pequeño. D:");
                Intentos++;
            }

        }while(Numero != RandomN);
        System.out.printf("¡Has ganado!, Has adivinado el número %d en %d intentos. :)", RandomN, Intentos);
        MyNumber.close();

        //! ------------------------------------------------------------------------------------ !//
        //! ------------------------------------------------------------------------------------ !//
    }
}

