package Ejercicios_Java;

public class SwitchDivisible2 {
    public static void main(String[] args) {
        int N = 3;
        switch (N%2) {
            case 0:
                System.out.println("El número introducido es divisible entre 2.");
                break;
            default:
                System.out.println("El número introducido no es divisible entre 2.");
                break;
        }
    }
}
