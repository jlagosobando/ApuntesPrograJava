package com.example.dev;

public class Main_Fibo {

public static int Gen_Fibo(int posicion){
    if (posicion == 1) {
        return 0;
    }
    if (posicion == 2) {
        return 1;
    } else {
        return Gen_Fibo(posicion-2)+Gen_Fibo(posicion-1);
    }
}
}
