/*
ciclos : estructuras de control que permiten repetir instrucciones
bucle, loop, repetición 

toma decision en base a operaciones logicas (valores lógicos)
repetir {...} hasta (a>b)

while(a) {.... if(cond){a=false} }

 */
package com.mycompany.icc7002;

import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class RevCiclos {
    
    public static void main (String[] args){
    
    // repetir ... mientras que algo se cumple
    // do... while (mientras)
    int a,b;
    double nota;
    
    Scanner teclado = new Scanner(System.in);
    
  /*      do{
            System.out.println("Ingrese 2 valores enteros");
            a=teclado.nextInt();
            b=teclado.nextInt();
            
        }while(a>b);
        
        
    // repetir ... hasta que    
        do{
            System.out.println("Ingrese 2 valores enteros");
            a=teclado.nextInt();
            b=teclado.nextInt();
            
        }while(!(a>b));
    
        
     // repetir mientras {...}   
        nota=0; //inutil
     
        while(nota<1 || nota>7)
        {
           System.out.println("Ingrese su nota");
           nota=teclado.nextDouble();
        }      
        System.out.println(nota);

  */  

    


    
    // para ... for
    // contador o variable de control del ciclo (i)
    // cuantas vueltas quiero dar
    // como avanza mi ciclo o mi contador
    int i;
    // i++ = i=i+1
   
    for(i=1;i<=1000;i=i+2){
            System.out.println(i);
    }
    
       
    
}//finmain
}//finclass
