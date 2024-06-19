package Ejercicios_Java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IVA {
    public static void main(String[] args) {
        final float IVA = 0.21f;
        Scanner SalarioS = new Scanner(System.in);
        try{
            System.out.println("Inserte su salario: ");
            Double SalarioIVA = SalarioS.nextDouble();
            System.out.printf("%.2f",SalarioIVA + (SalarioIVA * IVA));
        }
        catch(InputMismatchException e){
            System.out.println("¡ERROR! Ingrese el salario sin comas.");
        }
        finally{
            SalarioS.close();
        }

    }
}
