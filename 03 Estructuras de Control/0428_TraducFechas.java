// vamos a recibir una fecha en formato YYYYMMDD y traducirla como DD de Mes de YYYY
// 20210428 debe traducir a 28 de Abril de 2021
// entrada : una fecha en formato YYYYMMDD
// proceso : separar DD, MM y YYYY 
// salida : una fecha en formato frase
package icc700.icc700;

import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class TraducFechas {

    public static void main(String[] args) {

        //dv
        int fecha, dd, mm, yyyy;
        String mes;

        Scanner teclado = new Scanner(System.in);

        //entrada
        System.out.println("Ingrese fecha en formato YYYYMMDD");
        fecha = teclado.nextInt();

        //20210428 > 28
        dd = fecha % 100;

        //(202104) > 04
        mm = (fecha / 100) % 100;

        yyyy = fecha / 10000;

        switch (mm) {
            case 1:
                mes = "Enero";
                break;
            case 2:
                mes = "Febrero";
                break;
            case 3:
                mes = "Marzo";
                break;
            case 4:
                mes = "Abril";
                break;
            case 5:
                mes = "Mayo";
                break;
            case 6:
                mes = "Junio";
                break;
            case 7:
                mes = "Julio";
                break;
            case 8:
                mes = "Agosto";
                break;
            case 9:
                mes = "Sep";
                break;
            case 10:
                mes = "Octubre";
                break;
            case 11:
                mes = "Nov";
                break;
            case 12:
                mes = "Diciembre";
                break;
            default:
                mes = "#ERROR!";
            
        }

        System.out.println("Su fecha es " + dd + " de " + mes + " de " + yyyy);
    }



}
