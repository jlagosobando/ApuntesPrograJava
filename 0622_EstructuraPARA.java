/* @author pancho
* Autor Original Profesor Francisco Escobar
*/
package com.mycompany.icc7002;

import java.util.Scanner;

public class EstructuraPARA {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingresa el " + (i + 1) + "º numero");
            //a = a + teclado.nextInt();
            a += teclado.nextInt();
        }
        System.out.println("La suma de los numeros ingresados es: " + a);

    }
}
