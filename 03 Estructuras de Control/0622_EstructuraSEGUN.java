/* @author pancho
* Autor Original Profesor Francisco Escobar
*/
package com.mycompany.icc7002;

import java.util.Scanner;

public class EstructuraSEGUN {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa una opción");
        int opcion = teclado.nextInt();

        switch(opcion){
            case 1:
                System.out.println("Seleciono la opcion 1");
                break;
            case 2:
                System.out.println("Seleciono la opcion 2");
                break;
            case 3:
                System.out.println("Seleciono la opcion 3");
                break;
            case 4:
                System.out.println("Seleciono la opcion 4");
                break;
            case 5:
                System.out.println("Seleciono la opcion 5");
                break;
            default:
                System.out.println("opcion no valida");
        }
        System.out.println("adios");
                
    }

}
