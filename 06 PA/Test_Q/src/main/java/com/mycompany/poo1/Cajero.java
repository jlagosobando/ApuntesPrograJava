/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poo1;

/**
 *
 * @author Juan
 */
public class Cajero extends Persona{

    private int clave;
    private String colorRopa;
    private boolean trabajando;

    public Cajero() {
        super();
        this.clave = -1;
        this.colorRopa = "rojo";
        this.trabajando=false;
    }

    public Cajero(String nombre, int clave) {
        super(nombre);
        this.clave = clave;
        this.colorRopa = "rojo";
        this.trabajando=false;
    }
    
    public Cajero(String nombre, int clave, boolean estado) {
        super(nombre);
        this.clave = clave;
        this.colorRopa = "rojo";
        this.trabajando=estado;
    }
    
    public Cajero(String nombre, int edad, double altura, int clave, String ropa, boolean estado){
        super(nombre, edad, altura);
        this.clave = clave;
        this.colorRopa = ropa;
        this.trabajando=estado;
    
    }
    

    public int getClave() {
        return clave;
    }

    public String getRopa() {
        return colorRopa;
    }
    
    public boolean isTrabajando() {
        return trabajando;
    }

    

    public void setClave(int clave) {
        this.clave = clave;
    }

    public void setRopa(String color) {
        this.colorRopa = color;
    }
    
    public void setTrabajando() {
        this.trabajando = !trabajando;
    }
    
    
    
    public void darGracias(){
        System.out.println("Gracias por su compra!");
    }
    
    public void cobrar(int total, int pago){
    int vuelto=pago-total;
    System.out.println("Tome, su vuelto es de: "+vuelto);
    }
    
    public boolean buscar(String producto, String[] lista){
    boolean hay=false;
        //
    return hay;
    }
    
    @Override
    public void saludar(){
        System.out.println("Hola! Buen día vecino, soy su cajero "+super.getNombre());
    }
    
    
    @Override
    public String toString(){
    return "Soy un cajero y mi nombre es "+super.getNombre();
    }
    
}
