import java.util.Scanner;

public class NotasV2 {
    
        public static void main(String[] args) {
        double nota=0,i,prom=0;
        boolean valida=false;
        Scanner teclado=new Scanner(System.in);
        
        for(i=1;i<=3;i++){
        
            while(nota<1 || nota>7 || !valida)
                {   try{
                        System.out.println("ingrese una nota "+i);
                        nota=teclado.nextDouble();
                        valida=true;
                    }
            
                    catch (Exception e) {
                        System.out.println("ingrese un valor adecuado");
                        valida=false;
                        teclado.next();

            }
        }
             prom=prom+nota;
             nota=0; //reset
          
         
        
    }
            prom=prom/3;
            System.out.println("promedio: "+prom);
        
        
    }
    
}
