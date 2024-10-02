package org.example;

/**
 * Clase que representa un producto.
 * Un producto tiene un nombre, un precio y una cantidad en stock.
 */
public class Producto {

    private String nombre;
    private double precio;
    private int stock;

    /**
     * Constructor de la clase Producto.
     *
     * @param nombre Nombre del producto.
     * @param precio Precio del producto.
     * @param stock  Cantidad en stock del producto.
     */
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    /**
     * Obtiene el nombre del producto.
     *
     * @return El nombre del producto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del producto.
     *
     * @param nombre El nombre del producto.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el precio del producto.
     *
     * @return El precio del producto.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del producto.
     *
     * @param precio El precio del producto.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Obtiene la cantidad en stock del producto.
     *
     * @return La cantidad en stock del producto.
     */
    public int getStock() {
        return stock;
    }

    /**
     * Establece la cantidad en stock del producto.
     *
     * @param stock La cantidad en stock del producto.
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }
}
