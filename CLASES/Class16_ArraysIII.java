import java.util.Arrays;

public class Class16_ArraysIII {
    public static void main(String[] args) {
        //? ---------------------------------ARRAYS III--------------------------- ?//
        /*
         * MATRICES BIDIMENSIONALES:
         * En Java no existe los arrays bidimensionales, que quiere decir que en Java
         * habrá un Array dentro de otro Array.
         * En Java existen lo que se les denomina Arrays multidimensionales. Pero eso
         *  ya requiere una complejidad extra. 
         * 
         * ¡OJO! Un Array Bidimensional no es una tabla, simplemente es una array
         * con posiciones, ya que depende de como lo veamo sera sus filas o sus
         * columnas
         */
        //? ---------------------------------------------------------------------- ?//
        //! ---------------------------------EJEMPLOS----------------------------- !//
        //! ----------------------EJEMPLO 1, Array Bidimensional------------------ !//
        int[][] ArrayBidimensional = new int[3][3];
        
        for(int i = 0; i < ArrayBidimensional.length; i++){
            for(int j = 0; j < ArrayBidimensional.length; j++){
                ArrayBidimensional[i][j] = (int)(Math.random()*10);
            }
        }
        /*
         * Arrays.ToString, funciona para arrays simple y no anidados.
         * Arrays.deepToString, funciona para Arrays anidados.
         * 
         * Se usa en caso de poder visualizar un Array de n dimensiones
         */
        for(int[] ELEMENTS: ArrayBidimensional){
            System.out.println(Arrays.toString(ELEMENTS));
        }        
        for(int[] ELEMENTS: ArrayBidimensional){
            System.out.println("Forma matricial: " + Arrays.toString(ELEMENTS));
            for(int EACH_VALUE: ELEMENTS){
                System.out.println("Iteración de la matriz: " + EACH_VALUE);
            }
        }
        
        //! ---------------------------------------------------------------------- !//
        //! -------------------EJEMPLO 2, ARRAY TRIDIMENSIONAL-------------------- !//
        //* ARRAY3D ---> Array[2][3][3], Array 3D de 2 posiciones, 3 filas y 3 columns
        int[][][] Array3D = {
                            {   {1,2,3},
                                {4,5,6},
                                {7,8,9}},

                            {   {10,11,12},
                                {13,14,15},
                                {16,17,18}}                                
        };
        int count = 0;
        for(int[][] ELEMENTS: Array3D) {
            count ++;
            System.out.printf("Posición %d, Array de 3 dimensiones[2][3][3] \n", count);
            for(int[] EACH_ELEMENT: ELEMENTS) {
                System.out.println(Arrays.toString(EACH_ELEMENT));
            }
            System.out.println();
        }
        //! ---------------------------------------------------------------------- !//
        //! ---------------------EJEMPLO SUELDO, 2 DIMENSIONES-------------------- !//
        double acumulado = 0;
        double interes = 0.10;
        double[][] saldo = new double[5][6];
        for(int row = 0; row < 5; row++){
            for(int column = 0; column < 6; column++){
                if (row == 0){
                    saldo[row][column] = 10000;
                }
                else{
                    acumulado = saldo[row-1][0]+(saldo[row-1][0]*interes); 
                    if( column == 0){
                        saldo[row][0] = acumulado;
                    }
                    else{
                        interes += 0.01;
                        saldo[row][column] = saldo[row-1][column] + (saldo[row-1][column]*interes);
                    }
                }
            }
            interes = 0.10;
        }

        for(double[] ELEMENTS: saldo){
            System.out.println(Arrays.toString(ELEMENTS));
        }
        //! ---------------------------------------------------------------------- !//
        //! ---------------------------------------------------------------------- !//

    }
}
