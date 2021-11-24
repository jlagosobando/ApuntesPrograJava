import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i,j;

        // interpretamos la matriz como un arreglo de arreglos { elemento0, elemento1 } donde elementos son arreglos
        // tipo[][] nombre = {{datos, fila, uno},{datos, fila, dos}}
                            //j=  0       1       2
        String[][] matriz1 = {{"hola", "esto", "es"}, //i=0
                              {"una", "forma", "de", "matriz"}};  //i=1
                                 //0       1      2      3
        //System.out.println(matriz1[0][3]);
        //System.out.println(matriz1);

        //recorremos filas
        for(i=0;i<matriz1.length;i++){
            for(j=0;j<matriz1[i].length;j++){

                System.out.print(matriz1[i][j]  + " " );

            }//fin for col
            //System.out.println("");
            System.out.print("\n"); //salto de linea entre filas
        }//fin for filas

        System.out.println("________________________________________");
        //entrada: crear matriz de 3x3 y rellenar con enteros entre 1 y 9
        //proceso: rellenar matriz y verificar si es magico o no
        //salida: clasificación de magico o no magico

        //tipo[][] nombre = new tipo[filas][col]
        int[][] cuadMagico = new int[3][3];


        for(i=0;i<cuadMagico.length;i++){
            for(j=0;j<cuadMagico[i].length;j++){
                System.out.println("ingrese valor para la casilla ["+i+"]["+j+"]");
                //celda=valor
                //implementen validador y manejo de excep. y que no se repiten
                cuadMagico[i][j] = teclado.nextInt();

            }
        }

         for(i=0;i<cuadMagico.length;i++){
            for(j=0;j<cuadMagico[i].length;j++){
                System.out.print(cuadMagico[i][j]  + " " );
            }
            System.out.print("\n");
        }

         //comprobaciones
         // de manera excepcional vamos a declarar acá
        boolean fila0,fila1,fila2,col0,col1,col2,diag1,diag2;
        //var=valor ...  var=valor boolean ... valor boolean se obtiene de una comparacion
        fila0 = cuadMagico[0][0] + cuadMagico[0][1] + cuadMagico[0][2] == 15;
        fila1= cuadMagico[1][0] + cuadMagico[1][1] + cuadMagico[1][2] == 15;
        fila2= cuadMagico[2][0] + cuadMagico[2][1] + cuadMagico[2][2] == 15;

        col0 = cuadMagico[0][0] + cuadMagico[1][0] + cuadMagico[2][0] == 15;
        col1 = cuadMagico[0][1] + cuadMagico[1][1] + cuadMagico[2][1] == 15;
        col2 = cuadMagico[0][2] + cuadMagico[1][2] + cuadMagico[2][2] == 15;

        diag1 = cuadMagico[0][0] + cuadMagico[1][1] + cuadMagico[2][2] == 15;
        diag2 = cuadMagico[0][2] + cuadMagico[1][1] + cuadMagico[2][0] == 15;

        if(fila0 && fila1 && fila2 && col0 && col1 && col2 && diag1 && diag2){
            System.out.print("Es magico");
        } else{
            System.out.print("No es magico");
        }



    }
}
