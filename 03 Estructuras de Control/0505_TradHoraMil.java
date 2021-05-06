/*
tenemos una hora en formato militar HHMM y queremos llevarla a formato AM/PM
entrada= hora HHMM como entero
proceso= cortar HHMM en HH y MM, validar que HH y MM cumplen rango num, armar respuesta
salida= hora en formato AM/PM como frase
 */
package com.mycompany.icc7002;

import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class TradHoraMil {
    
    public static void main(String[] args) {
    
    int HHMM,HH,MM;
    String apm;
    Scanner teclado = new Scanner (System.in);    
        
        
    //entrada
    do{
        System.out.println("Ingrese hora");
        HHMM=teclado.nextInt();
        
        HH= (HHMM/100);
        MM= (HHMM%100) ;       
    
    } while(HHMM<0 || HHMM>2359 || MM>59 );
        
    //proceso
    if (HH>12){
     apm="PM";
     //HH=HH-12
     HH-=12;
       
    }else{
    apm="AM";
    }    
        
        
    //salida   
    System.out.println("La hora es "+HH+":"+MM+" "+apm);
    
        
    } //finMain
}//finClass
