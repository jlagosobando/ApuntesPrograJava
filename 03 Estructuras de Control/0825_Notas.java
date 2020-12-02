//entrada: notas
//proceso: ponderar promedios, evaluar estados segun nota
//salida: estado
import java.util.Scanner;

public class Notas{
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        
        double t1=0,t2=0,p1=0,p2=0,p3=0,promP,promT,promA,notaAc=0,notaP;
        
        while(t1<1 || t1>7)
        {   System.out.println("Ingrese nota t1");
            t1=teclado.nextDouble();
        }
        
        while(t2<1 || t2>7){
            System.out.println("Ingrese nota t2");
            t2=teclado.nextDouble();
        }
        
        while(p1<1 || p1>7){
            System.out.println("Ingrese nota p1");
            p1=teclado.nextDouble();
        }
        
        while(p2<1 || p2>7){
            System.out.println("Ingrese nota p2");
            p2=teclado.nextDouble();
        }
        
        while(p3<1 || p3>7){
            System.out.println("Ingrese nota p3");
            p3=teclado.nextDouble();
        }
        
        promT=(t1+t2)/2;
        promP=(p1*0.2+p2*0.2+p3*0.6);
        promA=(promT*0.3+promP*0.7);
        
        System.out.println("Promedio Teórico: "+promT+"\nPromedio Práctico: "+promP+"\nPromedio Actividades: "+promA);
        
        if(promA>=4){
            while(notaAc<1 || notaAc>7){
                System.out.println("Ingrese nota actitudinal");
                notaAc=teclado.nextDouble();
            }
            notaP=promA*0.8+notaAc*0.2;
        
        }
        else
            {notaP=promA;}
        
        System.out.println("Nota Presentación a Examen: "+notaP);
        
        if(notaP>=4){
            System.out.println("Estado: Eximido y Aprobado");      
        }
        else
            {if(notaP<3){
                 System.out.println("Estado: Eximido y Reprobado"); }
             else
                {System.out.println("Estado: Examen");}
             }
        
    }
}
