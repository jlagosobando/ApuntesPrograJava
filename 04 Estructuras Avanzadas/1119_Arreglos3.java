// entrada: pedir el tamaño del arreglo, pedir los datos necesarios pa llenarlo, un numero a buscar
// proceso: buscar el numero dentro del arreglo
// salida: detectar si el num indicado está o no en el arreglo

import java.util.Scanner;

public class Arreglos3 {
    public static void main(String[] args) {

        //dec. de var.
        int largo,i, numBuscado;
        boolean numValido, largoValido;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el largo del arreglo");

        do {
            try{
            largo = teclado.nextInt();
            largoValido=true;
            }
            catch(Exception e){
            largo=-1;
            largoValido=false;
            System.out.println("el valor de largo no es util");
            teclado.next();
            }

        }while(!largoValido || largo<1);
        //largoValido==false

        int[] numeros = new int[largo];

        System.out.println("llenamos arreglo");
        for(i=0;i<numeros.length;i++){
            System.out.println("ingrese un numero");

            do {
                try{
                    numeros[i] = teclado.nextInt();
                    numValido=true;}
                catch(Exception e){
                    System.out.println("no es valido el valor");
                    teclado.next();
                    numValido=false;
                }

            }while(!numValido);

        }//finFordeIngresos


        System.out.println("ingrese el numero a buscar");
        do {
            try{
                numBuscado = teclado.nextInt();
                numValido=true;}
            catch(Exception e){
                System.out.println("no es valido el valor");
                teclado.next();
                numValido=false;
                numBuscado=-1;
            }
        }while(!numValido);

        //recorrer el arreglo buscando numBuscado
        for(i=0;i<numeros.length;i++){
            System.out.println("estamos en la vuelta "+i);

            if(numeros[i]==numBuscado){
                System.out.println("Encontramos su numero");
                break;
            }
        }


    }//finMain
}//finClass
