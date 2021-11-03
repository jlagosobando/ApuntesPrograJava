import java.util.Scanner;

// validador
// entrada: cantidad de notas a promediar y las notas
// proceso: promediar las notas
// salida: dar el promedio obtenido
public class EstructurasC4 {
    public static void main(String[] args) {

        //decl. de var.
        Scanner teclado = new Scanner(System.in);
        int cantidadNotas=1;
        double nota;

        //mientras - while
        while (cantidadNotas < 2) {
            System.out.println("Ingresa la cantidad de notas");
            cantidadNotas = teclado.nextInt();
        }//cierre del while

        // hacer mientras - do while
        do{
            System.out.println("Ingresa la nota");
            nota= teclado.nextDouble();
        }while(nota<1 || nota>7);



    } //cierre main
}//cierre clase
