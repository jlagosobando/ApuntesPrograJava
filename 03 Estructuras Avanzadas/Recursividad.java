/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.icc7002;

/**
 *
 * @author Juan
 */
public class Recursividad {

    public static int contar(int n) {
        System.out.println(n);

        if (n == 10) {
            return n;
        } else {
            return contar(n + 1);
        }
    }

    public static int contar(int n, int m) {
        System.out.println(n);

        if (n == m) {
            return n;
        } else {
            return contar(n + 1, m);
        }
    }

    public static int factorial(int n) {

        if (n == 0) {
            return 1;
        } else {
            return factorial(n - 1) * n;
        }

    }

    public static void main(String[] args) {
        int num1, num2;

        //num1 = contar(0);
        //System.out.println(num1);
        //num2 = contar(0, 7);
        //System.out.println(num2);
        System.out.println(factorial(4));
        
        
        //factorial= (factorial(factorial(factorial(0)*1)*2)*3)
        //factorial= (6)
    }
}
