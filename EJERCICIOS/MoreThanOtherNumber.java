package Ejercicios_Java;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MoreThanOtherNumber{
    public static void main(String[] args) {
        Scanner myNum = new Scanner(System.in);
        double Num;
        try {
            System.out.println("Ingrese un número entero o decimal(separado por comas)");
            Num = myNum.nextDouble();
            if (Num > 0 ){
                System.out.printf("El número: %.2f es mayor que 0.",Num);
            }
            else if (Num == 0){
                System.out.printf("El número: %.2f es igual 0.",Num);
            }
            else{
                System.out.printf("El número: %.2f es menor que 0.",Num);
            }
        }
        catch(InputMismatchException ex){
            System.out.println("Ingrese obligatoriamente un número decimal o entero"+ "\n" + ex);
        }
        finally{
            myNum.close();
        }
    }
}
