public class Class14_Arrays {
    public static void main(String[] args) {
        //? --------------------------------ARRAYS----------------------------------- ?//
        /*
        !                                  ¿Qué es?
         *  Es un estructura de datos que contiene una colección de valores del mismo
         *  tipo.
        !                                 ¿Para qué?
         *  Para almacenar valores que normalmente tienen alguna relación entre si.
         * 
        !   Sintaxis:
         *  Declaración: int[] mi_matriz = new int[10];
         *  Donde:
         * 
         *  int[] --> El tipo de variable que va almacenar en el array
         *  mi_matriz --> Variable donde la declararemos de tipo int y es un array[]
         *  new int[10] --> La cantidad de valores que se van a almacenar en el array
         * 
         * 
         *  Como habíamos visto anteriormente al declarar una variable estamos reservando
         *  un espacio en memoria con un valor.
         * 
         *  Una matriz es un grupo de valores que se van almacenar, una representación
         *  de una variable es un cajón donde vamos a guardar un valor, y una matriz
         *  sería un archivador donde guardaremos muchos valores.
         * 
         *  Hay dos formas de declarar un Array:
         * - int[] mi_matriz = new int[5]; Esto es para inicializar e introducir valores
         * - int[] mi_matriz = {1,2,3,4,5}; Esto es para inicializar con valores el array
         */
        //? ------------------------------------------------------------------------- ?//
        //! ------------------------------EJEMPLOS---------------------------------- !//
        //! ------------------------------EJEMPLO 1--------------------------------- !//
        int[] mi_matriz = new int[5];  //* Inicializamos el array de tipo int[]
        
        mi_matriz[0] = 50;//*   Añadimos valores a la maitriz en la posición [0]
        mi_matriz[1] = 30;//*   Añadimos valores a la maitriz en la posición [1]
        mi_matriz[2] = 5;//*    Añadimos valores a la maitriz en la posición [2]
        mi_matriz[3] = 20;//*   Añadimos valores a la maitriz en la posición [3]
        mi_matriz[4] = 2;//*    Añadimos valores a la maitriz en la posición [4]
        
        System.out.println("Sin el bucle for: ");
        System.out.println(mi_matriz[0]);
        System.out.println(mi_matriz[1]);
        System.out.println(mi_matriz[2]);
        System.out.println(mi_matriz[3]);
        System.out.println(mi_matriz[4]);
        /*
         * Esta no es la forma ideal para recorrer los elementos de un array, 
         * es por ello que se utiliza un buclo for para simplificar las cosas
         */
        //! ------------------------------------------------------------------------ !//
        //! ------------------------------EJEMPLO 2--------------------------------- !//
        System.out.println("Desde el bucle for: ");
        for(int i = 0; i<mi_matriz.length-1;i++){
            System.out.println(mi_matriz[i]);
        }
        /*
         * La forma en que se imprimen va a ser la misma con la diferencia de que esta
         * forma es mucho más comoda y requiero menos lineas de código.
         */
        //! ------------------------------------------------------------------------ !//
        //! ------------------------------------------------------------------------ !//



    }
}
