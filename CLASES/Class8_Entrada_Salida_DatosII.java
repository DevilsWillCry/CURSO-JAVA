import javax.swing.JOptionPane;
import java.lang.NumberFormatException;

public class Class8_Entrada_Salida_DatosII {
    public static void main(String[] args) {
        //? --------------------------------------ENTRADAS Y SALIDAS II, USANDO JOptionPane -------------------------------------- ?//
        /*
         *  JOptionPane es de Javax y la manera de importar es la sguiente:
         *  import javax.swing.JOptionPane
         *  Con esto tendremos la disponibilidad de los metodos de JOptionPane
         *  En este programa utilizaremos showInputDialog.
         *  Pero no se puede invocar así ya que es un metodo estatico por ende se debe usar JOptionPane y después el metodo estatico
         *  JOptionPane.showInputDialog(String message);
         */
        //? --------------------------------------------------------------------------------------------------------------------- ?//
        //! --------------------------------------------------EJEMPLOS----------------------------------------------------------- !//
        //! ---------------------------------------EJEMPLO 1, String con JOptionPane--------------------------------------------- !//
        String message = JOptionPane.showInputDialog("Introduce tu nombre por favor."); /*
                                                                                                * showInputDialog es un metodo estatico:
                                                                                                * Quiere decir que tenemos que invocarlo con el nombre de la clase
                                                                                                * JOptionPane.showInputDialog(message --> String);
                                                                                                * Almaceneramos ese dato en un String
                                                                                                */
        System.out.println(message);                                                             //* Imprimiremos en pantalla lo obtenido de showInputDialog
        //! --------------------------------------------------------------------------------------------------------------------- !//

        //! ----------------------------------------EJEMPLO 2, int con JOptionPane----------------------------------------------- !//
        //! ---------------------- USAREMOS UN TRY PARA VERIFICAR QUE HA INTRODUCIDO UN ENTERO----------------------------------- !//
        try{
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad.")); /*
                                                                                                    * showInputDialog es un metodo estatico:
                                                                                                    * Quiere decir que tenemos que invocarlo con el nombre de la clase
                                                                                                    * JOptionPane.showInputDialog(edad--> String);
                                                                                                    * Convertiremos ese String en un int usando --> Integer.parseInt()
                                                                                                    * Almaceneramos ese dato en un int
                                                                                                    */  
            System.out.println(edad);                                                               //* Imprimeremos en pantalla lo obtenido de showInputDialog
            System.out.println("Hola " + message + " El proximo año tendrás " + ((int)edad + 1) + " años.");
        }
        catch(NumberFormatException ex){
            System.out.println("Por favor introduzca un valor entero." + "\n" + ex);               //* Capturaremos el Error en caso de que se presente.
        }
        //! ------------------------------------------------------------------------------------------------------------------- !//
    }
}
