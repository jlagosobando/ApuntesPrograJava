package com.mycompany.icc7002;

/**
 *
 * @author Juan
 */
public class BuscarEnArr {

    public static int buscar(int[] arr, int obj) {
        int pos = -1, i;

        for (i = 0; i < arr.length; i++) {
            if (arr[i] == obj) {
                pos = i;
                break;
            }
        }

        return pos;
    }

    public static void main(String[] args) {

        int[] arr = {65, 43, 23, 78, 4, 3, 9, 10, 12, 8, 6};

        int posicion = buscar(arr, 9);
        System.out.println(posicion);

    }
}
