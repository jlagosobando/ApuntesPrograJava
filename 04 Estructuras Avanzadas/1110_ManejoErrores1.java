import java.util.Scanner;

public class ManejoErrores1{
    public static void main(String[] args) {
    int numero1=0, numero2=0;
    Scanner teclado = new Scanner(System.in);

    System.out.println("Ingrese un numero");

    // try-catch
    try{
    numero1=teclado.nextInt();}
    catch(Exception e){
        System.out.println("Ingresó algo distinto a un numero");
    }

   System.out.println("Ingrese un segundo numero");
    try{
        numero2=teclado.nextInt();}
    catch(Exception e){
        System.out.println("Ingresó algo distinto a un numero");
    }

    System.out.println("numero 1 >>> "+numero1);
    System.out.println("numero 2 >>> "+numero2);

    }
}
