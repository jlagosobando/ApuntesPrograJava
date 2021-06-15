
public class ConstArreglos
{
    public static void main(String[] args){

        System.out.println("Uso de Arreglos");
        //tipo[] nombre = {datos, datos,..} 
        double[] arreglo = {1.9, 7.6, 5.3, 10.5};
                           // 0    1    2     3    4
                           
        System.out.println(arreglo[0]);
        
        try{
            System.out.println(arreglo[4]);}
        catch(Exception e){
            System.out.println("Casilla fuera de rango");}

            
            
            
        //tipo[] nombre = new tipo[largo]    
        double[] arreglo2 = new double[8]; 
       
        

    }
}
