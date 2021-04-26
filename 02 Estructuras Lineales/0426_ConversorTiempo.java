import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class ConversorTiempo {

    public static void main(String[] args) {

        //dv > definir segundos,min,seg como entero
        int segundos, min, seg;
        Scanner teclado = new Scanner(System.in);

        // entrada
        System.out.println("Introduce la cant de segundos a transformar");
        // leer? var=valor
        segundos = teclado.nextInt();

        //proceso segundos=65>> min=1,seg=5
        min = segundos / 60;
        seg = segundos % 60;

        //salida
        System.out.println("Los " + segundos + " segundos, equivalen a " + min + " minutos y " + seg + " segundos");

        //min y seg >10 escribir min,":",seg
        //min<10 y seg>10 escribir "0",min,":",seg
        //min>10 y seg<10 escribir min,":0",seg   
        //min y seg <10 escribir "0",min,":0",seg
        // if(condicion){acciones}
        // else {acciones} 
        
        if (min < 10 && seg < 10) {
            System.out.println("0" + min + ":0" + seg);
        } else if (min < 10) {
            System.out.println("0" + min + ":" + seg);
        } else if (seg < 10) {
            System.out.println(min + ":0" + seg);
        } else if (min > 10 && seg > 10) {
            System.out.println(min + ":" + seg);
        }
        
      

    }

}
