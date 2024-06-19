public class Class5_Class_StringII {
    public static void main(String[] args) {
        //?------------------------------------CLASS 'STRING' II---------------------------------------------?//
        /*
         * La clase String representa cadenas de caracteres. Todos los literales de cadena en programas Java,
         * como "abc", se implementan como instancias de esta clase.

         * Las cadenas son constantes; sus valores no se pueden cambiar después de su creación. 
         * Los búferes de cadenas admiten cadenas mutables. Como los objetos String son inmutables, se pueden compartir. 
         */
        //!--------------------------------EJEMPLO 1---------------------------------------------------------!// 
        //* La manera de como definir un String es la siguiente:
        
        String str1 = "abc";
        System.out.println(str1);
        //!--------------------------------------------------------------------------------------------------!//
        //!--------------------------------EJEMPLO 2--------------------------------------------------------!//
        //* Otra manera equivalente de como definir un String:
        
        char charArray[] = {'a','b','c'};
        String str2 = new String(charArray);
        System.out.println(str2);
        //!------------------------------------------------------------------------------------------------!//
        //?--------------------------------------------------------------------------------------------------?//
        

    }
}
