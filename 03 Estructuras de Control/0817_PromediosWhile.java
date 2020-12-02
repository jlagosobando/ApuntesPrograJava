//acumulador=acumulador+algo
// 5 3 6
import java.util.Scanner;

public class CiclosWhile {
    public static void main(String[] args){
        double nota=0,promedio=0;
        int cantidad,i=1;
                
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese cuantas notas quiere promediar");
        cantidad=teclado.nextInt();
        
        while(i<=cantidad)
        {  System.out.println("Ingrese nota #"+i); 
           nota=teclado.nextDouble(); 
           promedio=promedio+nota;
           i++;
        }
        
        promedio=promedio/cantidad;
        System.out.println("Su promedio fue: "+promedio);
        
        
        
        
        }
        
        
    }
 
