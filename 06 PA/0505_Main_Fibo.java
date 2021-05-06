package com.example.dev;

import java.util.ArrayList;

// 1,2     3,4,5,6,7
// 0,1 ... 1,2,3,5,8..
public class Main_Fibo {



//generador sg posicion
public static int Gen_Fibo(int posicion){
if(posicion==1) return 0;
if(posicion==2) return 1;
else
    return Gen_Fibo(posicion-2)+Gen_Fibo(posicion-1);
}



public static int[] Serie_Fibo(int cantidad){
    int[] serie_prod = new int[cantidad];
    int i;

    for(i=0;i<cantidad;i++){
        serie_prod[i]=Gen_Fibo(i+1);
    }
return serie_prod;
}

}
