package Ejercicios_Java;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConverIntToAscii {
    public static void main(String[] args) {
        Scanner IntS = new Scanner(System.in);
        try{
            System.out.println("Introduzco un valor número entero: ");
            int IntAscii = IntS.nextInt();
            char CharAscii = (char) IntAscii;
            System.out.println("Tu valor entero es: " + IntAscii);
            System.out.println("Tu valor convertido en ASCII es: " + CharAscii);
        }
        catch(InputMismatchException e){
            System.out.println("Introduzca un entero! " + e);
        }
        finally{
            IntS.close();
        }
    }
}
