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
    if(numero>0){respuesta="El numero es positivo";}
    else {respuesta="Su numero no es positivo";}
            

        //salida
    System.out.println(respuesta);

      
    }    
}
