Proceso CalcDvV1
		// calcular dv y entregarlo al usuario
		//entrada cadena de rut sin el dv
		//proceso "algoritmo del mod11"
		//salida el dv calculado
	
	
	//entrada
	Definir run ,d, f, sum Como entero;
	definir DV Como Caracter;
	DV<-"Error! Algo raro pasó"; //dv por defecto, solo pasará si el proceso queda malo
	f<-2; //Valor inicial del factor
	sum<-0; //valor inicial de la sumatoria
	
	Escribir "ingrese su cadena de run";
	Leer run;
	
	
	//proceso
	repetir	
		d<-run%10; //extraigo el ultimo digito con mod
		run<-trunc(run/10); //acorto mi run eliminando el ultimo digito
		
		d<-d*f; //mult digito*factor
		sum<-sum+d; //agrego la mult a la sumatoria
	
		f<-f+1; //aumento factor en 1
		si f>7 Entonces
			f<-2;//si factor se pasa de 7  lo corrijo 
		FinSi
		
		
		
		
	Hasta Que run=0 //repetir hasta run=0 ... repetir hasta que saqué tantos digitos que no me quedan más
	
	sum<-sum%11;
	
	sum<-11-sum;
	
	segun sum hacer   //preferí hacerlo con segun, uds podrían hacerlo con Si-Sino anidados sin problema
		0,1,2,3,4,5,6,7,8,9:
			DV<-ConvertirATexto(sum);
		10:
			DV<-"K";
		11:
			DV<-ConvertirATexto(0);
		
	FinSegun
	
	//salida
	Escribir "Su DV es: ",DV; //entrega respuesta al usuario
	
FinProceso
