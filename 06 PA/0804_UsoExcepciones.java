/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.icc7002;

import java.util.*;

/**
 *
 * @author Juan
 */
public class UsoExcepciones {

    public static double suma(double num1, double num2) {
        double aux;
        aux = num1 + num2;
        return aux;
    }

    public static double resta(double num1, double num2) {
        double aux;
        aux = num1 - num2;
        return aux;
    }

    public static double mult(double num1, double num2) {
        double aux;
        aux = num1 * num2;
        return aux;
    }

    public static double div(double num1, double num2) {
        double aux;
        if (num2 != 0) {
            aux = num1 / num2;
        } else {
            throw new ArithmeticException("El calc. no es realizable ya que el divisor es 0");
        }

        return aux;
    }

    public static void main(String[] args) {
        double a = 0, b = 0;
        boolean repetir;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese 2 números para operar");

        repetir = true;
        while (repetir) {
            try {
                System.out.println("Ingrese valor para A");
                a = teclado.nextDouble();
                repetir = false;
            } catch (InputMismatchException e) {
                teclado.next();
                System.out.println("A debe ser num");
            }
        }

        repetir = true;
        while (repetir) {
            try {
                System.out.println("Ingrese valor para B");
                b = teclado.nextDouble();
                repetir = false;
            } catch (InputMismatchException e) {
                teclado.next();
                System.out.println("B debe ser num");
            }
        }

        System.out.println("Suma: " + suma(a, b));
        System.out.println("Resta: " + resta(a, b));
        System.out.println("Mult: " + mult(a, b));

        try {
            System.out.println("Div: " + div(a, b));
        } catch (ArithmeticException e) {
            System.out.println("Ocurrió un error al dividir por 0");
        } catch (Exception e) {
            System.out.println("Ocurrió un error, lo atrapamos con el comodín");
        } finally {
            System.out.println("Yo trabajo igual");
        }

    }

}
