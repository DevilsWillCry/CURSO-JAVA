package Ejercicios_Java;

import java.util.Map;
import java.util.HashMap;

public class CreateHashMap {
    public static void main(String[] args) {
        //* Crear un arreglo por Mapeo de Pares de valor key:value
        Map<String, String> map = new HashMap<String, String>();

        //* Manera de introducir valores al Map o Arreglo de pares de valores
        map.put("Miguel", "323");
        map.put("Angel", "320");
        map.put("Paola", "229");
        map.put("Rosio", "45");

        //* Una de las maneras de iterar en el mapeo, en este caso las llaves
        for (String keys : map.keySet()) {
            System.out.println("Primera forma keys: "+ keys);
        }
        //* Otra manera de iterar en el mapeo, en este caso los valores
        for (String value : map.values()) {
            System.out.println("Segunda Forma Values: "+value);
        }
        int valueMax = 250;
        //* Otra forma de iterar en este caso ambo pares de valores, para llaves como para valores
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Tercera forma key:value: " + entry);
            int value = Integer.parseInt(entry.getValue());
            if ( value > valueMax){
                valueMax =  value;
            }
        }
        System.out.println(valueMax);

    }

}
