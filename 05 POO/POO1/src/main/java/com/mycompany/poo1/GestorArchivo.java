/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poo1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class GestorArchivo {

    private Scanner teclado = new Scanner(System.in);

    
    
    public void newDir() {
        System.out.println("Ingrese ruta para directorio");
        String ruta = teclado.next();
        Path directorio = Paths.get(ruta);
        if (Files.exists(directorio)) {
            System.out.println("El directorio ya existe");
        } else {
            try {
                Files.createDirectories(directorio);
                System.out.println("Directorio Creado");
            } catch (IOException e) {
                System.out.println("El directorio no pudo ser creado");
            }
        }
    }

    public void newFile() {
        System.out.println("Ingrese ruta para crear archivo");
        String ruta = teclado.next();
        Path archivo = Paths.get(ruta);
        System.out.println("Ingrese texto a guardar en el archivo");
        String texto = teclado.next();

        try {
            Files.write(archivo, texto.getBytes());
            System.out.println("Se ha guardado en el archivo");
        } catch (IOException e) {
            System.out.println("El archivo no se pudo crear");
        }
    }

    public void readFile() {
        System.out.println("Ingrese ruta para leer archivo");
        String ruta = teclado.next();
        Path archivo = Paths.get(ruta);
        String texto = "";

        try {
            texto = new String(Files.readAllBytes(archivo));
            System.out.println("El contenido del archivo es:\n" + texto);
        } catch (IOException e) {
            System.out.println("El archivo no se pudo leer");
        }
    }

    public void copyFile() {
        System.out.println("Ingrese ruta de origen del archivo");
        String rutaOr = teclado.next();
        Path archivo = Paths.get(rutaOr);
        System.out.println("Ingrese ruta de destino del archivo");
        String rutaDes = teclado.next();
        Path newArchivo = Paths.get(rutaDes);

        try {
            Files.copy(archivo, newArchivo, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("El archivo fue copiado");
        } catch (IOException e) {
            System.out.println("El archivo no se pudo copiar");
        }
    }

    public void delFile() {
        System.out.println("Ingrese ruta para eliminar archivo");
        String ruta = teclado.next();
        Path archivo = Paths.get(ruta);

        try {
            Files.deleteIfExists(archivo);
            System.out.println("El archivo fue eliminado");
        } catch (IOException e) {
            System.out.println("El archivo no se pudo eliminar");
        }
    }

}



