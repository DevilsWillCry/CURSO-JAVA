import java.util.Scanner;

public class Class7_Entrada_Salida_Datos {
    public static void main(String[] args) {
        //? ----------------------------------ENTRADAS Y SALIDAS DE DATOS--------------------------------------- ?//
        /*
         *  Para poder visualizar información o salidas del programa lo hemos extraido usando System.out.print
         *  Pero hay una manera más interesante a la hora de introducir valores en el programa.
         *  Esto se denomina como GUI (Graphics User Interface) o IGU(Interface grafica de usuario)
         *  Se pretende crear una especie de formula que nos permete la información del programa como introducir valores
         * 
         *  Más adelante profundizaremos en swing y awt para crear un interfaz en condiciones.
         *  
         *  De momento utilizaremos la clase Scanner o JOptionPane y utilizaremos un metodo estatico ---> shoInputDialog()
         *  Pero hay un problema y es que es un metodo estatico. que quiere decir.
         *  Que para poder utilizarlo tendremos que invocar a la Clase y no tendremos que instanciar la clase:
         *  ShowInputDialog() --> JOptionPane.ShowInputDialog()
         *  sqrt --> Math.sqrt()
         *
         */
        //? --------------------------------------------------------------------------------------------------- ?//
        //! ----------------------------------------EJEMPLOS--------------------------------------------------- !//
        //! -------------------------------EJEMPLO 1, USO DEL SCANNER EN UN STRING----------------------------- !//
        Scanner Entrada = new Scanner(System.in);                    //*1. Crearemos un objeto de la clase Scanner para tomar datos
        System.out.println("Introduzca una palabra: ");           //* 2. Imprimimos en pantalla
        String str = Entrada.nextLine();                           //*  3. Guardamos en una variable tipo String el dato introducido del Scanner
        Entrada.close();                                          //*   4. Cerramos el Scanner
        System.out.println(str);                                 //*    5. Imprimimos el dato extraido del Scanner        
        //! --------------------------------------------------------------------------------------------------- !//
        //! --------------------------------EJEMPLO 2, USO DEL SCANNER EN UN INT------------------------------- !//
        Scanner Entero = new Scanner(System.in);                    //*1. Crearemos un objeto de la clase Scanner para tomar datos
        System.out.println("Introduzca un valor entero: ");      //* 2. Imprimimos en pantalla
        int num = Entero.nextInt();                               //*  3. Guardamos en una variable tipo int el dato introducido del Scanner
        Entero.close();                                          //*   4. Cerramos el Scanner
        System.out.println(num);                                //*    5. Imprimimos el dato extraido del Scanner        
    }
}
