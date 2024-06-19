import java.util.Scanner;

public class Class9_EntradasFlujo_Condicionales {
    public static void main(String[] args) {
        //? ----------------------------------Condicionales I------------------------------------------- ?//
        /*
         *                                     Flujo de ejecucción.
         *  Es el orden que sigue la ejecucción de un programa en Java. Lo que hemos visto es que 
         *  cuando ejecutamos un programa en Java siempre empieza por el metodo main de arriba a abajo
         *  de forma secuencial.
         *  
         *  Public static void main(String[] args){
         *   -Linea de código 1   ↓ 
         *   -Linea de código 2   ↓  ---> Ejecucion secuencial haciendo salto de lineas.
         *   -Linea de código 3   ↓
         * }
         * //! -----------------------------Condicinales en Java--------------------------------------
         * //! Condicional if:
         *  if (condición){
         *    - Códiog a ejecutar si la condición es verdadera(True):
         * }
         * El if también se puede acompañar con otra condición llamda "else".
         * 
         * //! Condicional Switch:
         *  Es util cuando se quiere evaluar una cantidad considerable de condiciones "FIJAS":
         *   Switch (valor a evaluar){
         *       - Case valor1:
         *             - Códido a ejecutar;
         *             - break; --> Rompe el switch cuando se ejecute el código.
         *       - Case valor2:
         *              - Código a ejecutar;
         *              - break;
         * }
         * El switch se puede acompañar con otra condición llamada "default".
         */
        //? -------------------------------------------------------------------------------------------- ?//
        //! --------------------------------------EJEMPLOS---------------------------------------------- !//
        //! ---------------------------EJEMPLO 1, SCANNER y CONDICIONAL IF------------------------------ !//
        Scanner edadS = new Scanner(System.in);                     
        System.out.println("Introduce tu edad por favor");
        int edad = edadS.nextInt();        
        if (edad >= 18){
            System.out.println("¡Eres mayor de edad!");
        }
        else{
            System.out.println("Eres menor de edad");
        }
        //! ------------------------------------------------------------------------------------------ !//
        //! -----------------------------EJEMPLO 2, SCANNER Y SWITCH---------------------------------- !//
        Scanner SemanaS = new Scanner(System.in);
        System.out.println("Introduce un día de la semana: ");
        String Dia = SemanaS.nextLine().toLowerCase();
        switch (Dia) {
            case "lunes":
                System.out.printf("El %s tienes que ir a la Universidad.", Dia);
                break;
            case "martes":
                System.out.printf("El %s tienes gimnasio.", Dia);
                break;                
            case "miercoles":
                System.out.printf("El %s tienes una cita con el medico.", Dia);
                break;            
            case "jueves":
                System.out.printf("El %s tienes que ir a la Universidad.", Dia);
                break;            
            case "viernes":
                System.out.printf("El %s descansas.", Dia);
                break;                                        
            default:
                System.out.printf("Opción no valida, introduce un día valido de la semana");
                break;
        }
        //! ------------------------------------------------------------------------------------------ !//
        SemanaS.close();
        edadS.close();

    }
}
