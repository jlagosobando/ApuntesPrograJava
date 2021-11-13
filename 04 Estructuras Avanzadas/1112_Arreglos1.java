import java.util.Scanner;

public class Arreglos1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        //double nota1,nota2,nota3;

        //tenemos los datos tipo[] nombre = {datos, valores, ...}
        double[] notasArmin = {6.0, 7.0, 5.5, 7.0, 1.0};
        int i;

        System.out.println("sout individual");
        System.out.println(notasArmin[1]);
        //System.out.println(notasArmin);

        System.out.println("sout con ciclo");
        for(i=0; i<3; i++){
            System.out.println(notasArmin[i]);
        }

        System.out.println("sout con ciclo y largo del arreglo");
        for(i=0; i<notasArmin.length; i++){
            System.out.println(notasArmin[i]);
        }


        //no tenemos los datos, pero si tenemos el largo
        //tipo[] nombre = new tipo[largo]
        double[] notasPris = new double[5];

        System.out.println("Ingresar las notas de Priscila");
        //notasPris[0] = teclado.nextDouble();
        //notasPris[1] = teclado.nextDouble();
        //notasPris[2] = teclado.nextDouble();

        for(i=0; i<notasPris.length; i++){
            notasPris[i] = teclado.nextDouble();
        }

        System.out.println("impresion notas");
        for(i=0; i<notasPris.length; i++){
            System.out.println(notasPris[i]);
        }

        try{
            System.out.println(notasPris[notasPris.length]);}
        catch(Exception e){
            System.out.println("Casilla fuera de rango");}






    }//finMain
}//finClass
