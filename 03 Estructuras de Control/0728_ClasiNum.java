import java.util.Scanner;

public class Clasificador {
    public static void main(String[] args){
        //d.v.
        Scanner teclado=new Scanner(System.in);
        double num;
        String res="";
        
        
        //e
        System.out.println("Ingrese un número");
        
        try
            {num=teclado.nextDouble();
            //p
            if(num>0)
                {res="positivo";}
            else
                {   if(num<0)
                        {res="negativo";}
                    else
                        {res="neutro";}
                }
            //s
            System.out.println("Su número es "+res);
            }
     
        catch (Exception e)
            {System.out.println("Ingreso erroneo de num");}
        

        }
   
    }

