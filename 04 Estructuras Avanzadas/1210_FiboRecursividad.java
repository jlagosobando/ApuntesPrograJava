package com.example.prueba;

import java.util.Scanner;

public class FiboRecursividad {

    public static void main(String[] args) {

    int i,s1,s2,sn;
    Scanner teclado = new Scanner(System.in);

    //entrada : el numero 5
    //proceso : generar los 5  primeros nums de la serie de fib
    //salida : esos 5 numeros 0,1,1,2,3
    s1=0;
    s2=1;

     for(i=1;i<=5;i++){
         System.out.println(s1);
         sn=s1+s2;
         s1=s2;
         s2=sn;

     }

}//finMain

public static int Gen_Fibo(int posicion){
    if(posicion==1) return 0;
    if(posicion==2) return 1;
    else
        return Gen_Fibo(posicion-2)+Gen_Fibo(posicion-1);

    }//finGenFibo


}//finClass

