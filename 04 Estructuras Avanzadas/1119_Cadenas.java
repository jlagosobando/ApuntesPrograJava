import java.util.Arrays;
import java.util.Scanner;


public class Cadenas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        char a='a';
        String saludo = "hola";
        String pass = "c*f*a*s";

        System.out.println(a);
        System.out.println(saludo);

        System.out.println(saludo.charAt(0));
        System.out.println(saludo.toUpperCase());
        System.out.println(saludo);
        saludo = saludo.toUpperCase();
        System.out.println(saludo);

        char[] deletreo = saludo.toCharArray();
        System.out.println(deletreo);

        String[] saludo_separado = saludo.split("\\*");
        System.out.println(Arrays.toString(saludo_separado));

        String[] pass_separada = pass.split("\\*");
        System.out.println(Arrays.toString(pass_separada));

    }
}
