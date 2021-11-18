import java.util.Scanner;

public class ManejoErrores
{
  public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        boolean tempValida; 
        double tempK;
        
        // no quiero tempK<0
        //try-catch
        
            do{
                System.out.println("ingrese la T°K");
                try{
                    tempK=teclado.nextDouble();
                    tempValida=true;
                }
                catch (Exception e) {
                   System.out.println("Ingresó algo distinto a un numero");  
                   tempValida=false;
                   tempK=-1;
                   teclado.next();
                }
            }while(tempValida==false || tempK<0); //no queremos que la temp No sea valida
        
            
            System.out.println("el programa terminará normal");  
        
      
    }//finMain  
}//finclase

