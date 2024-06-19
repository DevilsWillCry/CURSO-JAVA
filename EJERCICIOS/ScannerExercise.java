package Ejercicios_Java;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerExercise {
    public static void main(String[] args) {
        Scanner myNum1 = new Scanner(System.in);
        Scanner myNum2 = new Scanner(System.in);
        int NumA, NumB;
        try{
            System.out.println("Ingresa el primer Numero: ");
            NumA = myNum1.nextInt();
            System.out.println("Ingresa el segundo Numero: ");
            NumB = myNum2.nextInt();
            if (NumA == NumB){
                System.out.printf("¡El Primer Número: %d y el Segundo Número: %d son iguales!",NumA,NumB);
            }
            else{
                System.out.println("Ambos números no son iguales");
            }
        }
        catch (InputMismatchException ex){
            System.out.println("Ingrese obligatoriamente un númeor entero. " + "\n" + ex);
        }
        finally{
            myNum1.close();
            myNum2.close();
        }
    }
}
