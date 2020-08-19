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
import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {
        double nota,promedio=0;
        int cantidad=0,i;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Registro promedio de notas");
        
        
        while(cantidad<2){
        System.out.println("Ingrese cantidad de notas");
        cantidad=teclado.nextInt();
        }
        
        for(i=0;i<cantidad;i++){
            nota=0;
            while(nota<1 || nota>7){
                System.out.println("Ingrese su nota "+i);
                nota=teclado.nextDouble();
            }
            promedio+=nota;
        }
        promedio/=cantidad;
        System.out.println("El prom fue "+promedio);
    }

}
