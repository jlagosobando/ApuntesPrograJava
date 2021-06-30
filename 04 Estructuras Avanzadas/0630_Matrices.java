
package com.mycompany.icc7001;

import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class Matrices {

    public static void main(String[] args) {

        int i, j;
        Scanner teclado = new Scanner(System.in);
        //j=0    j=1    j=2      j=3             
        String[][] matriz1 = {{"hola", "esto", "es"}, //i=0
                              {"una", "forma", "de", "matriz"}};  //i=1

        //System.out.println(matriz1[0][0]);
        //printMatrix(matriz1);

        
        //tipo[][] nombre  = new tipo[filas][col]
        String[][] matriz2 = new String[3][3];
        
        for (i = 0; i < matriz2.length; i++) {
            for (j = 0; j < matriz2[i].length; j++) {
                System.out.println("Casilla["+i+"]["+j+"]");
                matriz2[i][j]=teclado.next();
            }
            
        }
        
        
        
        printMatrix(matriz2);
        
        //tarea
        //1ra: hacer una matriz simetrica que rellene su contenido desde abajo/derecha hasta arriba/izquierda 
        //2da: hacer función de matriz transpuesta
        
        
        
        
        
    }//finmain

    public static void printMatrix(String[][] matrix) {
        int i, j;

        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void printArray(String[] arr) {
        int i;
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }

}//finclass
