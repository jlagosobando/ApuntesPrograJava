package com.example.dev;
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

//generador sg cantidad




}
