import java.util.Scanner;
public class Arreglos {

    public static void main(String[] args) {
        int i;
        double nota;
        Scanner teclado = new Scanner(System.in);

        // tenemos los datos tipo[] nombre = {datos, valores, ...}
        double[] notas = {6.0, 7.0, 5.5, 7.0, 1.0, 7.0};
        
        System.out.println("sout individual");
        System.out.println(notas[2]);
        
        System.out.println("sout todo el arreglo");
        for(i=0; i<notas.length;i++){
            System.out.print(notas[i]+" ");
        }
        
        System.out.println(" ");

        
        // no tenemos los datos, pero si tenemos el largo
        // tipo[] nombre = new tipo[largo]
        double[] notasPris = new double[3];

        System.out.println("Ingresar las notas de Priscila");
        for(i=0; i<notasPris.length;i++){
           System.out.println("Ingresar la nota "+ (i+1));
           notasPris[i] = teclado.nextDouble();
        }
        
        System.out.println("Notas de Priscila");

        for(i=0; i<notasPris.length;i++){
            System.out.print(notasPris[i]+" ");
        }   

        
        
        
        
   }
   
}

