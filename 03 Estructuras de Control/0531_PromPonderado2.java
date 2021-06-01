import java.util.Scanner;
//comienza mi programa
public class PromPonderado2
{
    public static void main(String[] args)
    {
        //declara. de variables
        double nota1, nota2, nota3, resProm,f1=0.2, f2=0.2, f3=0.6;
        Scanner teclado = new Scanner(System.in); 
        String frase_amable="ingrese su 1ra nota";
        String frase_seria="por favor ingrese su 2da nota";
        String frase_insistente="LE PEDI UNA 1ra NOTA VALIDA";
        String frase_mostrar=frase_amable;
        int contador=0;
        
        //entrada
        System.out.println("ingrese las 3 notas prácticas que obtuvo en el ramo como número decimal");
        
        System.out.println(frase_amable);
        nota1=teclado.nextDouble();
        
        while(nota1<1 || nota1>7){
            contador++;
            if(contador<3){frase_mostrar=frase_seria;}
            else{frase_mostrar=frase_insistente;}
            
            
            System.out.println(frase_mostrar);
            nota1=teclado.nextDouble();
        }          
        
        do{
            System.out.println("ingrese su 2da nota");
            nota2=teclado.nextDouble();
        }while(nota2<1 || nota2>7);
        
        do{
            System.out.println("ingrese su 3ra nota");
            nota3=teclado.nextDouble();
        }while(nota3<1 || nota3>7);  
        
        
        //proceso
        resProm = nota1*f1+nota2*f2+nota3*f3;
        
        //salida
        System.out.println("El promedio ponderado es "+resProm);
        
        
    }

    
}
