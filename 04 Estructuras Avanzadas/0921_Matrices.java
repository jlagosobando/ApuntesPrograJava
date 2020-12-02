import java.util.Scanner;
import java.lang.*;

public class Matrices
{
   public static void printMatrix(String[][] matrix) {
        int i, j;
        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
    
   public static void printMatrix(int[][] matrix) {
        int i, j;
        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
    
    public static void main(String[] args){
    int i,j;
    Scanner teclado = new Scanner(System.in);
         
    //                                    i=0                        i=1 
    //                          j=0      j=1   j=2       j=0    j=1   j=2    j=3    
    String[][] matriz1 =   {   {"hola","esto","es"}  ,  {"una","forma","de","matriz"}    };
    printMatrix(matriz1);
        
    String[][] matriz2 = new  String[3][4];  
       
    for (i = 0; i < matriz2.length; i++) {
            for (j = 0; j < matriz2[i].length; j++) {
                System.out.println("Casilla["+i+"]["+j+"]");
                matriz2[i][j]=teclado.next();
            }
            
        }    
        
     printMatrix(matriz2);    
     System.out.println(matriz1[0][2]);
     System.out.print(Integer.parseInt(matriz2[0][0])+Integer.parseInt(matriz2[0][1]));
         
     int[][] matriz3 = new int[5][3]; 
     printMatrix(matriz3); 
     
     for(i=0;i<matriz3.length;i++){
        System.out.println("Llenar valor num1.");
        matriz3[i][0]=teclado.nextInt();
        System.out.println("Llenar valor num2.");
        matriz3[i][1]=teclado.nextInt();
        
        matriz3[i][2]=matriz3[i][0]+matriz3[i][1];
        }
     printMatrix(matriz3); 
        
    }
}
