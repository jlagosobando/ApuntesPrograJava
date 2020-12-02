package com.mycompany.icc7002;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class Braille2 {

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
    }

    public static void traducir(ArrayList<String[][]> tras, char ch) {

        switch (ch) {
            case 'a':
                tras.add(a);
                break;
            case 'A':
                tras.add(mayu);
                tras.add(a);
                break;
            case 'b':
                tras.add(b);
                break;
            case 'B':
                tras.add(mayu);
                tras.add(b);
                break;
            case '0':
                tras.add(num);
                tras.add(d0);
                break;
            case '1':
                tras.add(num);
                tras.add(a);
                break;
            case '2':
                tras.add(num);
                tras.add(b);
                break;
            case '.':
                tras.add(point);
                break;
            case '\'':
                tras.add(point);
                break;
            default:
                tras.add(space);
        }

    }

    public static void mostrar(ArrayList<String[][]> tras) {
        for (int i = 0; i < tras.size(); i++) {
            printMatrix(tras.get(i));
        }
    }

    public static void format(ArrayList<String[][]> tras) {
        int i, j, k, l, d = 0;
        String[][] sacada;

        l = tras.size() * 2;
        String[][] formateado = new String[3][l];

        for (k = 0; k < tras.size(); k++) {
            sacada = tras.get(k);
            for (i = 0; i < sacada[i].length; i++) {
                for (j = 0; j < sacada.length; j++) {
                    formateado[j][i + d] = sacada[j][i];

                }
            }
            d = d + 2;

        }
        printMatrix(formateado);
    }

    public static void main(String[] args) {
        int i;
        String texto;
        Scanner teclado = new Scanner(System.in);
        ArrayList<String[][]> braille = new ArrayList<>();

        System.out.println("Ingree su texto para traducir");
        texto = teclado.nextLine();

        for (i = 0; i < texto.length(); i++) {
            traducir(braille, texto.charAt(i));

        }

        //mostrar(braille);
        //System.out.println("_ _ _ _ _ _ _ _");
        format(braille);
    }

}
