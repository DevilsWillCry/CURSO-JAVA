public class Class15_ArraysII {
    public static void main(String[] args) {
        //? -----------------------------ARRAYS II--------------------------------- ?//
        /*
         * Harémos varios ejemplos, en este caso harémos arrays de tipo String 
         * y harémos uso del bucle for each para poder visualizar los elementso que 
         * que contiene el array.
         */
        //? ----------------------------------------------------------------------- ?//
        //! ----------------------------------EJEMPLOS----------------------------- !//
        //! ----------------------------------EJEMPLO 1---------------------------- !//
        String[] Paises = new String[4];

        Paises[0] = "España";
        Paises[1] = "Colombia";
        Paises[2] = "Argentina";
        Paises[3] = "Mexico";

        for (int i = 0; i < Paises.length; i++){
            System.out.println("País "+(i+1)+": "+Paises[i]);
        }
        //! ----------------------------------------------------------------------- !//
        //! ----------------------------EJEMPLO 2, FOR EACH------------------------ !//
        for(String elemento:Paises){
            System.out.println("País en For Each: " +  elemento);
        }
        //! ----------------------------------------------------------------------- !//
        //! -------------------------EJEMPLOS, ARRAY SIMPLIF.---------------------- !//
        /*
         *  Usaremos un Array de Strings[] de la forma simplificada
         */
        String[] PaisesSimplify = {"España", "Colombia", "Argentina", "Mexico"};
        for (String elemento:PaisesSimplify){
            System.out.println("País Array Simplificado: " + elemento);
        }
        //! ----------------------------------------------------------------------- !//
        //! ----------------------------------------------------------------------- !//
    }
}
