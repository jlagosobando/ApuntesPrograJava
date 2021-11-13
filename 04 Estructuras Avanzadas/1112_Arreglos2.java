// entrada: pedir el tamaño del arreglo, pedir los datos necesarios pa llenarlo
// proceso: buscar el valor min y max de los numeros ingresado
// salida: entregar el min y max detectados

import java.util.Scanner;

public class Arreglos2 {
    public static void main(String[] args) {

        //dec. de var.
        int largo, min, max,i;
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



        max = numeros[0];
        min = numeros[0];

        for (i = 1; i < numeros.length; i++) {
            //System.out.println("Se compara "+arreglo[i]+" con "+max);
            if (numeros[i] > max) {
                max = numeros[i];
            }
            //System.out.println("maximo pasa a valer "+max);
            if (numeros[i] < min) {
                min = numeros[i];
            }
        }

        System.out.println("Max detectado : " + max);
        System.out.println("Min detectado : " + min);


    }//finMain
}//finClass
