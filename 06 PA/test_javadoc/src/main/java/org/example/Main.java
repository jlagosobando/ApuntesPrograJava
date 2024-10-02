package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear una persona
        System.out.println("Ingrese el nombre de la persona:");
        String nombrePersona = scanner.nextLine();
        System.out.println("Ingrese la edad de la persona:");
        int edad = scanner.nextInt();
        scanner.nextLine();  // Consumir el salto de línea
        System.out.println("Ingrese la dirección de la persona:");
        String direccion = scanner.nextLine();
        Persona persona = new Persona(nombrePersona, edad, direccion);

        // Crear un producto
        System.out.println("Ingrese el nombre del producto:");
        String nombreProducto = scanner.nextLine();
        System.out.println("Ingrese el precio del producto:");
        double precio = scanner.nextDouble();
        System.out.println("Ingrese la cantidad en stock del producto:");
        int stock = scanner.nextInt();
        Producto producto = new Producto(nombreProducto, precio, stock);

        // Crear un pedido
        System.out.println("Ingrese la cantidad que desea comprar:");
        int cantidad = scanner.nextInt();
        Pedido pedido = new Pedido(persona, producto, cantidad);

        // Mostrar información del pedido
        System.out.println("Información del pedido:");
        System.out.println(pedido);

        // Registro del pedido en log
        Logger logger = new Logger("mylog.log");
        logger.log("INFO: "+"[Registro Pedido] "+pedido);

        scanner.close();
    }
}
