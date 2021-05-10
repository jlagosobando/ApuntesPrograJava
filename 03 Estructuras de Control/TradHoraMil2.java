package com.mycompany.icc7002;

import java.util.Scanner;

public class TradHoraMil2 {

    public static void main(String[] args) {
        int HHMM, HH, MM;
        String HHF, MMF;
        String apm;
        Scanner teclado = new Scanner(System.in);
        //entrada
        do {
            System.out.println("Ingrese hora");
            HHMM = teclado.nextInt();
            HH = (HHMM / 100);
            MM = (HHMM % 100);
        } while (HHMM < 0 || HHMM > 2359 || MM > 59);

        //proceso
        if (HH >= 12) {
            apm = "PM";
            if (HH != 12) {
                HH -= 12;
            }
        } else {
            apm = "AM";
        }

        HHF = String.format("%02d", HH);
        MMF = String.format("%02d", MM);
        
        //salida
        System.out.println("La hora es "+HHF+":"+MMF+" "+apm);

    } //finMain
}
