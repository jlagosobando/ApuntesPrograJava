import java.util.Scanner;


public class Ciclos2
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
    //mientras
    i=1;
    while(i<=toques){
        System.out.println("Toc toc");
         i++;
    }//finwhile
        
    }//finMain  

}//finclase

