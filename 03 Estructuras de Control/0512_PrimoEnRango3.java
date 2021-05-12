/*
entrada : num entre 2 y el inf positivo
proceso : selección de números primos basados en su módulo
salida : números primo hasta num
 */
package icc7001.icc700;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class primoshastax {

    public static void main(String[] args) {

        int num, modulo, div, i, j, respuesta;
        boolean iteracion;
        iteracion=true;
        Scanner teclado = new Scanner(System.in);

        while(iteracion==true){
            do {
                System.out.println("Ingrese un número mayor a 2");
                num = teclado.nextInt();
            } while (num <= 2);

            for (i = 2; i <= num; i++) {
                div = 0;
                for (j = 1; j <= i; j++) {
                    modulo = (i % j);
                    if (modulo == 0) {
                        div++;
                    }
                }
                if (div == 2) {
                    System.out.println(i);
                }
            }
            System.out.println("Estos serían los números primos hasta el número anteriormente ingresado");
            do {
            System.out.println("¿Desea continuar? (1)Si (2)No");
            respuesta=teclado.nextInt();
            }while(!(respuesta==1 || respuesta==2));
            if (respuesta == 2){
                iteracion=false;
            }
        }
        
        
    
    } //fin main

} //fin class
