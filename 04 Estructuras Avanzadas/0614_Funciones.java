import java.util.Scanner;

public class Funciones {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int a;
        double nota1, nota2, nota3;
        
        Saludar("Ben");
        Saludar("Paula");
        Saludar("Juan");
        Saludar("Angela");
        Saludar("Adolfo");
        
        a=Suma(10,20);
        System.out.println(a);
        
        nota1=ingresoNota();
        nota2=ingresoNota();
        nota3=ingresoNota();
        
        System.out.println(nota1);
        
        
        
    } //fin main  
   
    public static void Saludar(String nombre){
        System.out.println("Hello my name is "+nombre);

    } //fin saludar
      
    public static int Suma(int a, int b){
        int res = a+b;
        return res;
    } //fin suma

    public static double ingresoNota(){
        Scanner teclado = new Scanner(System.in);
        double notaValida=0;
        
        do{
            System.out.println("Ingrese su nota");
            try{
                notaValida=teclado.nextDouble();
            }
            catch(Exception e){
                System.out.println("Ingrese una nota valida");
                teclado.next();
                notaValida=0;
            }
        }while(notaValida<1 || notaValida>7);
        
        System.out.println("Se validó su nota, es: "+notaValida);
        return notaValida;
        
    }
    
    
    
} //fin pub clase