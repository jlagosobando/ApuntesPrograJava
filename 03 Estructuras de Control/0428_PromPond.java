// promedio ponderado es cuando las notas no valen todas lo mismo
// para cada nota tenemos un factor o poderación
// vamos a trabajar con 3 notas, entregar de aprobado o reprobado
// entrada : 3 notas y poderacion 
// proceso : cada nota se mult por su poderación, sumamos esos productos
// salida : nuestro promedio

package icc700.icc700;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class PromPond {
    public static void main(String[] args) {
     
        // dv
        double nota1, nota2, nota3, pond1, pond2, pond3, promedio;
        Scanner teclado = new Scanner(System.in);
        
         System.out.println("Vamos a calcular su promedio");
        // entrada
               
        System.out.println("Ingrese su nota 1");
        nota1=teclado.nextDouble();
        
        System.out.println("Ingrese ponderación nota 1");
        pond1=teclado.nextDouble();
        
        System.out.println("Ingrese su nota 2");
        nota2=teclado.nextDouble();
        
        System.out.println("Ingrese ponderación nota 2");
        pond2=teclado.nextDouble();
        
        System.out.println("Ingrese su nota 3");
        nota3=teclado.nextDouble();
        
        System.out.println("Ingrese ponderación nota 3");
        pond3=teclado.nextDouble();
        
        // proceso
        promedio=(nota1*pond1)+(nota2*pond2)+(nota3*pond3);
          
        // salida
        System.out.println("Su promedio "+promedio);
        
        if (promedio >= 4) {
            System.out.println("Aprobó");
        }
        else{System.out.println("Reprobó");}
        
        
    }
}
