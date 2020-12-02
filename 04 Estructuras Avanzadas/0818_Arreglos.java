/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.icc7002;

import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class Arreglos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Uso de Arreglos");
        double[] arreglo = {1.9, 7.6, 5.3, 10.5};

        System.out.println(arreglo[0]);
        // mostrar arreglo
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }

        // sumatoria arreglo
        double total = 0;
        for (int i = 0; i < arreglo.length; i++) {
            total += arreglo[i];
        }
        System.out.println("\nTotal es: " + total);

        //detectar min y max
        double max=arreglo[0];
        double min=arreglo[0];
        
         for (int i = 1; i < arreglo.length; i++) {
         if (arreglo[i] > max) {max = arreglo[i];}
         if (arreglo[i] < min) {min = arreglo[i];}}
      
        
        System.out.println("Valor Max: "+max+" min: "+min);  
        
        
        //tipo[} nombre = new tipo[largo]
        int[] arr2 = new int[5];
        for(int i=0;i<arr2.length;i++){
            arr2[i]=teclado.nextInt();}
        
        for (int i = 0; i < arr2.length; i++) {
         System.out.print(arr2[i] + " ");
      }
        
    }
}
