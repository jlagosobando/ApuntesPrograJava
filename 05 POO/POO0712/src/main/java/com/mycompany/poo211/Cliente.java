package com.mycompany.poo211;

import java.util.Scanner;

/**
 *
 * @author Javi_PC
 */
// HEREDA DE PERSONA!!

public class Cliente extends Cajero {

    // ENVIDIA A UNA CLASE QUE NO EXISTE, VENTA O TRANSACCION
    private int plata; //dinero? presupuesto?
    private int totalProductos;
    private int vuelto; //es importante para el cliente? es CONSTITUYENTE del cliente?
    private int nProductos;

    Scanner teclado = new Scanner(System.in);

    Cliente(String nombre, String gen, byte edad, int plata, int totalProductos, int vuelto, int nProductos) {
        this.plata = plata;
        this.nProductos = nProductos;
        this.vuelto = vuelto;
        this.totalProductos = totalProductos;

    }

    
    public int Pagar() {
        System.out.println("ingrese el monto total de su compra");
        totalProductos = teclado.nextInt();
        System.out.println("ingrese el monto de dinero con el que pagara");
        plata = teclado.nextInt();
        vuelto = plata - totalProductos;
        System.out.println("me quedara " + vuelto + " pesos para un chocolate ");
        return vuelto;

    }

    @Override
    public void cobrar(int total, int pago) {
        int vuelto = plata - totalProductos;
        System.out.println("Tome, su vuelto es de: " + vuelto);

    }

    public Cliente() {
        //super("casual");
        super();
        this.setUniforme("casual");
    }

    public int getPlata() {
        return plata;
    }

    public void setPlata(int laPlata) {
        laPlata = teclado.nextInt();
        this.plata = laPlata;
    }

    public int getTotalProductos() {

        return totalProductos;
    }

    public void setTotalProductos(int elTotalProductos) {
        elTotalProductos = teclado.nextInt();

        this.totalProductos = elTotalProductos;
    }

    public int getnProductos() {
        return nProductos;
    }

    public void setnProductos(int nlProductos) {
        this.nProductos = nlProductos;
    }

}
