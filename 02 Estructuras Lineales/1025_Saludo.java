import java.util.Scanner;

public class Saludo {
    public static void main(String[] args){
    // entrada: no tiene nada
    // proceso-salida: mostrar una frase de saludo por pantalla

    // escribir "eso es nuestro primer saludo en java"
        System.out.print("esto es nuestro primer saludo en java");
        System.out.println("esto es nuestro segundo saludo en java");

    // definir a,b,c como entero
        int a,b,c,d,e;
    // variable <- valor
    // variable = valor
        a=100;
        b=5;
        c=a+b;
        System.out.println(c);

    // leer d
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese un entero para visualizarlo");
        d = teclado.nextInt();
        System.out.println(d);

        System.out.println("ingrese otro entero para visualizarlo");
        e = teclado.nextInt();
        System.out.println(e);
    }
}
