import java.util.Scanner;

// entrada: cantidad de notas a promediar y las notas
// proceso: promediar las notas
// salida: dar el promedio obtenido
public class EstructurasC5 {
    public static void main(String[] args) {

        //decl. de var.
        Scanner teclado = new Scanner(System.in);
        int cantidadNotas=1,i;
        double nota, sumatoria=0, promedio;

        //mientras - while
        while (cantidadNotas < 2) {
            System.out.println("Ingresa la cantidad de notas");
            cantidadNotas = teclado.nextInt();
        }//cierre del while

        // para - for
        // for(inicio;fin;avance)
        // i=i+1 equivale al i++
        for(i=1;i<=cantidadNotas;i++){

            // hacer mientras - do while
            do{
                System.out.println("Ingresa la nota "+i);
                nota = teclado.nextDouble();
            }while(nota<1 || nota>7);

            sumatoria=sumatoria+nota;

        }// cierre del for

        promedio=sumatoria/cantidadNotas;
        System.out.println("El promedio es "+promedio);


    } //cierre main
}//cierre clase