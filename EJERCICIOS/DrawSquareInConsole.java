package Ejercicios_Java;

public class DrawSquareInConsole {
    public static void main(String[] args) {
        String Square = "";
        int Size = 5;
        for (int i = 0; i < Size; i++) {
            for (int j = 0; j < Size; j++){
                Square += " *";
            }
            Square += "\n";
        }
        System.out.println(Square);    
    }
}
