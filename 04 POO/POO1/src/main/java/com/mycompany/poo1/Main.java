
package com.mycompany.poo1;

import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String n="Don Mario";
        int pass=1234;
        
        Cajero cajero0 = new Cajero();
        Cajero cajero1 = new Cajero("Don Pepito",1501);
        Cajero cajero2 = new Cajero(n,pass);
        Cajero cajero3 = new Cajero("Luchito",1111,true);
            
        
        System.out.println(cajero0.getNombre());
        System.out.println(cajero1.getClave());
        System.out.println(cajero2.getRopa());
        
        cajero0.setNombre("Julito");
        System.out.println(cajero0.getNombre());
        
        System.out.println(cajero3.isTrabajando());
        cajero3.saludar();
        cajero3.darGracias();
        
        cajero2.cobrar(5620,10000);
    }
    
}
