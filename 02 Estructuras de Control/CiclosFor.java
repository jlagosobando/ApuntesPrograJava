//en mi caso los decimales funcionan con coma

import java.util.Scanner;

public class CiclosFor {
    public static void main(String[] args){
        double n=0;
        int cantidad=5,i;
        String res;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su números para evaluar");
        
        for(i=0;i<cantidad;i++){
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
        
        System.out.println("estoy aquí xq salí del ciclo");
         
    }  
}  
