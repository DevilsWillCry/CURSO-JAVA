package Ejercicios_Java;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerExercise_2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        double r, A, PI;
        PI = Math.PI;
        System.out.println("Ingrese el radio de un circulo. ");
        try {
        r = myObj.nextDouble();
        A = PI *(r*r);
        System.out.printf("El circulo con circuferencia: %.2f, su area es: %.2f",r,A);
        }
        catch (InputMismatchException ex){
            System.out.println("Debe ingresar obligatoriamente un número decimal por comas: " + "\n"+ ex);
        }
        finally{
            myObj.close();
        }
        
    }
}

