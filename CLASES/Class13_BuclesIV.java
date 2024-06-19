public class Class13_BuclesIV {
    public static void main(String[] args) {
        //? -------------------------------BUCLES IV------------------------ ?//
        /*
         *  En Bucles IV harémos vaiors ejemplos del Bucle determinado ForEach
         *  Donde la sintaxis es la siguiente:
         * 
         *   String[] args = {"HOLA" , "MUNDO"}; 
         * - for (String string : args) {
         *      Linea de código 1  ↓ ↑      
         *      Linea de código 2  ↓ ↑ --> Ciclará una cantidad n determinada dada en los argumentos iniciales
         *      Linea de código 3  ↓ ↑
         * }
         * 
         * Donde solamente le pasaremos un parametro al for:
         *  - Si el array es tipo string le pasaremos una variable local de tipo String
         *  Ejemplo:
         *      - String[] args = {"HOLA" , "MUNDO"}; 
         *        for(String i: args)
         */

        //? ---------------------------------------------------------------- ?//
        //! ---------------------------EJEMPLOS----------------------------- !//
        //! -----------------------EJEMPLOS FOR EACH------------------------ !//
        String[] nombres = {"Miguel", "Angel", "Juan", "Sebastian"};
        for(String i: nombres){
            System.out.println("Nombres: " + i);
        }
        //! ---------------------------------------------------------------- !//
        //! ---------------------------------------------------------------- !//

    }
}
