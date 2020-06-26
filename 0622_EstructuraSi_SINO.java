/* @author pancho
* Autor Original Profesor Francisco Escobar
*/
package com.mycompany.icc7002;

import java.util.Scanner;

public class EstructuraSi_SINO {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un numero entero");
        int num = teclado.nextInt();
        
        if(num%2 == 0){
            System.out.println("El numero ingresado es par");
        }else{
            System.out.println("El numero ingresado es impar");
        }
    }
    
}
