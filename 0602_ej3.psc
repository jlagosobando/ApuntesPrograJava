Proceso SerieSumaV1
	//entrada: n�mero que determina cuandos elementos de serie se generar�n
	//proceso: generar elementos de la serie e ir sumandolos
	//salida: n�meros de la serie y suma final
	
	
	Escribir "Generador de Serie y Sumatoria";
	
	
	Definir lim, nume, deno ,n Como Entero; //nume y deno forman las fracciones
	Definir s como real;
	s<-0;
		
	Repetir //me aseguro que no sea negativo
		Escribir "ingrese cuantos elementos quiere generar para sumar";
		Leer lim;
	Hasta Que lim>=0
	
	//si tengo que generar elementos hago esto, sino voy directo a la salida
	si lim>0 Entonces
		Para n<-0 hasta lim-1 Hacer
			nume<-2+n; //genero numerador
			deno<-2^n; //genero denominador
			Escribir nume,"/",deno; //muestro la fracci�n
			s<-s+(nume/deno); //a�ado a la sumatoria
		FinPara
	FinSi
	
	//salida
	Escribir "su sumatoria S es: ",s;
		
FinProceso
