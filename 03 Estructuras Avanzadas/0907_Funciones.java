import java.util.Scanner;

public class Funciones {
        //sin args sin return
       public static void saludar(){
            System.out.println("Hola! Bienvenide al programa"); 
        
        }
 
       //con args sin return
       public static void saludar(String name){
            System.out.println("Hola "+name+"! Bienvenide al programa"); 
        
        }
        
         //sin args con return
       public static int entradaInt(){
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese un entero");
            return teclado.nextInt();
        
        }
        
        //con args y con return
       public static int entradaInt(int a, int b){
            Scanner teclado = new Scanner(System.in);
            int num = a-1;
            while (num<a || num>b){
                System.out.println("Ingrese un entero entre "+ a +" y "+ b);  
                num=teclado.nextInt();
            }
            return num;
        }
        
       public static int sumar(int x, int y){
           return x+y;
        
       }
    
      public static void main(String[] args) {
        saludar();  
        saludar("Conni");  
        
        int a=5,b=9,c,d,e,f,g;
        double x=9,y=10;
        
        c=sumar(a,b);
        d=sumar(7,5);
        
        System.out.println(c);
        System.out.println(d);
        
        e=entradaInt();
        f=entradaInt(10,17);
        g=entradaInt(10,7); //no sirve si a>b

        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

        }
    
}
