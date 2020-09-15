import java.util.Scanner;

public class Arreglos {
    
        public static void printArreglo(double[] arr)
            {int i;
                for(i=0;i<arr.length;i++){
                    System.out.print(arr[i]+" ");
            }
        }
        
        public static void printArreglo(int[] arr)
            {int i;
                for(i=0;i<arr.length;i++){
                    System.out.print(arr[i]+" ");
            }
        }
        
        public static void printArreglo(String[] arr)
            {int i;
                for(i=0;i<arr.length;i++){
                    System.out.print(arr[i]+" ");
            }
        }
    
        public static void main(String[] args){
            int i;
            double sumatoria=0, max, min;
            Scanner teclado = new Scanner(System.in);
            System.out.println("Uso de Arreglos");
            
            // i=               0    1    2    3 (n-1)
            double[] arreglo = {1.9, 7.6, 0.3, 10.5};
            
            printArreglo(arreglo);
            
            System.out.println();
            
            for(i=0;i<arreglo.length;i++){
                sumatoria=sumatoria+arreglo[i];
            }
            
            System.out.println("Sumatoria es: "+sumatoria);
            
             max=arreglo[0];
             min=arreglo[0];
            
            for (i = 1; i < arreglo.length; i++) {
                 if (arreglo[i] > max) 
                 {max = arreglo[i];}
                 
                 if (arreglo[i] < min) 
                 {min = arreglo[i];}
                }
                
            System.out.println("Valor Max: "+max+" min: "+min);    
            
            //tipo[] nombre = new tipo[largo]
            int[] arr2 = new int[5];
            
            for(i=0;i<arr2.length;i++){
                arr2[i]=teclado.nextInt();
            }
            
            printArreglo(arr2);
            
            
            
        }
    }
