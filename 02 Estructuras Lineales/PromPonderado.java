import java.util.Scanner;
//comienza mi programa
public class PromPonderado
{
    public static void main(String[] args)
    {
        //declara. de variables
        double nota1, nota2, nota3, resProm,f1=0.2, f2=0.2, f3=0.6;
        Scanner teclado = new Scanner(System.in); 
        
        //entrada
        System.out.println("ingrese las 3 notas prácticas que obtuvo en el ramo como número decimal");
        nota1=teclado.nextDouble();
        nota2=teclado.nextDouble();
        nota3=teclado.nextDouble();
    
        //proceso
        resProm = nota1*f1+nota2*f2+nota3*f3;
        
        //salida
        System.out.println("El promedio ponderado es "+resProm);
        
        
    }

    
}
