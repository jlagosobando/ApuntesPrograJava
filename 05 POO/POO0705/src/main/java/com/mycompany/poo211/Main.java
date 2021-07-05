/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poo211;

import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class Main {
    
    public static void main(String[] args){
    
    Scanner teclado = new Scanner(System.in);
    
    Persona julito = new Persona(); 
    
    julito.setNombre("Julio");
    julito.setGenero("Masc");
    julito.setEdad((byte)19);
   
    System.out.println("el nombre es: "+julito.getNombre());
    System.out.println("el gen es: "+julito.getGenero());   
    System.out.println("el edad es: "+julito.getEdad());
    
    Persona angelica = new Persona("Angelica","Fem",(byte)22);
        
    System.out.println("el nombre es: "+angelica.getNombre());
    System.out.println("el gen es: "+angelica.getGenero());   
    System.out.println("el edad es: "+angelica.getEdad());     
        
    
    Persona jorge = new Persona("Jorge");
    
    System.out.println("el nombre es: "+jorge.getNombre());
    System.out.println("el gen es: "+jorge.getGenero());   
    System.out.println("el edad es: "+jorge.getEdad());      
    
    jorge.saludar();
    
    }  
}
