// entrada: largo del cuestion. int cantidad
// proceso: generar "cantidad" preguntas - mostrarlas al usuario - responderlas - evaluar
// salida: puntaje 

package com.mycompany.icc7002;

import java.util.Scanner;
import java.lang.Math; 

public class CuestionarioV1 {
    public static void main(String[] args) {
        //dv
        int cantidad,i,a,b,c,op,res,conta=0;
             
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa cantidad de ejercicios");
        cantidad = teclado.nextInt();
        
        for(i=0;i<cantidad;i++)
        {
            a=(int)(Math.random()*10);
            b=(int)(Math.random()*10);
            op=(int)(Math.random()*2)+1;
            
            switch(op)
            {case 1:
                c=a+b;
                System.out.println(a+"+"+b+"= ");
                res=teclado.nextInt();
                if(c==res){conta++;}    
                break;
             case 2:
                c=a-b;
                System.out.println(a+"-"+b+"= ");
                res=teclado.nextInt();
                if(c==res){conta++;}    
                break;
            }//fin switch
        }//fin for
        
        System.out.println("Su rendimiento fue "+conta+" de "+cantidad);
   
        }//fin main
    }//fin class

