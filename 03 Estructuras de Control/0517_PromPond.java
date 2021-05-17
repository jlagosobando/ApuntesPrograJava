//promedio ponderado es cuando las notas no valen todas lo mismo
//para cada nota tenemos un factor o ponderación
//vamos a trabajar con 3 notas, entregar estado de aprobado o reprobado
//entrada: 3 notas y ponderacion
//proceso: cada nota se mult por su ponderación, sumamos esos productos
//salida; nuestro promedio
package icc700.icc700;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class PromPond {

    public static void main(String[] args) {

        //dv
        double nota_turno, pond_turno, pond_total = 0, promedio = 0;
        boolean pedir_pond;
        Scanner teclado = new Scanner(System.in);

        //entrada
        System.out.println("Vamos a calcular su promedio");

        for (int i = 1; i <= 3; i++) {

            while(true){
                System.out.println("Ingrese su nota " + i);
                nota_turno = teclado.nextDouble();
                if(nota_turno >= 1 && nota_turno <= 7){
                    break;
                }
            }
            

            do {
                System.out.println("Ingrese ponderación nota " + i);
                pond_turno = teclado.nextDouble();
                pond_total = pond_total + pond_turno;
                
                //System.out.println("pond turno y total "+pond_turno+" "+pond_total);

                if (pond_total > 1 || (pond_total < 1 && i==3) || (pond_total >= 1 && i==2) || (pond_total >= 1 && i==1)) {
                    pond_total = pond_total - pond_turno;
                    pedir_pond = true;
                } else {
                    pedir_pond = false;
                }
            } while (pond_turno < 0 || pond_turno > 1 || pedir_pond);

            //proceso
            //acumulador
            promedio = promedio + (nota_turno * pond_turno);
        }

        //salida
        System.out.println("Su promedio es " + promedio);

        if (promedio >= 4) {
            System.out.println("Aprobó");
        } else {
            System.out.println("Reprobó");
        }

    }//fin main
}//fin class
