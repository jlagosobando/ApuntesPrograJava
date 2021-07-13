import java.util.Scanner;


public class Matrices
{
    public static void main(String[] args){
        
        int i, j;
        Scanner teclado = new Scanner(System.in);
        
                           //j=  0       1       2
        String[][] matriz1 = {{"hola", "esto", "es"}, //i=0
                              {"una", "forma", "de", "matriz"}}; //i=1
                                //0       1      2      3
                              
        //System.out.println(matriz1[1][3]);   
        
        for(i=0; i<matriz1.length;i++){
            for(j=0; j<matriz1[i].length;j++){
            
                System.out.print(matriz1[i][j]  + " " );   
            
            }
            System.out.print("\n");
        }        
                              
            
         //tipo[][] nombre  = new tipo[filas][col]
         int[][] cuadMagico = new int[3][3];
         
        for(i=0; i<cuadMagico.length;i++){
            for(j=0; j<cuadMagico[i].length;j++){
                //celda=valor
                System.out.println("Casilla[" + i + "][" + j + "]");
                cuadMagico[i][j]=teclado.nextInt();
           }
        }  
         
        for(i=0; i<cuadMagico.length;i++){
            for(j=0; j<cuadMagico[i].length;j++){
            
                System.out.print(cuadMagico[i][j]  + " " );   
            
            }
            System.out.print("\n");
        }     
         
        //8 cond de evaluación
        boolean fila0,fila1,fila2,col0,col1,col2,diag1,diag2;
        fila0= cuadMagico[0][0] + cuadMagico[0][1] + cuadMagico[0][2] == 15;
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
