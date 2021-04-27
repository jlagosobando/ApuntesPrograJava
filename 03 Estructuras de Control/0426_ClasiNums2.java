import java.util.Scanner;

public class ClasNums2
{
  public static void main(String[] args){
            //d.v.
            double N;
            
            Scanner teclado = new Scanner(System.in); 
            
            System.out.println("Ingrese un num");
            N = teclado.nextDouble();
            
            if (N<0){
                System.out.println("Su num es Negativo"); }
            else{    
                 if (N>0){
                        System.out.println("Su num es Positivo");}
                 else{
                        System.out.println("Su num es Neutro");
                    
                 }       
                
                }    
            

    }
}

