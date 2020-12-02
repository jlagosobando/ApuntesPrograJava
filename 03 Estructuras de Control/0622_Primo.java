/* @author pancho
* Autor Original Profesor Francisco Escobar
*/
package com.mycompany.icc7002;


public class Primo {

    public static void main(String[] args) {
        int num = 13;

        int div = 0;
        int cont = 1;

        do {
            if (num % cont == 0) {
                div++; // div = div+1;
                System.out.println("divisor: " + cont);
            }
            cont++;
        } while (num >= cont);

        System.out.println(div);

        if (div == 2) {
            System.out.println("primo");
        } else {
            System.out.println("compuesto");
        }

    }

}
