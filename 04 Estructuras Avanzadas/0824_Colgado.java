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
public class Colgado {

    public static void main(String[] args) {
        int select, i, vidas = 5;
        // palabra=hola colgado= _ _ _ _   
        String palabra, colgado = "";
        char letra;
        boolean jugando = true, hallada, completo;
        
        Scanner teclado = new Scanner(System.in);
        String[] palabras = {"hola", "mundo", "frontera", "informatica","universidad"};
        select = (int) (Math.random() * palabras.length);
        palabra = palabras[select];
        
         for (i = 0; i < palabra.length(); i++) {
            if (i == palabra.length() - 1) {
                colgado = colgado + "_";
            } else {
                colgado = colgado + "_" + " ";
            }
        }
        
        while(vidas > 0 && jugando){
            hallada = false;
            completo = true;
            
            System.out.println("Vidas: " + vidas);
            System.out.println(colgado);
        
            System.out.println("Ingrese letra");
            letra = teclado.next().charAt(0);
            
            for (i = 0; i < palabra.length(); i++)
            {
            if (letra == palabra.charAt(i)){
            colgado=colgado.substring(0, i*2)+letra+colgado.substring(i*2+1);
            hallada = true;      
            }
            }
            
            if (!hallada) {
                vidas--;
            }
            
            for(i=0;i<colgado.length();i=i+2){
             if ('_' == colgado.charAt(i)) {
                    completo = false;
                    break;
                }
            }
            
        if (vidas == 0) {
                jugando = false;
                System.out.println("Perdió");
                System.out.println("Se quedó sin vidas");

            } else {
                if (completo) {
                    jugando=false;
                    System.out.println("Ganó");
                    System.out.println(colgado);

                }
        }
        
        }
        
    }
}
