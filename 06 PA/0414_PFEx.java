/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Juan
 */
public class PFEx {

    public static void main(String[] args) {

        List<String> diccionario = Arrays.asList("Hola", "MUNDO", "SILLA", "Casa");

        List<String> enMayusculas1 = new ArrayList<>();
        List<String> enMayusculas2;
        List<String> enMayusculas3;
        List<String> enMayusculas4;

        for (String palabra : diccionario) {
            if (palabra.equals(palabra.toUpperCase())) {
                enMayusculas1.add(palabra);
            }
        }
        System.out.println(enMayusculas1);

        enMayusculas2 = diccionario.stream()
                .filter(PFEx::esMayuscula)
                .collect(Collectors.toList());

        System.out.println(enMayusculas2);

        
   
        enMayusculas3 = diccionario.stream()
                .filter((String t) -> {
                    return t.equals(t.toUpperCase());
                })
                .collect(Collectors.toList());
        System.out.println(enMayusculas3);

        
        enMayusculas4 = diccionario.stream()
                .filter(t -> t.equals(t.toUpperCase()))
                .collect(Collectors.toList());
        System.out.println(enMayusculas3);
        
        
        
        
    }

        
    private static boolean esMayuscula(String t) {
        return t.equals(t.toUpperCase());
    }

}
