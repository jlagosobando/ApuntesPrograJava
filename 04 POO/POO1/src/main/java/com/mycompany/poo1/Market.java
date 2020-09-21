/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poo1;

import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class Market {

    private String nombre;
    private String[][] stock;
    private Cajero cajero;
    private int caja;

    public Market() {
        this.nombre = "Indefinido";
        // tabla prod precio cantidad
        this.stock = new String[5][3];
        this.cajero = new Cajero();
        this.caja = 0;
    }

    public Market(String nombre, String[][] stock, Cajero cajero, int caja) {
        this.nombre = nombre;
        this.stock = stock;
        this.cajero = cajero;
        this.caja = caja;
    }

    public Market(String nombre, Cajero cajero, int caja, int cantProd) {
        this.nombre = nombre;
        this.stock = new String[cantProd][3];;
        this.cajero = cajero;
        this.caja = caja;

    }

    public String getNombre() {
        return nombre;
    }

    public int getCaja() {
        return caja;
    }

    public String[][] getStock() {
        return stock;
    }

    public Cajero getCajero() {
        return cajero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCaja(int caja) {
        this.caja = caja;
    }

    public void setStock(String[][] stock) {
        this.stock = stock;

    }

    public void setStock(int cantProd) {
        int i, precio, stock;
        String nombre;

        String[][] reem = new String[cantProd][3];
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese los productos para su local");

        for (i = 0; i < cantProd; i++) {
            System.out.println("Ingrese nombre del producto");
            nombre = teclado.next();
            System.out.println("Ingrese precio del producto");
            precio = teclado.nextInt();
            System.out.println("Ingrese stock del producto");
            stock = teclado.nextInt();

            reem[i][0] = nombre;
            reem[i][1] = Integer.toString(precio);
            reem[i][2] = Integer.toString(stock);
        }
        
        this.stock=reem;

    }

}
