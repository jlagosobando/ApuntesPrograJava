//entrada: dos números, un operador
//proceso: verificar si el divisor es 0, realizar las divs si corresponde
//salida: resultado
import java.util.Scanner;

public class Divisor{
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        
        int num,div;
        double res=0;
        String o;
        
        System.out.println("Ingrese un num a dividir");
        num=teclado.nextInt();
        System.out.println("Ingrese operador");
        o=teclado.next();
        System.out.println("Ingrese divisor");
        div=teclado.nextInt();
        
        if(div!=0)
            {if(o.equals("/"))
                {res=(double)num/div;}
            
             if(o.equals("%"))
                {res=num%div;}
            
             if(o.equals("//"))
                {res=num/div;}   
            }
        else{
            res=0;
            }
        
        System.out.println("Resultado: "+res);        
    }
}
