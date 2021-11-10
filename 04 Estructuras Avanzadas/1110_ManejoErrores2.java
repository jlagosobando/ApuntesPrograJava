import java.util.Scanner;

public class ManejoErrores2 {

    public static void main(String[] args) {
        int numero1=0, numero2=0;
        boolean valido1, valido2=false;
        Scanner teclado = new Scanner(System.in);



        // try-catch
        do {
            System.out.println("Ingrese un numero");
            try {
                numero1 = teclado.nextInt();
                valido1=true;
                System.out.println("si llegué aquí, el try no explotó");
            } catch (Exception e) {
                valido1=false;
                System.out.println("Ingresó algo distinto a un numero");
                teclado.next();
            }
        }while(valido1==false);


        while(valido2==false) {
            System.out.println("Ingrese un segundo numero");
            try {
                numero2 = teclado.nextInt();
                valido2=true;
            } catch (Exception e) {
                valido2=false;
                System.out.println("Ingresó algo distinto a un numero");
                teclado.next();
            }
        }


        System.out.println("numero 1 >>> "+numero1);
        System.out.println("numero 2 >>> "+numero2);

    }


}
