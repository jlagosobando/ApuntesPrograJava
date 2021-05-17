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
        double nota_turno, pond_turno, pond_total=0, promedio=0;
        boolean pedir_pond;
        Scanner teclado = new Scanner(System.in);
        
         System.out.println("Vamos a calcular su promedio");
        // entrada
        
        for(int i=1;i<=3;i++){
        
        do{    
        System.out.println("Ingrese su nota " + i);
        nota_turno=teclado.nextDouble();
        }while(nota_turno<1 || nota_turno>7);
        
        
        do{
        System.out.println("Ingrese ponderación nota " + i);
        pond_turno=teclado.nextDouble();
        
        pond_total=pond_total+pond_turno;
        
        if(pond_total>1){
        pond_total=pond_total-pond_turno;
        pedir_pond=true;
        }else
        {pedir_pond=false;}
        
        
        }while(pond_turno<=0 || pond_turno>1 || pedir_pond==true );
        
        // proceso
        // acumulador
        promedio = promedio +(nota_turno*pond_turno);
    
        }
               
        
        
        // salida
        System.out.println("Su promedio "+promedio);
        
        if (promedio >= 4) {
            System.out.println("Aprobó");
        }
        else{System.out.println("Reprobó");}
        
        
    }
}
