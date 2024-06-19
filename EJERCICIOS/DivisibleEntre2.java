package Ejercicios_Java;
import java.util.InputMismatchException;
import java.util.Scanner;


public class DivisibleEntre2 {
    public static void main(String[] args) {
        Scanner intS = new Scanner(System.in);
        System.out.println("Inserte un número entero: ");
        try{
            int Number = intS.nextInt();
            if (Number%2 == 0){
                System.out.println("El número es divisible entre 2");
            }
            else{
                System.out.println("El número no es divisible entre 2 :(");
            }
        }
        catch(InputMismatchException e){
            System.out.println("El valor introducido tiene que ser estrictamente entero: " + e);
        }
        intS.close();
        
    }

}
