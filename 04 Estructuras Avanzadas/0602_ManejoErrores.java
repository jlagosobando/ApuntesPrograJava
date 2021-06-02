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
public class ManejoErrores {

    public static void main(String[] args) {
        int cantidad_notas, i;
        double nota=0, promedio = 0;
        boolean repetir;

        Scanner teclado = new Scanner(System.in);

        System.out.println("SISTEMA DE NOTAS");
        do {
            System.out.println("Cuantas quiere promediar?");
            try {
                cantidad_notas = teclado.nextInt();
            } catch (Exception e) {
                System.out.println("Ingresó un valor incorrecto, por favor verifique");
                cantidad_notas = 0;
                teclado.next();
            }
        } while (cantidad_notas < 2);

        
        
        for (i = 1; i <= cantidad_notas; i++) {
            
            do {
                System.out.println("Ingrese su nota " + i);
                try{
                nota = teclado.nextDouble();
                repetir=false;
                }
                catch(Exception e) {
                System.out.println("Ingresó un valor incorrecto, por favor verifique");
                teclado.next();
                repetir=true;
                }
             
                
            } while (nota < 1 || nota > 7 || repetir);

            promedio = promedio + nota;
        }

        promedio = promedio / cantidad_notas;
        System.out.println("Su promedio es " + promedio);

    }
}
