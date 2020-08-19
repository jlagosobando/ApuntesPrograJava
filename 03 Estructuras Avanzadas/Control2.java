
package com.mycompany.icc7002;
import java.util.Scanner;

public class Control2 {

    public static int puntaje() {
        Scanner teclado = new Scanner(System.in);
        int juez = 1, puntaje = 0, total = 0, menor = 11, mayor = 0;
        
        for(juez=1;juez<8;juez++){
        
        while(puntaje<1 || puntaje>10){
        System.out.println("ingrese puntaje #" + juez + " para el clavadista ");
        puntaje = teclado.nextInt();
        }
        
        if(puntaje<menor){menor=puntaje;}
        
        if(puntaje>mayor){mayor=puntaje;}
             
        total=total+puntaje;
        puntaje=0;
            }
        total=total-menor-mayor;
        return total;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double jueces, grado = 0;

        jueces = puntaje();

        jueces = (jueces * 0.6);

        while (grado < 1.3 || grado > 3.6) {
            System.out.println("Ingrese grado de dificultad del salto");
            grado = teclado.nextDouble();
        }

        jueces = jueces * grado;

        System.out.println("El puntaje del clavadista es " + jueces);
    }

}
