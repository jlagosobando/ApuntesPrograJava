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
public class PromedioFunciones {

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        // dv
        double nota_turno, pond_turno, promedio = 0;
        
        System.out.println("Vamos a calcular su promedio");
        // entrada

        for (int i = 1; i <= 3; i++) {

            nota_turno = inputValidarNota(i);
            pond_turno = inputValidarPond(i);

            // proceso-acumulador
            promedio = promedio + (nota_turno * pond_turno);

        }

        // salida
        System.out.println("Su promedio " + promedio);

        evaluarEstado(promedio);

    }

    public static double inputValidarNota(int num_nota) {
        double nota;
        do {
            System.out.println("Ingrese su nota " + num_nota);
            nota = teclado.nextDouble();
        } while (nota < 1 || nota > 7);

        return nota;

    }

    public static double inputValidarPond(int num_nota) {
        double pond, pond_total=0;
        boolean pedir_pond;
        
        do {
            System.out.println("Ingrese ponderación nota " + num_nota);
            pond = teclado.nextDouble();

            pond_total = pond_total + pond;

            if (pond_total > 1) {
                pond_total = pond_total - pond;
                pedir_pond = true;
            } else {
                pedir_pond = false;
            }

        } while (pond <= 0 || pond > 1 || pedir_pond);
        
        return pond;
    }

    public static void evaluarEstado(double promedio) {
        if (promedio >= 4) {
            System.out.println("Aprobó");
        }
        else{System.out.println("Reprobó");}
    }
    
   
}
