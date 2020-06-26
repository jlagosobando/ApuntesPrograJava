/* @author pancho
* Autor Original Profesor Francisco Escobar
*/
package com.mycompany.icc7002;


import java.util.Scanner;

public class fibPrimo {

    public static void main(String[] args) {
        System.out.println("Fibonacci");
        int f1 = 1;
        int f2 = 1;
        int fn = 1;
        
        //ingresar dato por teclado
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de terminos que deseas generar");
        int limite = teclado.nextInt();
        

        for (int i = 0; i < limite; i++) {
            System.out.println(f1);
            int div = 0;
            int cont = 1;

            do {
                if (f1 % cont == 0) {
                    div++; // div = div+1;
                }
                cont++;
            } while (f1 >= cont);

            if(div==2){
                System.out.println("primo");
            }else{
                System.out.println("compuesto");
            }

            fn = f1 + f2;
            f1 = f2;
            f2 = fn;
        }
    }
}
