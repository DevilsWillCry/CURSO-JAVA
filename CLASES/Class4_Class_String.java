public class Class4_Class_String {
    public static void main(String[] args) {
        //?--------------------------------------------CLASS 'STRING'---------------------------------------------------?//
        /*
         *                        //! String no es un tipo primitivo, es una clase
         *                          ¿Cómo almacenar una cadena de caraceteres?
         * String mi_nombre = "Juan"; -->  Donde "mi_nombre" es un objeto (instancia, ejemplar) de la clase String
         * 
         */
        String str = "Hello, World!";
        //?--------------------------ALGUNOS METODO PARA LA CLASE "STRING"---------------------------------------------?//
        //!--------------------------------------EJEMPLOS-------------------------------------------------------------!//
        //! EJEMPLO 1, length():
        //* length: Devuelve la longitud de una cadena de caracteres.
        System.out.println("Largo del String 'Hello, World!' ---> int: " + str.length() + "\n");
        
        //! EJEMPLO 2, charAt(n):
        //* charAt(n): Devuelve la posición de un carácter dentro de una cadena. (Las posiciones empiezan desde 0).
        System.out.println("Caracter deL indice 7 del String 'Hello, World!' ---> char: " + str.charAt(7) + "\n");

        //! EJEMPLO 3, substring(x,y):
        //* substring(x,y): Devuelve una subcadena dentra de la cadena, siendo 'x' la posición inicial y 'y' la posición final donde se extraerá.
        System.out.println("Substring de 'Hello, Wolrd', desde el indice 0 hasta el indice 3 ---> String: " + str.substring(0, 3) + "\n");

        //! EJMPLO 4, equals(cadena):
        //* equals(cadena): Devuelve 'True' si dos cadenas que se comparan son iguales y 'False' sino lo son. Distingue mayúsculas y minúsculas-
        System.out.println("Comparación de 'Hello, World!' con 'Hello, Java!' Tomando en cuenta Mayus y Minus ---> boolean: " + str.equals("Hello, Java!") + "\n");

        //! EJMPLO 5, equalsIgnoreCase(cadena):
        //* equalsIgnoreCase(cadena): Devuelve 'True' si dos cadenas que se comparan son iguales y 'False' sino lo son.
        System.out.println("Comparación de 'Hello, World!' con 'hello, world' Sin Tomar Mayus y Minus ---> boolean: " + str.equalsIgnoreCase("hello, world!") + "\n");
        //!----------------------------------------------------------------------------------------------------------!//
        //?-----------------------------------------------------------------------------------------------------------?//
    }

}