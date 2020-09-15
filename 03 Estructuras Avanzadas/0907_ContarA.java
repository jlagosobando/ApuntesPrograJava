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
public class ContarA {

    public static int contar(String palabra) {
        int n = 0, i;
        for (i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == 'a') {
                n++;
            }
        }
        return n;
    }

    public static void main(String[] args) {

        String palabra1 = "paralelepipedo";

        String palabra2 = "gato";

        int num1 = contar(palabra1);

        int num2 = contar(palabra2);

        System.out.println(num1 + "-" + num2);
    }
}
