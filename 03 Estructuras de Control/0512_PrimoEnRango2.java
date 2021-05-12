//autor: profe
package com.mycompany.proyectomain3;

import java.util.Scanner;

public class PrimosDesdeX {

    public static void main(String[] args) {
        int num, cont;

        
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Ingrese num");
            num = teclado.nextInt();
        } while (num < 2);
        /* nesesito que mi num haga de numeros hasta tanto, por lo que necesito 
        un contador
        
         */
        for (int i = 1; i <= num; i++) {
            cont=0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cont++;
                }

            }
            if (cont == 2) {
                System.out.println(i);
            }
        }
    }

}



