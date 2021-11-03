/* @author pancho
 * Autor Original Profesor Francisco Escobar
 */

import java.util.Scanner;

public class EstructurasC3 {
    public static void main(String[] args){
        //decla. var.
        int opcion;
        Scanner teclado = new Scanner(System.in);

        //entrada
        System.out.println("Ingresa una opción");
        opcion = teclado.nextInt();

        //proceso-salida
        switch(opcion){
            case 1:
                System.out.println("Seleciono la opcion 1");
                break;
            case 2:
                System.out.println("Seleciono la opcion 2");
                break;
            case 3:
                System.out.println("Seleciono la opcion 3");
                break;
            case 4:
                System.out.println("Seleciono la opcion 4");
                break;
            case 5:
                System.out.println("Seleciono la opcion 5");
                break;
            default:
                System.out.println("opcion no valida");
        }
        System.out.println("adios");
    }
}
