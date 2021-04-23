/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.icc7002;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author Juan
 */
public class PFEx2 {
    
    
    
    public static void main(String[] args) {
        List<Integer> numeros = List.of(23, 56, 4, 1, 0, 78, 12, 19, 8);
        List<Integer> numMayores;
        Scanner teclado = new Scanner(System.in);
        int a = teclado.nextInt();
        
        Long result = numeros.stream().filter(num -> num > a ).count();
        System.out.println(result);
        
        numMayores=numeros.stream().filter(num -> num > a ).collect(Collectors.toList());
        System.out.println(numMayores);
        
        
      
        
        
    }
}
