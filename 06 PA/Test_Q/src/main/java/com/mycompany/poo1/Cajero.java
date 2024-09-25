/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poo1;

/**
 * La clase Cajero representa a un cajero en una tienda, que hereda las propiedades de la clase Persona.
 * Un cajero puede tener una clave, un color de ropa, y un estado de trabajo (trabajando o no).
 * La clase incluye métodos para interactuar con los clientes, como cobrar, buscar productos y dar las gracias.
 *
 * @author Juan
 */
public class Cajero extends Persona {

    private int clave;
    private String colorRopa;
    private boolean trabajando;

    /**
     * Constructor por defecto que inicializa los valores de clave, color de ropa,
     * y el estado de trabajo.
     */
    public Cajero() {
        super();
        this.clave = -1;
        this.colorRopa = "rojo";
        this.trabajando = false;
    }

    /**
     * Constructor que inicializa el nombre y la clave del cajero.
     *
     * @param nombre Nombre del cajero
     * @param clave Clave del cajero
     */
    public Cajero(String nombre, int clave) {
        super(nombre);
        this.clave = clave;
        this.colorRopa = "rojo";
        this.trabajando = false;
    }

    /**
     * Constructor que inicializa el nombre, la clave y el estado de trabajo del cajero.
     *
     * @param nombre Nombre del cajero
     * @param clave Clave del cajero
     * @param estado Estado de trabajo (true si está trabajando, false si no)
     */
    public Cajero(String nombre, int clave, boolean estado) {
        super(nombre);
        this.clave = clave;
        this.colorRopa = "rojo";
        this.trabajando = estado;
    }

    /**
     * Constructor que inicializa todas las propiedades del cajero, incluyendo nombre, edad, altura, clave,
     * color de ropa, y estado de trabajo.
     *
     * @param nombre Nombre del cajero
     * @param edad Edad del cajero
     * @param altura Altura del cajero
     * @param clave Clave del cajero
     * @param ropa Color de la ropa del cajero
     * @param estado Estado de trabajo (true si está trabajando, false si no)
     */
    public Cajero(String nombre, int edad, double altura, int clave, String ropa, boolean estado) {
        super(nombre, edad, altura);
        this.clave = clave;
        this.colorRopa = ropa;
        this.trabajando = estado;
    }

    /**
     * Obtiene la clave del cajero.
     *
     * @return Clave del cajero
     */
    public int getClave() {
        return clave;
    }

    /**
     * Obtiene el color de la ropa del cajero.
     *
     * @return Color de la ropa
     */
    public String getRopa() {
        return colorRopa;
    }

    /**
     * Verifica si el cajero está trabajando.
     *
     * @return true si está trabajando, false si no
     */
    public boolean isTrabajando() {
        return trabajando;
    }

    /**
     * Establece una nueva clave para el cajero.
     *
     * @param clave Nueva clave del cajero
     */
    public void setClave(int clave) {
        this.clave = clave;
    }

    /**
     * Establece el color de la ropa del cajero.
     *
     * @param color Nuevo color de la ropa
     */
    public void setRopa(String color) {
        this.colorRopa = color;
    }

    /**
     * Cambia el estado de trabajo del cajero al valor opuesto (si está trabajando, cambia a no trabajando y viceversa).
     */
    public void setTrabajando() {
        this.trabajando = !trabajando;
    }

    /**
     * Muestra un mensaje de agradecimiento al cliente.
     */
    public void darGracias() {
        System.out.println("Gracias por su compra!");
    }

    /**
     * Cobra a un cliente, calcula el vuelto y lo muestra.
     *
     * @param total El monto total de la compra
     * @param pago El monto pagado por el cliente
     */
    public void cobrar(int total, int pago) {
        int vuelto = pago - total;
        System.out.println("Tome, su vuelto es de: " + vuelto);
    }

    /**
     * Busca un producto en una lista de productos.
     *
     * @param producto El producto a buscar
     * @param lista La lista de productos disponibles
     * @return true si el producto se encuentra en la lista, false en caso contrario
     */
    public boolean buscar(String producto, String[] lista) {
        boolean hay = false;
        // Lógica de búsqueda
        return hay;
    }

    /**
     * Muestra un saludo personalizado del cajero.
     */
    @Override
    public void saludar() {
        System.out.println("Hola! Buen día vecino, soy su cajero " + super.getNombre());
    }

    /**
     * Devuelve una representación en cadena de la clase Cajero.
     *
     * @return Una cadena que describe al cajero
     */
    @Override
    public String toString() {
        return "Soy un cajero y mi nombre es " + super.getNombre();
    }
}
