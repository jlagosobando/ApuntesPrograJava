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
public class Persona {

    private String nombre;
    private int edad;
    private double altura;

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
        this.edad = -1;
        this.altura = -1;
    }

    public Persona(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void saludar(){
        System.out.println("Hola! Buen día vecino, soy "+nombre);
    }
    
    @Override
    public String toString(){
    return "Soy una persona y mi nombre es "+nombre;
    }
    
    
    
}
