package ejerciciostreams;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class Main {

    public static void main(String[] args) {

        int[] listaNumeros = {5,8,3,4,8,1,2,1,7,9,8,2};
        Map<Integer, Integer> mapaEnteros = new HashMap<>();
        
        for(int numero : listaNumeros){
            if(mapaEnteros.containsKey(numero)){
                int acumulador = mapaEnteros.get(numero);
                acumulador++;
                mapaEnteros.replace(numero, acumulador);
            }else{
                mapaEnteros.put(numero, 1);
            }
        }
        
        Integer mayoNumeroRepetido = Collections.max(mapaEnteros.entrySet(), 
                                                     Map.Entry.comparingByValue()).getKey();
        System.out.println("Apariciones: " + mapaEnteros.get(mayoNumeroRepetido));
        System.out.println("Numero es: " + mayoNumeroRepetido);
        

    }
    
}
