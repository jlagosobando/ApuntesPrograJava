/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.icc7002;

import static com.mycompany.icc7002.Matrices.printMatrix;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class CuadradoMagico {

    public static boolean checkCM(int[][] arr) {
        int i;
        boolean magic = true;
        for (i = 0; i < 3; i++) {
            if (arr[i][0] + arr[i][1] + arr[i][2] != 15) {
                magic = false;
            }
        }

        for (i = 0; i < 3; i++) {
            if (arr[0][i] + arr[1][i] + arr[2][i] != 15) {
                magic = false;
            }
        }

        if (arr[0][0] + arr[1][1] + arr[2][2] != 15 || arr[0][2] + arr[1][1] + arr[2][0] != 15) {
            magic = false;
        }

        return magic;
    }

    public static boolean checkUsed(int[][] arr, int value) {
        int i, j;
        boolean used = false;
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                if (value == arr[i][j]) {
                    used = true;
                    System.out.println("Usado");
                    break;
                }
            }
        }

        return used;
    }

    public static void main(String[] args) {
        int i, j, num = 0;
        boolean valido = false, usado = false;
        Scanner teclado = new Scanner(System.in);

        int[][] cuadMag = {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}};
        printMatrix(cuadMag);

        if (checkCM(cuadMag)) {
            System.out.println("Es mágico");
        } else {
            System.out.println("No es mágico");
        }

        int[][] cuadMag2 = new int[3][3];
        printMatrix(cuadMag2);

        for (i = 0; i < cuadMag2.length; i++) {
            for (j = 0; j < cuadMag2[i].length; j++) {
                num = 0;
                while (num < 1 || num > 9 || !valido || usado) {
                    try {
                        System.out.println("Casilla[" + i + "][" + j + "]");
                        num = teclado.nextInt();
                        usado = checkUsed(cuadMag2, num);
                        valido = true;
                        cuadMag2[i][j] = num;
                    } catch (Exception e) {
                        System.out.println("Valor errado");
                        valido = false;
                        num = 0;
                        teclado.next();
                    }
                }
                printMatrix(cuadMag2);
            }
        }
         if (checkCM(cuadMag2)) {
            System.out.println("Es mágico");
        } else {
            System.out.println("No es mágico");
        }

    }//finMain

}
