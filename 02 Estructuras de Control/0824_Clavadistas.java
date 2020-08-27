//entrada: dif del salto, 7 notas 
//proceso: obtener las 7 notas, sumarlas, quitar extremos, recibir dif, multiplicar notas*06*dif
//salida: puntaje
import java.util.Scanner;

public class Clavadistas{
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        
        double sumatoria=0,dif=0;
        int juez,i,mayor=0,menor=11;
        
        for(i=1;i<8;i++){
            juez=0;
            while(juez<1 || juez>10){
                System.out.println("Ingrese nota juez"+i);
                juez=teclado.nextInt();}
                
            if(juez>mayor){mayor=juez;}  
            
            if(juez<menor){menor=juez;}    

            //sumatoria=sumatoria+juez
            sumatoria+=juez;
        }
        
        sumatoria=sumatoria-menor-mayor;
        
        while(dif<1.3 || dif>3.6){
                System.out.println("Ingrese Dif");
                dif=teclado.nextDouble();}
        
        sumatoria=sumatoria*0.6*dif;
        System.out.println("Puntaje: "+sumatoria);     
    }
}
