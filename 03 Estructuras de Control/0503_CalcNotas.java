import java.util.Scanner;

public class CalcNotas
{
    public static void main(String[] args)
    {
        //dv
        double p,pmax,n;       
        Scanner key = new Scanner(System.in);
        
        //entrada
        System.out.println("Ingrese puntaje ideal");
        pmax=key.nextDouble();
        
        System.out.println("Ingrese el puntaje obtenido");
        p=key.nextDouble();  
    
        //proceso
        
        if (p < 0.6*pmax) {
            n=3*(p/(0.6*pmax))+1;
        }
        else
        {
            n=3*((p-0.6*pmax)/(pmax*0.4))+4;        
        }
   
        //salida
        System.out.println("Su nota es "+ n);

    }
        
}