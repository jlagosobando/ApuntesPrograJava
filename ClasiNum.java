//en mi caso los decimales funcionan con coma

import java.util.Scanner;

public class ClasiNum {
    public static void main(String[] args){
        double n;
        String res;
        
        Scanner teclado = new Scanner(System.in);
        
        //entrada
        System.out.println("Ingrese su número");
        n = teclado.nextDouble();
        
        //proceso
        if(n<0){
            res="Negativo";
        }
        else{
            if(n>0){
            res="Positivo";
            }
            else{
            res="Neutro";
            }
        }
        
        //salida
        System.out.println("Su número es "+res);
  
    }  
}  