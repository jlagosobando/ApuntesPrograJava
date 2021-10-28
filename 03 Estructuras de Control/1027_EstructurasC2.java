import java.util.Scanner;

public class EstructurasC2 {
    public static void main(String[] args){

        //entrada: recibir un número cualquiera
        //proceso: clasificarlo en pos, neg o neutro
        //salida: la clasificación de número

        // decl. de var.
        // tipo de dato primitivo - contenedor
        double numero;
        String clasificacion;
        Scanner teclado = new Scanner(System.in);

        // entrada
        System.out.println("Ingrese su num a evaluar");
        numero=teclado.nextDouble();

        // proceso
        // si condicion entonces accion
        // sino accion
        if(numero>0){
            clasificacion = "positivo";
        }
        else{
            if(numero<0){
                clasificacion = "negativo";
            }
            else{
                 clasificacion = "neutro";
            }
        }

        // salida
        System.out.println("su num es "+clasificacion);
    }
}
