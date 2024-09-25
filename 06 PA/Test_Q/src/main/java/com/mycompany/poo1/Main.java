package com.mycompany.poo1;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 *
 * @author Juan
 */
public class Main {

    public static void main(String[] args) throws IOException {

        Cajero cajero0 ,cajero1 ,cajero2 ,cajero3 ,cajero4;
       
        Logger logger = Logger.getLogger(Main.class.getName());
        FileHandler fileLog = new FileHandler("mylog.log");
        logger.addHandler(fileLog);
        SimpleFormatter formatter = new SimpleFormatter();  
        fileLog.setFormatter(formatter); 
        
        Scanner teclado = new Scanner(System.in);

        String n = "Don Mario";
        int pass = 1234;

        GestorArchivo ga = new GestorArchivo();

        cajero0 = new Cajero();
        cajero1 = new Cajero("Don Pepito", 1501);
        cajero2 = new Cajero(n, pass);
        cajero3 = new Cajero("Luchito", 1111, true);
        cajero4 = new Cajero("Carlitos", 68, 170, 1234, "Negro", true);

        System.out.println(cajero0.getNombre());
        System.out.println(cajero1.getClave());
        System.out.println(cajero2.getRopa());

        cajero0.setNombre("Julito");
        System.out.println(cajero0.getNombre());
        logger.info("Se creó cajero llamado " + cajero0.getNombre());

        System.out.println(cajero3.isTrabajando());
        cajero3.saludar();
        cajero3.darGracias();

        cajero2.cobrar(5620, 10000);
        System.out.println("******");


        logger.info("Proceso Finalizado");
        
    }

}
