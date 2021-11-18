import java.util.Scanner;

public class Ciclos3
{
  public static void main(String args[]) {
         //decla. de variables
          double nota;
          double nota2=-1; //iniciamos con una nota inutil
   
        // creamos el Scanner que usaremos, se llama teclado
        Scanner teclado = new Scanner(System.in);
        
        // entrada
        // no me sirve nota<1
        // no me sirve nota>7
        // vamos a repetir mientras mi nota sea menor a 1 O mayor a 7
        // VALIDADORES AMBOS HACEN LOS MISMO
        do{
            System.out.println("ingrese su nota de test");
            nota=teclado.nextDouble();
        }while(nota<1 || nota>7); //casos que no quiero

               
        while(nota2<1 || nota2>7){
            System.out.println("ingrese su segunda nota");
            nota2=teclado.nextDouble();
        }       

        
        
    }//finMain  
}//finclase

