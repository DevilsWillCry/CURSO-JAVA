package Ejercicios_Java;
import java.util.Arrays;
public class CreateArray{
    public static void main(String[] args) {
        /*
         *                        //! String no es un tipo primitivo, es una clase
         *                          ¿Cómo almacenar una cadena de caraceteres?
         * String mi_nombre = "Juan"; -->  Donde "mi_nombre" es un objeto (instancia, ejemplar) de la clase String
         */
        String str = "Hello, World!";
        String replace_str = str.replace(",","");
        System.out.println(replace_str);
        int a = 123;
        int [] arrayInt = new int[(Integer.toString(a)).length()];
        String a_string = Integer.toString(a);
        for (int i = 0; i < arrayInt.length; i++){
            System.out.println("Posicion :"+ i + " String: " + a_string.substring(i,i+1));
            arrayInt[i] = Integer.parseInt(a_string.substring(i,i+1));
        }
        System.out.println(Arrays.toString(arrayInt));
        for (int element: arrayInt){
            System.out.println(element);
        }
        String str_joined = String.join(", ", a_string,str);
        System.out.println(str_joined);
    }

}