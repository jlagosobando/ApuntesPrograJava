import java.util.Scanner;
//acumulador=acumulador+algoNuevo

public class CFor13{
    public static void main(String[] args){
        int i,num,total=0;
        
        Scanner teclado = new Scanner(System.in);
        
        //hacer una sumatoria de 5 nums
        for(i=0;i<5;i++){
            System.out.println("Ingrese n's para sumar");
            num=teclado.nextInt();
            total=total+num;
            System.out.println("Sumatoria es: "+total);
        } 
        
        //muestre los pares entre un rango [0-20]
        System.out.println("Los pares son:");
        for(i=0;i<=20;i=i+2){
            System.out.print(i+" ");
        
        }
        
    }
}