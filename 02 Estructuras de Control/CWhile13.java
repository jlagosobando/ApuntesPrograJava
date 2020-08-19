import java.util.Scanner;
//acumulador=acumulador+algoNuevo

public class CWhile13{
    public static void main(String[] args){
        int i,num,total=0;
        
        Scanner teclado = new Scanner(System.in);
        //hacer sumatoria hasta cierto rango, detenerse al superar 30
        
        while(total<=30){
            System.out.println("Ingrese n's para sumar");
            num=teclado.nextInt();
            total=total+num;
            System.out.println("Sumatoria es: "+total);
          }
        
        }
        
    }
