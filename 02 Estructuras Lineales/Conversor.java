import java.util.Scanner;

public class Conversor {
	public static void main(String[] args) {
	//dec. de var.
	int SegI, Min, SegF;    
	Scanner teclado = new Scanner(System.in); 
	
	//entrada
	System.out.println("Introduce la cantidad de segundos que deseas transformar en minutos");
	SegI = teclado.nextInt();    
	
	//proceso
	Min = SegI/60;
	SegF = SegI%60;
	
	//salida
	System.out.println("Los "+ SegI+ " segundos, equivalen a "+ Min+ " minutos y "+ SegF+ " segundos");
	    
	   }
	   
}
	    
	    
// variable = valor (fijo, calculo, ingreso teclado)
// 7/2=3
// módulo   %     7%2=1	    
// inicio y fin = "class" y "void main" y { }
 // Escriba = System.out.println
 // Lea = teclado.nextAlgo() y Scanner teclado = new Scanner(System.in); y import java.util.Scanner;
 // siempre al cerrar instrucción ; ... PUNTO Y COMA!!