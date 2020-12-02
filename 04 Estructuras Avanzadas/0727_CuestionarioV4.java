// entrada: largo del cuestion. int cantidad
// proceso: generar "cantidad" preguntas - mostrarlas al usuario - responderlas - evaluar
// salida: puntaje 

package com.mycompany.icc7002;

import java.util.Scanner;
import java.lang.Math; 

public class CuestionarioV4 {
    public static void main(String[] args) {
     //dv
        int cantidad=0,i,a,b,op,conta=0;
        double res=0,c=0;
        boolean cumple=false;
        
        Scanner teclado = new Scanner(System.in);
        
        while(cumple==false){
            try{
                while(cantidad<1){    
                    System.out.println("Ingresa cantidad de ejercicios");
                    cantidad = teclado.nextInt();}//fin whilecantidad
            
                    cumple=true;}//fin try 
            catch (Exception e){
                System.out.println("Ingrese un valor adecuado");
                teclado.next();       }//fin catch
        
        }//fin while cumple
        
               
        
        for(i=0;i<cantidad;i++)
        {   cumple=false;
            a=(int)(Math.random()*10);
            b=(int)(Math.random()*10);
            op=(int)(Math.random()*4)+1;
            
            switch(op)
            {case 1:
                c=a+b;
                System.out.println(a+"+"+b+"= ");
                break;
             case 2:
                c=a-b;
                System.out.println(a+"-"+b+"= ");
                break;
             case 3:
                c=a*b;
                System.out.println(a+"*"+b+"= ");
                break;
             case 4:
                try{ 
                c=((double)a/b); //1,333333
                c=Math.floor(c * 10) / 10;//1,3333*10 > floor ... 13.000 > 1,3
                }//fin try
                catch(ArithmeticException e){
                c=0; }//fin catch
                
                System.out.println(a+"/"+b+"= ");                 
                break;
            }//fin switch
            
            while(cumple==false){
            try{
                res=teclado.nextDouble();
            
                cumple=true;}//fin try 
            catch (Exception e){
                System.out.println("Ingrese un valor adecuado");
                teclado.next();       }//fin catch
        
            }//fin while cumple
            
            if(c==res){conta++;}   
            
            
        }//fin for
        
        System.out.println("Su rendimiento fue "+conta+" de "+cantidad);
        
 
        }//fin main
    }//fin class

