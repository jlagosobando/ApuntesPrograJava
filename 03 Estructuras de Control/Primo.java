/* @author Juan
*
entrada : un num
proceso : probamos nuestro num divido por valores entre 1 y si mismo; si da div exacta, contamos un divisor hallado
salida  : respuesta de si es o no primo


 */
package com.mycompany.icc7002;

import java.util.Scanner;

public class Primo {

    public static void main(String[] args) {

        int num, cont, div;
        cont = 1;
        div = 0;

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Ingrese num");
            num = teclado.nextInt();
        } while (num < 2);

        do {
            if (num % cont == 0) {
                div++;
            }

            cont++;
        } while (num >= cont);

        if (div == 2) {
            System.out.println("primo");
        } else {
            System.out.println("compuesto");
        }

    }

}
