/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.icc7001;

import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class Arreglos {

    public static void main(String[] args) {
        int i;
        double sum = 0, max, min;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Uso de Arreglos");
        //tipo[] nombre = {datos,datos}
        double[] arreglo = {1.9, 7.6, 5.3, 10.5, 8, 7.2};

        //System.out.println(arreglo[0]);
        //System.out.println(arreglo[3]);
        //System.out.println(arreglo[4]);
        //mostrar arreglo
        for (i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }

        //sumatoria del arreglo
        //sum=suma+arreglo[i]
        for (i = 0; i < arreglo.length; i++) {
            sum += arreglo[i];
        }
        System.out.println("\nTotal es: " + sum);

        //tipo[] nombre = {datos,datos}
        String[] palabras = {"hola", "mundo", "UFRO"};
        System.out.println(palabras[2]);

        max = arreglo[0];
        min = arreglo[0];

        //detectar min y max
        //{1.9, 7.6, 5.3, 10.5, 8, 7.2}
        for (i = 1; i < arreglo.length; i++) {
            //System.out.println("Se compara "+arreglo[i]+" con "+max);
            if (arreglo[i] > max) {
                max = arreglo[i];
            }
            //System.out.println("maximo pasa a valer "+max);
            if (arreglo[i] < min) {
                min = arreglo[i];
            }
        }

        System.out.println("Max detectado : " + max);
        System.out.println("Min detectado : " + min);

        //tipo[] nombre = new tipo[largo]
        int[] arreglo2 = new int[5];

        for (i = 0; i < arreglo2.length; i++) {
            arreglo2[i] = teclado.nextInt();
        }

        for (i = 0; i < arreglo2.length; i++) {
            System.out.print(arreglo2[i] + " ");
        }

    }//finmain

    
    
}//finclass
