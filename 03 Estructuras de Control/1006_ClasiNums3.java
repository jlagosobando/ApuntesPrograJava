// recordar que esta versión 3 de código corresponde el psc versión 4
// con esto decimos que usaremos el Scanner
import java.util.Scanner;


public class Condicionales
{
  public static void main(String args[]) {
         //decla. de variables
        String respuesta;
    double numero;

        
        // creamos el Scanner que usaremos, se llama teclado
        Scanner teclado = new Scanner(System.in);
        
        //entrada
                
    System.out.println("Ingrese un num a evaluar");
    numero=teclado.nextDouble();

    //proceso
    // si condicion entonces accion
    if(numero>0)  
            {respuesta="El numero es positivo";}
    else {  if(numero<0)  
                {respuesta="Su numero es negativo";}
                else 
                    {respuesta="El numero es neutro";}
             }
    

    
    
        //salida
    System.out.println(respuesta);

      
    }    
}
