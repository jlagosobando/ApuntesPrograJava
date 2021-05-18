import java.util.Scanner;

public class DV
{
   public static void main(String[] args)
   {
       
       int f, m, rut, digito, mult, suma, mod;
       String DV;
       Scanner teclado = new Scanner(System.in);
       
       f=2;
       suma=0;
       
       System.out.println("Ingrese su rut sin DV");
       rut = teclado.nextInt();
       
       while(rut>0){
           digito=rut%10;
           rut=rut/10;
           m=f*digito;
           f++;
           
           if(f>7){
            f=2;}
            
           suma=suma+m;

       }
       
       mod=suma%11;
       mod=11-mod;
       
       if(mod<10){
           DV=String.valueOf(mod);}
       else{
           if(mod==10){
               DV="K";}
           else
               {DV="0";}
            }
            
        System.out.println(DV);

        
    }
 }
