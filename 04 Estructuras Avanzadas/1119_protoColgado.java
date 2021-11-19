// prototipo hiper basico del colgado

import java.util.Scanner;

public class protoColgado {
    public static void main(String[] args) {

        //dec. de var.
        char[] letras = {'U','F','R','O'};
        char letra;
        int vidas,i;
        Scanner teclado = new Scanner(System.in);

        //for para los turnos
        for(vidas=5;vidas>0;vidas--){
            System.out.println("ingrese la letra a buscar");
            letra=teclado.next().charAt(0);

            //recorre el arreglo
            for(i=0;i<letras.length;i++){

                if(letras[i]==letra){
                    System.out.println("La letra está en la casilla "+i);

                }
            }//finForArreglo
        }//finCicloTurnos
    }//finMain
}//finClass
