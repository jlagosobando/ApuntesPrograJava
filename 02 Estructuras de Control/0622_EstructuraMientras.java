/* @author pancho
* Autor Original Profesor Francisco Escobar
*/
package com.mycompany.icc7002;

import java.util.Scanner;

public class EstructuraMientras {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a = 0;
        
        while (a<100) {
            System.out.println("Ingresa un numero");
            a = a + teclado.nextInt();
            System.out.println(a);
        }

    }

}
