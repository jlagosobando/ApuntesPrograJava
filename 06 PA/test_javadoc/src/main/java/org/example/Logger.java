package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Clase para el manejo de logs. Permite añadir mensajes acumulativos en un archivo de texto.
 */
public class Logger {

    private String logFile;

    /**
     * Constructor de la clase Logger. Inicializa el nombre del archivo de log.
     *
     * @param logFile El nombre del archivo de log.
     */
    public Logger(String logFile) {
        this.logFile = logFile;
    }

    /**
     * Método que añade un mensaje al archivo de log de forma acumulativa.
     *
     * @param mensaje El mensaje que se desea agregar al archivo de log.
     */
    public void log(String mensaje) {
        try (FileWriter fileWriter = new FileWriter(logFile, true); // true para escritura acumulativa
             PrintWriter printWriter = new PrintWriter(fileWriter)) {

            // Formato para la fecha y hora actual
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            String timeStamp = dtf.format(LocalDateTime.now());

            // Escribir el mensaje con la marca de tiempo en el archivo
            printWriter.println(timeStamp + " - " + mensaje);

        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo de log: " + e.getMessage());
        }
    }
}
