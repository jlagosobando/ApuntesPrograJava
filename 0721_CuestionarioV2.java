// entrada: largo del cuestion. int cantidad
// proceso: generar "cantidad" preguntas - mostrarlas al usuario - responderlas - evaluar
// salida: puntaje 

package com.mycompany.icc7002;

import java.util.Scanner;
import java.lang.Math; 

public class CuestionarioV2 {
    public static void main(String[] args) {
        
     //dv
        int cantidad=0,i,a,b,c=0,op,res=0,conta=0;
        boolean cumple=false;
                
        Scanner teclado = new Scanner(System.in);
        
        while(cumple==false){
        try{
        while(cantidad<1){
        System.out.println("Ingresa cantidad de ejercicios");
        cantidad = teclado.nextInt();}//fin whilecantidad
        cumple=true;
        }//fin try
        catch(Exception e){
            System.out.println("Ingrese un valor adecuado");
            teclado.next();
        }//fin catch
        }//fin whilecumple


        
        for(i=0;i<cantidad;i++)
        {   cumple=true;
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
                c=a/b;
                System.out.println(a+"/"+b+"= ");
                break;   
            }//fin switch
            
            while(cumple==false){
            try{
            res=teclado.nextInt();
            cumple=true;}//fin try
            catch (Exception e){
            System.out.println("Ingrese un valor adecuado");
            teclado.next();}//fin catch
            }//fin whilecumple
            
            if(c==res){conta++;}  
        }//fin for
        
        System.out.println("Su rendimiento fue "+conta+" de "+cantidad);    
        
 
        }//fin main
    }//fin class

