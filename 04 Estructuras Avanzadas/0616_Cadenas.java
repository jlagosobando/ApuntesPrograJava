/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.icc7001;

import java.util.Arrays;

/**
 *
 * @author Juan
 */
public class Cadenas {
    public static void main(String[] args) {
        char a='a';
        String palabra="hola";
        String pass="c*f*a*s";
    
        System.out.println(a);
        System.out.println(palabra);
        
        System.out.println(palabra.charAt(0));
        System.out.println(palabra.toUpperCase());
        
        char[] resultado = palabra.toCharArray();
        System.out.println(resultado);
        
        String[] palabra_separada = palabra.split("\\*");
        System.out.println(Arrays.toString(palabra_separada));
        
        String[] pass_separada = pass.split("\\*");
        System.out.println(Arrays.toString(pass_separada));
     
}//finmain
}//finclasss