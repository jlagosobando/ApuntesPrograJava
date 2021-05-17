// entrada = cantidad de elementos que quiero ver
// proceso = ?
// salida = elementos de la serie
//  0,1 ... 1,2,3,5,8,13,21...
package icc700.icc700;

import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class Fibonacci {

    public static void main(String[] args) {

        long cantidad, fn, i, j, f1 = 0, f2 = 1, div;
        Scanner teclado = new Scanner(System.in);
        
        do {
            System.out.println("Ingrese cuantos ele. quiere generar");
            cantidad = teclado.nextInt();
        } while (cantidad <= 0);

        for (i = 0; i < cantidad; i++) {

            System.out.println(f1);

            if (f1 % 2 == 0) {
                System.out.println("Es PAR");
            } else {
                System.out.println("Es IMPAR");
            }
            
            div=0;
            for(j=1;j<=f1;j++){
                if(f1%j==0){
                div++;
                }
            }
            
            if(div==2){
                System.out.println("Es PRIMO");}
            else{
                System.out.println("Es COMPUESTO");
            }
            
            System.out.println("Tienen "+div+" divisores");

           
            fn = f1 + f2;
            f1 = f2;
            f2 = fn;

        }

    }
}
