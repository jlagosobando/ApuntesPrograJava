// entrada: datos sobre proyectos (riesgo y renta)
// proceso: para c/acccionista buscar opc de voto sg los datos del proyecto
// salida: intencion de voto de c/accionista bono: definir proy ganador
package icc700.icc700;

import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class Accionistas1 {

    public static void main(String[] args) {

        //DEC.VAR.
        double RiesgoA, RiesgoB, RentaA, RentaB;
        String Voto1, Voto2, Voto3;
        Scanner teclado = new Scanner(System.in);

        //ENTRADAS
        System.out.println("Ingrese Datos para ProyectoA");
        System.out.println("Ingrese Riesgo para A");
        RiesgoA = teclado.nextDouble();
        System.out.println("Ingrese Rentabilidad para A");
        RentaA = teclado.nextDouble();

        System.out.println("Ingrese Datos para ProyectoB");
        System.out.println("Ingrese Riesgo para B");
        RiesgoB = teclado.nextDouble();
        System.out.println("Ingrese Rentabilidad para B");
        RentaB = teclado.nextDouble();

        //PROCESO
        //ACCIONISTA1
        if (RiesgoA > 60 && RiesgoB > 60) {
            Voto1 = "Abs.";
        } else if (RiesgoA > 60) {
            Voto1 = "B";
        } else if (RiesgoB > 60) {
            Voto1 = "A";
        } else if (RentaA > RentaB) {
            Voto1 = "A";
        } else if (RentaB > RentaA) {
            Voto1 = "B";
        } else {
            Voto1 = "Abs.";
        }

        //ACCIONISTA2
        if (RiesgoA > 30 && RiesgoB > 30) {
            Voto2 = "Abs.";
        } else if (RiesgoA > 30) {
            Voto2 = "B";
        } else if (RiesgoB > 30) {
            Voto2 = "A";
        } else if (RentaA > RentaB) {
            Voto2 = "A";
        } else if (RentaB > RentaA) {
            Voto2 = "B";
        } else {
            Voto2 = "Abs.";
        }

        //ACCIONISTA3
        if (RiesgoA > 60 && RiesgoB > 60 && RentaA > 50 && RentaB > 50) {
            if (RiesgoA < RiesgoB) {
                Voto3 = "A";
            } else if (RiesgoB < RiesgoA) {
                Voto3 = "B";
            } else {
                Voto3 = "Abs.";
            }
        } else if (RiesgoA < 10 && RiesgoB < 10) {
            if (RentaA > RentaB) {
                Voto3 = "A";
            } else if (RentaB > RentaA) {
                Voto3 = "B";
            } else {
                Voto3 = "Abs.";
            }
        } else {
            if (RiesgoA < RiesgoB) {
                Voto3 = "A";
            } else if (RiesgoB < RiesgoA) {
                Voto3 = "B";
            } else {
                Voto3 = "Abs.";
            }
        }

        //SALIDA
        System.out.println("Accionista 1 vota: " + Voto1);
        System.out.println("Accionista 2 vota: " + Voto2);
        System.out.println("Accionista 3 vota: " + Voto3);
        
        
        
    }
}
