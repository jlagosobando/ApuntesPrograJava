/**
 * com.example.dev Paquete de desarrollo de la solución
 */
package com.example.dev;
// -encoding UTF-8 -charset UTF-8 -docencoding UTF-8

import java.util.ArrayList;

/**
 * Este programa genera la serie de Fibo. tanto a nivel de elementos individuales como de una serie completa de varios digitos. Este proyecto se realizó con TDD
 *
 * @author Juan Lagos (UFRO)
 * @version 1.0
 * @since 2021-07-14
 *
 */
public class Main_Fibo {

public static void main(String[] args){
    System.out.println("Clase Main");

}

    public static int Gen_Fibo(int posicion){
        if(posicion==1) return 0;
        if(posicion==2) return 1;
        else return Gen_Fibo(posicion-1)+Gen_Fibo(posicion-2);}



}
