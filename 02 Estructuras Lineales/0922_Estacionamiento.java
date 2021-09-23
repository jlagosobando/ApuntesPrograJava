// con esto decimos que usaremos el Scanner
import java.util.Scanner;


public class Estacionamiento
{
  public static void main(String args[]) {
     	//decla. de variables
	int valorEntrada, valorHora;
	double Vhoras,Total,Horas;
	
	// creamos el Scanner que usaremos, se llama teclado
        Scanner teclado = new Scanner(System.in);
        
	//entrada
	System.out.println("Ingrese el valor base del estacionamiento");
	//usamos el Scanner con la forma variable=valor, variable=teclado.nextTIPODEDATO()
	valorEntrada = teclado.nextInt();
	
	System.out.println("Ingrese el valor de hora del servicio");
	valorHora = teclado.nextInt();
	
	System.out.println("Ingrese las hora de uso");
	Horas = teclado.nextDouble();
	
	//proceso
	//variable = valor
	
	Vhoras=valorHora*Horas;
	Total=valorEntrada+Vhoras;

	//salida
	System.out.println("El total a pagar es "+Total);
   
 
      
    }    
}
