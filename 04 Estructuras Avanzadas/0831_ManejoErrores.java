import java.util.Scanner;

public class ManejoErrores {
    
        public static void main(String[] args) {
        int num=0,nota=0;
        boolean valida=false;
        Scanner teclado=new Scanner(System.in);
        
        /*
        try{
            while(num<1 || num>7)
                {System.out.println("ingrese una nota");
                    num=teclado.nextInt();
        
            }   
        }
        catch (Exception e) {
            System.out.println("ingrese un valor adecuado");
        
        }*/
        
        while(nota<1 || nota>7 || !valida)
            {   try{
                    System.out.println("ingrese una nota");
                    nota=teclado.nextInt();
                    valida=true;
                }
            
                catch (Exception e) {
                System.out.println("ingrese un valor adecuado");
                valida=false;
                teclado.next();

            }
        }
            
        
        System.out.println("la var nota guardó: "+nota);
        
        
    }
    
}