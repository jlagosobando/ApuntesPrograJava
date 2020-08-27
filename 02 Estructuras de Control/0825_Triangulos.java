
//entrada: lados del triangulo
//proceso: revisar si se puede construir, si se puede>>clasificar
//salida: mensajes de armado y clase

import java.util.Scanner;

public class Triangulos{
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        
        double lado1=0,lado2=0,lado3=0;
        
        while(lado1<=0){
            System.out.println("Ingrese lado1");
            lado1=teclado.nextDouble();
        }
        
        while(lado2<=0){
            System.out.println("Ingrese lado2");
            lado2=teclado.nextDouble();
        }
        
        while(lado3<=0){
            System.out.println("Ingrese lado3");
            lado3=teclado.nextDouble();
        }
        
        if((lado1+lado2)>lado3 && (lado3+lado1)>lado2 && (lado2+lado3)>lado1)
        {   if(lado1==lado2 && lado2==lado3){
            System.out.println("Es equilátero");
            }
            else{
                if(lado1!=lado2 && lado2!=lado3 && lado1!=lado3){
                    System.out.println("Es escaleno");
                }
                else
                    {System.out.println("Es isósceles ");}
                }
        }
        else
            {System.out.println("No se puede construir");}
        
    }
}
