package Ejercicios_Java;

import java.util.*;
import java.util.Scanner;

public class ConvertCharToAscii {
    public static void main(String[] args) {
        Scanner charS = new Scanner(System.in);
        try{
            System.out.println("Introduzca un solo caracter para convertir en código ASCII: ");
            String StrAscii = charS.nextLine();
            if (StrAscii.length() > 1 ){
                    throw new InputMismatchException("Introduzca un solo caracter.");
                }
            else{                
                    char charAscii = StrAscii.charAt(0);
                    int IntAscii = (int) charAscii;
                    System.out.println(IntAscii);
            }
        }
        catch(InputMismatchException e){
                    System.out.println("Introduzca un solo caracter :" + e);
            }
        finally{
                    charS.close();
        }
    }
}
