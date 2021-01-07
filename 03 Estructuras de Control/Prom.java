import java.util.Scanner;

public class Prom {
    public static void main(String[] args){
        //d.v.
        Scanner teclado=new Scanner(System.in);
        double num1=0,num2=0,num3=0,resultado;     
        //e
        
        System.out.println("Ingrese 3 notas");
        
        
        try
            {                
                while(num1<1 || num1>7){
                    System.out.println("Ingrese nota 1");
                    num1 = teclado.nextDouble();
                }
            }
        catch(Exception e)
            {System.out.println("El num no es valido");}
        
        try
            {                
                while(num2<1 || num2>7){
                    System.out.println("Ingrese nota 2");
                    num2 = teclado.nextDouble();
                }
            }
        catch(Exception e)
            {System.out.println("El num no es valido");}  
            
        try
            {                
                while(num3<1 || num3>7){
                    System.out.println("Ingrese nota 3");
                    num3 = teclado.nextDouble();
                }
            }
        catch(Exception e)
            {System.out.println("El num no es valido");}
        
        
        //p
        resultado=(num1+num2+num3)/3;
        
        //s
        System.out.println("El promedio es "+resultado);
        }
   
    }

        

