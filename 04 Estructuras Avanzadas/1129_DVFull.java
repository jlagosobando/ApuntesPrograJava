import java.util.Scanner;
//87.912.900-1
public class DVFull
{
  public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);    
        
        //dec. de var.
	int f=2,suma=0,rut,digito,m,mod,cand;
	String DV;

	//entrada
	do{
		System.out.println("Ingrese su cadena de rut");
		rut=teclado.nextInt();
        }while(rut<1000000 || rut>100000000);

        
        
        while(rut>0){
        	digito=rut%10;
		rut=rut/10;
		m=digito*f;
		suma=suma+m;
		f++;

		if(f>7){f=2;}
			
        }    
        
	mod=suma%11;
	cand=11-mod;

	
	if(cand<10)
        	{DV=String.valueOf(cand);}
        else    if(cand==10)
                    {DV="K";}
        	else
                    {DV="0";}
	    
 
        System.out.println("Su DV es "+DV);
	

        
    }//finMain  
}//finclase

