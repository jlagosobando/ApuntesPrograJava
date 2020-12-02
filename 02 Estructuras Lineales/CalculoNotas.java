import java.util.Scanner;

public class CalculoNotas {
        public static void main(String[] args) {
        //decla. de var.
        double N1,N2,N3,P1,P2,P3,Nota; 
        Scanner teclado = new Scanner(System.in);
        
        //entrada
        System.out.println("Ingrese 3 notas, separadas por un enter");
        N1 = teclado.nextDouble();
        N2 = teclado.nextDouble();
        N3 = teclado.nextDouble();
     
        System.out.println("Ingrese las 3 ponderaciones de notas en orden, separadas por un enter");
        P1 = teclado.nextDouble();
        P2 = teclado.nextDouble();
        P3 = teclado.nextDouble();
        
        //proceso
        Nota=(N1*P1)+(N2*P2)+(N3*P3);
        
        //salida
        System.out.println("Su promedio es "+Nota);
        
    }
   
 }
 
 // inicio y fin = "class" y "void main" y { }
 // Escriba = System.out.println
 // Lea = teclado.nextAlgo() y Scanner teclado = new Scanner(System.in); y import java.util.Scanner;
 // siempre al cerrar instrucción ; ... PUNTO Y COMA!!
 