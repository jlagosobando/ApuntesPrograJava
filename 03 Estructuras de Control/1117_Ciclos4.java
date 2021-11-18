import java.util.Scanner;

public class Ciclos4
{
  public static void main(String args[]) {
         //decla. de variables
          double tempK;
          String mag;   
   
        // creamos el Scanner que usaremos, se llama teclado
        Scanner teclado = new Scanner(System.in);
        
        // entrada
        // no quiero que mag!="Kelvin"
        // mag.equals("Kelvin") es lo mismo mag=="Kelvin"                  
        
        do{
            System.out.println("ingrese la palabra Kelvin");
            mag=teclado.next();
            
        }while(!mag.equals("Kelvin"));
        
        
        
        // no quiero tempK<0
        do{
            System.out.println("ingrese la T°K");
            tempK=teclado.nextDouble();
            
        }while(tempK<0); //casos que no quiero

               
        
        
    }//finMain  
}//finclase

