/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poo211;

/**
 *
 * @author Juan
 */
public class Cajero extends Vendedor {

    //atributos
    private int nCaja;

    //const
    public Cajero() {
        //super("negro");
        super();
        this.setUniforme("negro");
    }
    
    
    public Cajero(String nombre, String gen, byte edad, String rut, int hrsSemanales, int nCaja) {
        super(nombre, gen, edad, rut,"negro",hrsSemanales);
        this.nCaja=nCaja;
        
    }

    //set-get
    public int getNCaja() {
        return nCaja;
    }
    
    public void setNCaja(int nvaCaja){
    this.nCaja=nvaCaja;
    }
    
    public void cobrar(int total, int pago){
    int vuelto=pago-total;
    System.out.println("Tome, su vuelto es de: "+vuelto);
    }
    
    
    

    
}
