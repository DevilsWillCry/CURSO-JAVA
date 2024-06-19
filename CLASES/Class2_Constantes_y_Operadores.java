public class Class2_Constantes_y_Operadores {
    public static void main(String[] args) {
        //?-----------------------------------------CONSTANTES-----------------------------------------------------------------?//
        /* 
        *                                    ¿Qué es una constante?
        *  Es un espacio en memoria del ordenador donde se almacenará un valor que no podra cambiar durante su ejecución 
        *  Ejemplo: final double a_pulgadas = 2,54
        */
        //?-------------------------------------------------------------------------------------------------------------------?//
        //?-----------------------------------------OPERADORES EN JAVA--------------------------------------------------------?//
        /*
         * //! OPERADORES ARITMETICOS
         * + : Suma              
         * - : Resta
         * / : Divsión
         * % : Modulo o Resto de una división entre enteros (en otros lenguaje denominado mod)

         * //! OPERADORES LOGICOS, BOOLEANOS Y RELACIONALES
         * >  : Mayor que 
         * <  : Menor que
         * <> : Mayor o menor que 
         * != : Diferente que 
         * == : igual que 
         * && : Y logico, Se tiene que cumplir todas las sentencias
         * || : OR Logico, Se tiene que cumplir una o varias sentencias

         * //! OPERADORES DE INCREMENTO Y DECREMENTO
         * ++ : Incremento
         * -- : Decremento
         * += n : Incremento, incrementar un numero cualquiera N
         * -= n : Decremento, decrementar un numero cualquiera N

         * //! OPERADORES DE CONCATENACIÓN 
         * + : Une o concatena 
         */
        //?-------------------------------------------------------------------------------------------------------------------?//
        //?---------------------------------------------EJEMPLOS--------------------------------------------------------------?//
        int a = 5;
        int b =  10;
        //!-------------EJEMPLO 1, OPERADORES LOGICOS, BOOLEANOS Y RELACIONALES--------------
        if (a < b) {
            System.out.println("True, a es menor que b");
        }
        if (b > a && a < b) { //Y logico
            System.out.println("True, b es mayor que b y a es menor que b");
        }
        if (a != b || a == b){ //O Logico
            System.out.println("True, a es diferente que b");
        }
        //!-----------------------------------------------------------------------------------
        //!-------------------EJEMPLO 2, OPERADORES ARITMETICOS-------------------------------
        long d = 1;
        //* Suma aritmetica entre ambos enteros de diferente tipo de variable
        //! ¡OJO!, Al sumar una varaible tipo (long) y almacenarla en un tipo (int) puede genera desbordamiento
        //* Lo recomendable es sumar entre un mismo tipo de variables o inclusive una que no genere desbordamiento
        int c = (int) ((int) a + (long)d);  
        System.out.printf("Num1: %d,\nNum2: %d,\nSuma: %d%n", a, b, c); //* Imprimir Texto Formateado        
        //!-----------------------------------------------------------------------------------
        //!-------------------EJEMPLO 3, OPERADORES DE INCRE Y DECRE.-------------------------
        int count = 0;
        System.out.println("Incremento");
        for(int i = 0; i < 10; i++){
            count++;
            System.out.println(count);
        }
        System.out.println("Decremento");
        for(int i = 10; i > 0; i--){
            count--;
            System.out.println(count);
        }
        //!-----------------------------------------------------------------------------------
        //?-------------------------------------------------------------------------------------------------------------------?//
    }
}
