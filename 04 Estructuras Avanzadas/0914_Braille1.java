package com.mycompany.icc7002;

import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class Braille1 {
    
    public static String[][] mayu = {{".", "O"}, {".", "."}, {".", "O"}};
    public static String[][] num = {{".", "O"}, {".", "O"}, {"O", "O"}};
    public static String[][] a = {{"O", "."}, {".", "."}, {".", "."}};
    public static String[][] b = {{"O", "."}, {"O", "."}, {".", "."}};
    public static String[][] d0 = {{".", "O"}, {"O", "O"}, {".", "."}};
    public static String[][] space = {{".", "."}, {".", "."}, {".", "."}};
    public static String[][] point = {{".", "."}, {".", "."}, {"O", "."}};

    
     public static void printMatrix(String[][] matrix) {
        int i, j;
        for (i = 0; i < matrix.length; i++) {     //filas
            for (j = 0; j < matrix[i].length; j++) { //columnas
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println("____");
    }
    
    public static void traducir(char ch) {
        switch (ch) {
            case 'a':
                printMatrix(a);
                break;
            case 'A':
                printMatrix(mayu);
                printMatrix(a);
                break;
            case 'b':
                printMatrix(b);
                break;
            case 'B':
                printMatrix(mayu);
                printMatrix(b);
                break;
            case '0':
                printMatrix(num);
                printMatrix(d0);
                break;
            case '1':
                printMatrix(num);
                printMatrix(a);
                break;
            case '2':
                printMatrix(num);
                printMatrix(b);
                break;
            case '.':
                printMatrix(point);
                break;
            default:
                printMatrix(space);
        }

    }

    public static void main(String[] args) {

        String texto;
        int i;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un texto para traducir");
        texto = teclado.nextLine();

        for (i = 0; i < texto.length(); i++) {
            traducir(texto.charAt(i));
        }

    }
}
