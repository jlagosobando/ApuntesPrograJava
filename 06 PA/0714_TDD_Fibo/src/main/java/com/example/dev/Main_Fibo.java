/**
 * com.example.dev Paquete de desarrollo de la solución
 */
package com.example.dev;

import java.util.ArrayList;

/**
 * Este programa genera la serie de Fibo. tanto a nivel de elementos individuales como de una serie completa de varios digitos. Este proyecto se realizó con TDD
 *
 * @author Juan Lagos
 * @version 1.0
 * @since 2021-07-14
 *
 */
public class Main_Fibo {

public static void main(String[] args){
    System.out.println("Programa para probar");

    int numero_mostrar=Gen_Fibo(10);
    System.out.println(numero_mostrar);

    int[] serie_mostrar= Serie_Fibo(10);
    System.out.println(serie_mostrar);

}

/**
 * Metodo recursivo que entrega el n de la serie de Fibo. de acuerdo a la posición
 *
 * @param posicion Indica la posición de la serie para mostrar su número
 * @return int Retorna el número de la serie según la posición dada
 *
 * */
public static int Gen_Fibo(int posicion){
        if(posicion==1) return 0;
        if(posicion==2) return 1;
        else
            return Gen_Fibo(posicion-2)+Gen_Fibo(posicion-1);
    }


    /**
     * Metodo que entrega  la serie de Fibo. de acuerdo a la cantidad de digitos que quiero de ella
     *
     * @param cantidad Indica la cantidad de elementos que tendrá la serie a mostrar
     * @return int[]  Retorna el arreglo con los elementos de la serie según la cantidad dada
     *
     * */

    public static int[] Serie_Fibo(int cantidad){
        int[] serie_prod = new int[cantidad];
        int i;

        for(i=0;i<cantidad;i++){
            serie_prod[i]=Gen_Fibo(i+1);
        }
        return serie_prod;
    }



}
