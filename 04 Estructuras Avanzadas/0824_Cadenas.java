/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.icc7002;

/**
 *
 * @author Juan
 */
import java.util.Scanner;

public class Cadenas {

    public static boolean capicua(String palabra) {
        palabra=palabra.toUpperCase();

        int i;
        boolean es = true;

        for (i = 0; i < (palabra.length() / 2); i++) {

            if (palabra.charAt(i) != palabra.charAt(palabra.length() - 1 - i)) {
                es = false;
                break;
            }
        }
        return es;
    }
    //solos
    //012345

    public static void main(String[] args) {
        String p;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese una palabra");
        p = teclado.next();

        if (capicua(p)) {
            System.out.println("La palabras " + p + " es cap ");
        } else {
            System.out.println("La palabras " + p + " no es cap ");
        }

    }
}
