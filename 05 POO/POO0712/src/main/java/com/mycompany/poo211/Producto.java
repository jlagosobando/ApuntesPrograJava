
package com.mycompany.poo211;

public class Producto {

    private int id;
    private String nombre;
    private int precio;
    // agregar costo?
    private String tipo;

    public Producto(int id, String nombre, int precio, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
    }

    // this no es necesario en get
    public int getId() {
        return id;
    }

    public String getTipo() {
        return this.tipo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getPrecio() {
        return this.precio;
    }

    public void setPrecio(int newPrecio) {
        this.precio = newPrecio;
    }

    // es del producto, de la transaccion o del cliente?
    public void descuento(int porcentaje) {
        int dctoPrecio = Math.round(this.precio * (1 - (porcentaje / 100f)));
        if (dctoPrecio < 0) {
            dctoPrecio = 0;
        }
        this.setPrecio(dctoPrecio);
    }
    

    @Override
    public String toString() {
        return "Producto: " + id + "\nNombre: " + nombre + "\nPrecio: " + precio + "\nTipo: " + tipo;
    }

    
    
}
