package org.example;

/**
 * Clase que representa un pedido.
 * Un pedido tiene una persona, un producto y una cantidad de producto.
 */
public class Pedido {

    private Persona persona;
    private Producto producto;
    private int cantidad;

    /**
     * Constructor de la clase Pedido.
     *
     * @param persona  La persona que realiza el pedido.
     * @param producto El producto pedido.
     * @param cantidad La cantidad del producto pedida.
     */
    public Pedido(Persona persona, Producto producto, int cantidad) {
        this.persona = persona;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    /**
     * Obtiene la persona que realiza el pedido.
     *
     * @return La persona que realiza el pedido.
     */
    public Persona getPersona() {
        return persona;
    }

    /**
     * Establece la persona que realiza el pedido.
     *
     * @param persona La persona que realiza el pedido.
     */
    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    /**
     * Obtiene el producto pedido.
     *
     * @return El producto pedido.
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * Establece el producto pedido.
     *
     * @param producto El producto pedido.
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    /**
     * Obtiene la cantidad del producto pedida.
     *
     * @return La cantidad del producto pedida.
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Establece la cantidad del producto pedida.
     *
     * @param cantidad La cantidad del producto pedida.
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Calcula el precio total del pedido.
     *
     * @return El precio total del pedido.
     */
    public double calcularPrecioTotal() {
        return producto.getPrecio() * cantidad;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "persona=" + persona +
                ", producto=" + producto +
                ", cantidad=" + cantidad +
                ", precio total=" + calcularPrecioTotal() +
                '}';
    }
}
