/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.numeroprimo;

import java.util.Scanner;

/**
 *
 * @author Jorge Cid
 */
public class NumeroPrimo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double num;
        double divisor = 1;
        int cont;
        byte div = 0;
        
        do{
            System.out.println("ingrese un numero");
            System.out.println("------------------------------------------------------------------------");
            num = teclado.nextDouble();
            System.out.println("------------------------------------------------------------------------");
        }while(num<1);
        
        for (int i = 0; i < num; i++) {
            cont = 1;
            div = 0;
            for (int j = 0; j < divisor; j ++) {
               if (divisor%cont==0){
                   div++;
               }
               cont++;
            }
            if (div == 2){
                System.out.println(divisor+": primo");
            }
            divisor++;
        }
    }
}
