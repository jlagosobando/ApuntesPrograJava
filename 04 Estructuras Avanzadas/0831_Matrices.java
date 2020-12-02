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
public class Matrices {
    
    public static void printArray(String[] arr) {
        int i;
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }
    
    public static void printMatrix(String[][] matrix) {
        int i, j;
        for (i = 0; i < matrix.length; i++) {     //filas
            for (j = 0; j < matrix[i].length; j++) { //columnas
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    
    public static void printMatrix(int[][] matrix) {
        int i, j;
        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    
    public static void main(String[] args) {
        int i, j;
        Scanner teclado = new Scanner(System.in);

        //String[] arreglo = {"1.9", "7.6", "5.3", "10.5"};
        //printArray(arreglo);
        //                              i=0                        i=1 
        //                      j=0      j=1   j=2       j=0    j=1   j=2    j=3
        String[][] matriz1 = {{"hola", "esto", "es"}, {"una", "forma", "de", "matriz"}};
        printMatrix(matriz1);
        
        
        String[][] matriz2 = new String[3][3];
        System.out.println("Llenar matrix");
        printMatrix(matriz2);

        for (i = 0; i < matriz2.length; i++) 
        {for (j = 0; j < matriz2[i].length; j++){
            System.out.println("Casilla["+i+"]["+j+"]");
            matriz2[i][j] = teclado.next();
        
        }
        }
        printMatrix(matriz2);
 
    }
    
}
