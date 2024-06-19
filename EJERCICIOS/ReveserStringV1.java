package Ejercicios_Java;

public class ReveserStringV1 {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String ReverseStr = "";
        for (int i = (str.length()-1); i >= 0 ; i--) {
            ReverseStr += str.charAt(i);
        }
        System.out.println(ReverseStr);
    }

}
