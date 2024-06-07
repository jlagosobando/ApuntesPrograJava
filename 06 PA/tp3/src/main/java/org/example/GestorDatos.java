package org.example;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GestorDatos {
    private static final String RUTA_ARCHIVO = "resultados.csv";

    public static void guardarResultados(List<String[]> resultados) {
        try {
            FileWriter fw = new FileWriter(RUTA_ARCHIVO, true); // true para que añada al final del archivo
            for (String[] resultado : resultados) {
                for (int i = 0; i < resultado.length; i++) {
                    fw.append(resultado[i]);
                    if (i != resultado.length - 1) {
                        fw.append(",");
                    }
                }
                fw.append("\n");
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String[]> cargarResultados() {
        List<String[]> resultados = new ArrayList<>();
        try {
            FileReader fr = new FileReader(RUTA_ARCHIVO);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                resultados.add(datos);
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return resultados;
    }
}
