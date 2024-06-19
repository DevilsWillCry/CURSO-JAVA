package Ejercicios_Java;



public class JavaLoops {
    public static void main(String[] args) {
        int N = 2;
        for(int i = 0; i < 10; i++) {
            System.out.printf("%d x %d = %d",N, i+1,(N*(i+1)));
            System.out.println();
        }
    }
}

