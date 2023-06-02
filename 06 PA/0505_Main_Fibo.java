package org.example;

public class Main_fibo {
    public static void main(String[] args) {


    }

    public static int Gen_Fibo(int posicion) {
        if(posicion==1) return 0;
        if(posicion==2) return 1;
        else
            return Gen_Fibo(posicion-2)+Gen_Fibo(posicion-1);
    }




    public static int[] Serie_Fibo(int cantidad){
        int[] serie_prod=new int[cantidad];

        for(int i=1;i<=cantidad;i++){
            serie_prod[i-1]=Gen_Fibo(i);
        }
        return serie_prod;

    }



    }
