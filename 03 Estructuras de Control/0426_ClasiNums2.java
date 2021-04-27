import java.util.Scanner;

public class ClasNums
{
  public static void main(String[] args){
            //d.v.
            double N;
            String res;
            Scanner teclado = new Scanner(System.in); 
            
            System.out.println("Ingrese un num");
            N = teclado.nextDouble();
            
            if (N<0){
                res="Negativo"; }
            else{    
                 if (N>0){
                        res="Positivo";}
                 else{
                        res="Neutro";
                    
                 }       
                
                }    
            
            System.out.println("Su num es "+res);
        
    }
}


