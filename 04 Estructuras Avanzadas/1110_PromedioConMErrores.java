// entrada: recibir 3 notas. validarlas y manejar
// proceso: promediar las 3 notas
// salida: entregar promedio


import java.util.Scanner;

public class PromedioConMErrores {
    public static void main(String[] args) {
     int cantNotas=3,i;
     boolean notaValida;
     double nota=0, promedio;

     Scanner teclado = new Scanner(System.in);

    for(i = 1; i <= cantNotas; i++) {

        System.out.println("Ingrese la nota n "+i);
        do {
            try {
                nota = teclado.nextDouble();
                notaValida = true;
            } catch (Exception e) {
                System.out.println("La nota no es válida");
                notaValida = false;
                teclado.next();
            }
        } while (notaValida = false || nota < 1 || nota > 7);

        //terminar proceso

    }//finFor



    }//finMain
}//finClass
