/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.icc7002;

import java.util.ArrayList;

/**
 *
 * @author Juan
 */
public class AList {

    public static void main(String[] args) {

        // a[] tamaño 5 .... b[] tamaño 6 = for... a[i]..a[4]+nuevo elemento
        // agregar(String[] a, String nvo)
        // crear b[] .. copiar a, agregar nvo
        // return 
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println(cars);

        System.out.println(cars.get(0));

        cars.set(0, "Opel");
        System.out.println(cars);
        
        cars.remove(1);
        System.out.println(cars);

        cars.clear();
        System.out.println(cars);


    }
}
