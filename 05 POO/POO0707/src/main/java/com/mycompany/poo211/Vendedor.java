package com.mycompany.poo211;

/**
 *
 * @author Juan
 */
public class Vendedor extends Persona {

    private String uniforme; // sg color representa un area de trabajo
    private int jornada; // hrs de trabajo a la semana

    public Vendedor() {
        super();
    }

    public Vendedor(String color, int hrsSemanales) {
        super();
        this.uniforme = color;
        this.jornada = hrsSemanales;
    }

    public Vendedor(String nombre, String gen, byte edad, String rut, String color, int hrsSemanales) {
        super(nombre, gen, edad, rut);
        this.uniforme = color;
        this.jornada = hrsSemanales;
    }

    //setter getter
    public String getUniforme() {
        return uniforme;
    }

    public void setUniforme(String color) {
        this.uniforme = color;
    }

    public int getJornada() {
        return jornada;
    }

    public void setJornada(int hrsSemanales) {
        this.jornada = hrsSemanales;
    }

    @Override
    public String toString() {
        return "Hola soy " + super.getNombre() + "\ntengo " + super.getEdad() + " años \ny trabajo en la zona " + uniforme + " del local";
    }

}
