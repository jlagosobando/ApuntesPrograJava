import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author Juan
 */
public class PFEx3 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();
        lista.add(64);
        lista.add(23);
        lista.add(54);
        lista.add(87);
        lista.add(91);
        List<Integer> numMayores;

        double a=doubleInput();

        Long result = lista.stream().filter(num -> num > a).count();
        System.out.println(result);
        numMayores = lista.stream().filter(num -> num > a).collect(Collectors.toList());
        System.out.println(numMayores);

    }

    private static double doubleInput() {
        boolean repetir = true;
        double a=0;
        while (repetir) {
            try {
                System.out.println("Ingrese valor para A");
                a = teclado.nextDouble();
                repetir = false;
            } catch (InputMismatchException e) {
                teclado.next();
                System.out.println("A debe ser num");
            }
        }

        return a;
    }

}

