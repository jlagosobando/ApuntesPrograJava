/*
 *  entradas: palabra*
    proceso:
            - identificar palabra*
                - caracteres minuscula*
                - caracteres mayuscula*
                - caracteres numericos*
                - caracteres simbolos*
            - transformar palabra a braile*
    salida:
        mostrar palabra en braile (no en unicode)*
            
 */
package com.mycompany.icc7002;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pancho
 */
public class Braille3 {

    // 0 1  
    // 2 3  ==>  012345
    // 4 5
    static String[] alfabetoBraile = {  "100000", "101000", "110000", "110100", 
                                        "100100", "111000", "111100", "101100", 
                                        "011000", "011100", "100010", "101010", 
                                        "110010", "110110", "100110", "111010", 
                                        "111110", "101110", "011010", "011110", 
                                        "100011", "101011", "011101", "110011", 
                                        "110111", "100111" };
    
    static String alfabeto = "abcdefghijklmnopqrstuvwxyz";
    
    static String mayuscula = "010001";
    
    static String[] numerosBraile = {"100000", "101000", "110000", "110100", "100100", 
                                     "111000", "111100", "101100", "011000", "011100"};
    static String numeros = "1234567890";
    
    static String[] simbolosBraile = {"000010", "001000", "001010", "001100", "000011", 
                                        "001001", "001001", "001110", "001110", "001011", 
                                        "001011", "101001", "101001", "000000"};
    static String simbolos = ".,;:-¿?!¡\"\"() ";
    
    static String simboloNumero = "010111";
    static int asciiA = 97;

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa una palabras");
        
        String palabra = teclado.next();
        ArrayList<String> nuevaPalabra = new ArrayList<>();
        toBraile(nuevaPalabra, palabra);

    }

    public static void toBraile(String palabra) {
        for (int i = 0; i < 3; i++) {                       //--> fila
            for (int j = 0; j < palabra.length(); j++) {    //--> pares letra
                for (int k = 0; k < 2; k++) {               //--> punto
                    System.out.print(alfabetoBraile[(int) palabra.charAt(j) - asciiA].charAt(k + (i * 2)));
                }
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    public static void toBraile(ArrayList<String> nuevaPalabra, String palabra) {
        for (int i = 0; i < palabra.length(); i++) {
            busqueda(palabra.charAt(i), nuevaPalabra);
        }

        for (int i = 0; i < 3; i++) {                           //--> fila
            for (int j = 0; j < nuevaPalabra.size(); j++) {     //--> pares letra
                for (int k = 0; k < 2; k++) {                   //--> punto
                    System.out.print(nuevaPalabra.get(j).charAt(k + (i * 2)));
                }
                System.out.print(" ");
            }
            System.out.print("\n");
        }

    }

    public static void busqueda(char letra, ArrayList<String> nuevaPalabra) {
        if (letra >= 65 && letra <= 90) {
            for (int i = 0; i < alfabeto.length(); i++) {
                String l = letra + "";
                if (l.toLowerCase().charAt(0) == alfabeto.charAt(i)) {
                    nuevaPalabra.add(mayuscula);
                    nuevaPalabra.add(alfabetoBraile[i]);
                }
            }
        }
        if (letra >= 97 && letra <= 122) {
            for (int i = 0; i < alfabeto.length(); i++) {
                if (letra == alfabeto.charAt(i)) {
                    nuevaPalabra.add(alfabetoBraile[i]);
                }
            }
        }
        if (letra >= 48 && letra <= 57) {
            for (int i = 0; i < numeros.length(); i++) {
                if (letra == numeros.charAt(i)) {
                    nuevaPalabra.add(simboloNumero);
                    nuevaPalabra.add(numerosBraile[i]);
                }
            }
        }
        
        for (int i = 0; i < simbolos.length(); i++) {
            if (letra == simbolos.charAt(i)) {
                nuevaPalabra.add(simbolosBraile[i]);
            }
        }
        
//        System.out.println((char)letra);
//        if(letra == 'Ñ'){
//            nuevaPalabra.add(mayuscula);
//            nuevaPalabra.add(alfabetoBraile[alfabetoBraile.length-1]);
//        }
//        
//        if(letra == 'ñ'){
//            nuevaPalabra.add(alfabetoBraile[alfabetoBraile.length-1]);
//        }
    }

}
