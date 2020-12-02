/* @author pancho
* Autor Original Profesor Francisco Escobar
*/
package com.mycompany.icc7002;

import java.util.Scanner;

public class EstructuraSISINOSINOSINO {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa tu edad");
        int edad = entrada.nextInt();
        
        if(edad>=0 && edad <=4){
            System.out.println("Es una guagua");
        }else if(edad>4 && edad <=12){
            System.out.println("Es un niño");
        }else if(edad>12 && edad<=18){
            System.out.println("Es un adolecente");
        }else if (edad >18 && edad <=30) {
            System.out.println("Es un adulto emergente");
        }else if (edad >30 && edad <=60) {
            System.out.println("Es un adulto");
        }else if (edad > 60) {
            System.out.println("Es un adulto mayor");
        }else {
            System.out.println("edad no valida");
        }

    }

}
