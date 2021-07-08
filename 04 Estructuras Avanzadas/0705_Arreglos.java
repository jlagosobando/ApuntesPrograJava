
import java.util.Scanner;
public class Arreglos
{
     public static void main(String[] args){  
         int i;
         
         Scanner teclado = new Scanner(System.in);  
         System.out.println("Uso de Arreglos");
         
        //tipo[] nombre = {datos,datos}
        //temperaturas
        double[] arreglo1 = {1.9, 7.6, 5.3, 10.5, 8, 7.2, 10};
        
        
        
        System.out.println(arreglo1[0]);
        printArreglo(arreglo1);
       
        //tipo[] nombre = new tipo[largo]
        double[] arreglo2 =new double[4];
        // casilla=valor
        
        for(i=0;i<arreglo2.length;i++){
            System.out.println("ingrese su num al arreglo2, casilla:"+i);
            arreglo2[i]=teclado.nextDouble();
        
        }
        
        printArreglo(arreglo2);
        
        double suma=0,promedio;
        for(i=0;i<arreglo2.length;i++){
            suma=suma+arreglo2[i];
        
        }
        
        promedio=suma/arreglo2.length;
        System.out.println("el promedio del arreglo2 es: "+promedio);
        
        
        
        
        
     }
     
     
     
     public static void printArreglo(double[] arregloAimprimir){
        int i; 
        for(i=0;i<arregloAimprimir.length;i++){
            System.out.print(arregloAimprimir[i] + " ");
         
        }
        System.out.println("\n");
        
        }
     
     
     
}