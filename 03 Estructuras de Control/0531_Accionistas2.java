
package icc700.icc700;

import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class Accionistas2 {

   public static void main(String[] args){
    //DEC.VAR.
        double RiesgoA, RiesgoB, RentaA, RentaB;
        String Voto1, Voto2, Voto3;
        Scanner teclado = new Scanner(System.in);
   
    //ENTRADAS
        System.out.println("Ingrese Datos para ProyectoA");
        do {
            System.out.println("Ingrese Riesgo para A");
            RiesgoA = teclado.nextDouble();
        } while (RiesgoA < 0 || RiesgoA > 100);

        do {
            System.out.println("Ingrese Rentabilidad para A");
            RentaA = teclado.nextDouble();
        } while (RentaA < 0 || RentaA > 100);

        System.out.println("Ingrese Datos para ProyectoB");
        do {
            System.out.println("Ingrese Riesgo para B");
            RiesgoB = teclado.nextDouble();
        } while (RiesgoB < 0 || RiesgoB > 100);

        do {
            System.out.println("Ingrese Rentabilidad para B");
            RentaB = teclado.nextDouble();
        } while (RentaB < 0 || RentaB > 100);
   
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
        if (RiesgoA < 10 && RiesgoB < 10) {
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
