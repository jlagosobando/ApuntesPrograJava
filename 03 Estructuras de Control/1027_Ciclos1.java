import java.util.Scanner;


public class Ciclos1
{
  public static void main(String args[]) {
         //decla. de variables
          int toques, i;
   
        // creamos el Scanner que usaremos, se llama teclado
        Scanner teclado = new Scanner(System.in);
        
        //entrada
                
    System.out.println("a continuación tocaré la puerta tantas veces como me indiques");
    toques=teclado.nextInt();
    //proceso - salida
    // si condicion entonces accion
    // for(inicio;fin;avance)
    for(i=1; i<=toques;i++){
        System.out.println("Toc toc");
    
    }   
    
    
       
    

      
    }    
}
