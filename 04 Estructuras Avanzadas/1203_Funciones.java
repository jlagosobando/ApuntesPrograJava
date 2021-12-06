import java.util.Scanner;

public class Funciones {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
    saludar();
    saludar("Diego");
    saludar("Diego","Joaquín");

    String saludo = "esto vive en Main()";
    System.out.println(saludo);
    System.out.println("Esto viene de la función>> "+saludo());

    double G = constG();
    double dobleG = constG()*2;
    System.out.println("la cont G es "+G+" y su doble es "+dobleG);

    int recibido = entradaInt();
    System.out.println(recibido);
    
    int nota = entradaInt(1,7);
    System.out.println(nota);
    
    }//finMain


    //sin parametros sin return
    public static void saludar(){
        System.out.println("Hola! Bienvenide al programa");
    }

    // con parametros sin return
    public static void saludar(String name){
        System.out.println("Hola "+name+"! Bienvenide al programa");

    }

    public static void saludar(String unName, String otroName){
        System.out.println("Hola "+unName+" y "+otroName+"! Bienvenides al programa");
    }

    //sin parametros con return
    public static String saludo(){
        String saludo = "Hola, esto es un saludo retornado";
        return saludo;
    }

    public static double constG(){
        return 9.8;
    }

    public static int entradaInt(){
        System.out.println("Ingrese un entero");
        return teclado.nextInt();

    }

    //con parametros y con return
    public static int entradaInt(int numMin, int numMax){
    int num;

    do{
        System.out.println("Ingrese un entero entre "+ numMin +" y "+ numMax);
        num=teclado.nextInt();

    }while(num<numMin || num>numMax);

    return num;





    }

}
