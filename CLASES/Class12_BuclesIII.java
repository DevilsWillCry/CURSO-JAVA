import javax.swing.JOptionPane;

public class Class12_BuclesIII {
    public static void main(String[] args) {
        //? --------------------------------BUCLES III------------------------------- ?//
        /*
        * En bucles III harémos varios ejemplos del ciclo for, bucle determinado
        * Donde la sintaxis es la siguiente:
        *
        * For convencional:  
        * - for (inicio bucle; Condición bucle; Contador bucle) {
        *      Linea de código 1  ↓ ↑      
        *      Linea de código 2  ↓ ↑ --> Ciclará una cantidad n determinada dada en los argumentos iniciales
        *      Linea de código 3  ↓ ↑
        *  }
        */
        //? ------------------------------------------------------------------------- ?//
        //! --------------------------------EJEMPLOS--------------------------------- !//
        //! ----------------------------EJEMPLOS BUCLE FOR--------------------------- !//
        /*
         *  Primeramente definiremos los argumentos iniciales. Donde
         *  Inicializaremos una variable local, en este caso llamada "i" en 0
         *  Una vez hecho esto declararemos la condición a cumplir y de iterar i < 10
         *  Y por ultimo el contador en este va sumar en cada iteración i++
         * 
         *  El ciclo terimnará cuando se deje de cumplir la condición, en este caso
         *  cuando i sea mayor que 10 o igual que 10.
         */
        for(int i = 0; i < 10; i++){
            System.out.println("Conte de i en ciclo for: " + i);
        }
        //! ------------------------------------------------------------------------- !//
        //! -------------------------EJEMPLO CORREO ELECTRÓNICO---------------------- !//
        boolean ValidEmail = false; 
        String Email = JOptionPane.showInputDialog("Ingrese tu correo electrónico: ");
        int Count = 0;
        for(int i = 0; i < Email.length(); i++){
            if (Email.charAt(i) == '@'){
                ValidEmail = true;
                Count ++;
            }
        }
        if (ValidEmail == true && Count == 1){
            System.out.printf("El correo '%s' verificado corrrectamente \n", Email);
        }
        else if (ValidEmail == false && Count == 1){
            System.out.printf("El correo '%s' no es valido falta '@' \n", Email);
        }
        else{
            System.out.printf("El correo '%s' no es valido contiene más de un '@' \n", Email);
        }
        //! ------------------------------------------------------------------------- !//
        //! ------------------------------------------------------------------------- !//

    }
}
