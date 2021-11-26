//entrada: crear matriz de 3x3 y rellenar con enteros entre 1 y 9
//proceso: rellenar matriz y verificar si es magico o no
//salida: clasificación de magico o no magico

import java.util.Scanner;

public class Cuadrado_Magico {
    public static void main(String[] args) {
        int i,j,k,num, u=0;
        boolean valido, usado;
        Scanner teclado = new Scanner(System.in);

        int[][] cuadradoMagico = new int[3][3];
        int[] numerosUsados = new int[9];

        for(i=0; i<cuadradoMagico.length; i++ ){
            for(j=0; j<cuadradoMagico[i].length;j++){
                do{
                    usado=false;
                    try{
                        System.out.println("Casilla[" + i + "][" + j + "]");
                        num = teclado.nextInt();
                        valido = true;

                                for(k=0;k<numerosUsados.length;k++){
                                    if(num==numerosUsados[k]){
                                        usado=true;
                                    }
                                }
                    }
                    catch(Exception e){
                        System.out.println("ingresó algo incorrecto, por favor HAGALO BIEN");
                        valido = false;
                        usado = true;
                        teclado.next();
                        num=-1;
                    }
                }while(num<1 || num>9 || !valido || usado);

                cuadradoMagico[i][j]=num;
                numerosUsados[u]=num;
                u++;
            } //fin for anidados
        } //para recorrer cuadradomag

        for(i=0;i<cuadradoMagico.length;i++){
            for(j=0;j<cuadradoMagico[i].length;j++){
                System.out.print(cuadradoMagico[i][j]  + " " );
            }
            System.out.print("\n");
        }

        //comprobaciones
        // de manera excepcional vamos a declarar acá
        boolean fila0,fila1,fila2,col0,col1,col2,diag1,diag2;
        //var=valor ...  var=valor boolean ... valor boolean se obtiene de una comparacion
        fila0 = cuadradoMagico[0][0] + cuadradoMagico[0][1] + cuadradoMagico[0][2] == 15;
        fila1= cuadradoMagico[1][0] + cuadradoMagico[1][1] + cuadradoMagico[1][2] == 15;
        fila2= cuadradoMagico[2][0] + cuadradoMagico[2][1] + cuadradoMagico[2][2] == 15;

        col0 = cuadradoMagico[0][0] + cuadradoMagico[1][0] + cuadradoMagico[2][0] == 15;
        col1 = cuadradoMagico[0][1] + cuadradoMagico[1][1] + cuadradoMagico[2][1] == 15;
        col2 = cuadradoMagico[0][2] + cuadradoMagico[1][2] + cuadradoMagico[2][2] == 15;

        diag1 = cuadradoMagico[0][0] + cuadradoMagico[1][1] + cuadradoMagico[2][2] == 15;
        diag2 = cuadradoMagico[0][2] + cuadradoMagico[1][1] + cuadradoMagico[2][0] == 15;

        if(fila0 && fila1 && fila2 && col0 && col1 && col2 && diag1 && diag2){
            System.out.print("Es magico");
        } else{
            System.out.print("No es magico");
        }

    }
}
