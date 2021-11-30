package com.mycompany.poo1;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Logs {
    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getLogger(Main.class.getName());
        FileHandler fileLog = new FileHandler("mylog.log");
        logger.addHandler(fileLog);
        SimpleFormatter formatter = new SimpleFormatter();
        fileLog.setFormatter(formatter);


        logger.info("Se abre el log");
        logger.warning("Ejemplo de advertencia");
        logger.log(Level.SEVERE,"Ejemplo error");

    }

}
