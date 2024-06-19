public class Class1_Tipos_Variables {
    public static void main(String[] args) {
        //?---------------------------------Tipos de datos en Java (Tipos Primitivos)--------------------------------------------------------?//
        /*--------------------------------------------------------------------------
        //! final: se usa para definir una variable constante, ej: final int num = 5
        ---------------------------------------------------------------------------*/
        //!--------------------------------------------Variables Enteras--------------------------------------------------------------------!//    
        byte var_byte = 35;                                                   //* Declaración de la variable tipo byte, rango: -128 a 127
        var_byte = (byte) (var_byte+1);                                      //* Suma de variables tipo byte 
        System.out.println("Variable Byte: " + var_byte);                   //* Forma de imprimir en pantalla  

        short var_short = 35;                                             //* Declaración de la variable tipo short, rango: -32.768 a 32.768
        var_short = (short) (var_short+2);                               //* Suma de variables tipo short
        System.out.println("Variable Short: " + var_short);             //* Forma de imprimir en pantalla 

        int var_int = 35;                                             //* Declaración de la variable tipo intm, rango: -2.147.483 a 2.147.483
        var_int = var_int+3;                                         //* Suma de variables tipo int
        System.out.println("Variable Int: " + var_int);             //* Forma de imprimir en pantalla 

        long var_long = 35;                                       //* Declaración de la variable tipo logn, rango: -9.223.372.036.854.775.808 a 9.223.372.036.854.775.808
        var_long = var_long+3;                                   //* Suma de variables tipo long
        System.out.println("Variable Long: " + var_long);       //* Forma de imprimir en pantalla         
        //*--------------------------------------------------------------------------------------------------------------------------------*//
        //!---------------------------------------------Variables Decimales---------------------------------------------------------------!//
        float var_float = 35;                                 //* Declaración de la variable tipo float. 6 a 7 Cifras significativas. Sufijo F.
        var_float =  var_float+1.5f;                         //* Suma de variables tipo float 
        System.out.println("Variable Float: " + var_float); //* Forma de imprimir en pantalla  

        double  var_double = 35;                         //* Declaración de la variable tipo Double. 14 a 15 Cifras significativas.
        var_double = var_double+3.1;                    //* Suma de variables tipo Double
        System.out.println("Variable Double: " + var_double); //* Forma de imprimir en pantalla 
        //*--------------------------------------------------------------------------------------------------------------------------------*//  
        //!---------------------------------------------Variables de Texto----------------------------------------------------------------!//
        char character = 'D';                       //* Declaración de la variable tipo char. Solo admite un solo caracter
        System.out.println(character);             //* Forma de imprimir en pantalla 
        //! String no es de tipo primitivo, es una clase llamda String ¡OJO!
        String text = "¡HOOLA!";                 //* Declaración de la variable tipo String. Solo admite multiple caracteres
        System.out.println(text+"A");           //* Forma de imprimir en pantalla 
        //*--------------------------------------------------------------------------------------------------------------------------------*//
        //?------------------------------------------------------------------------------------------------------------------------------?//        
    }
}
