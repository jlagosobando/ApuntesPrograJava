Proceso CalcV2
	//resumen menú 4 opciones, operar 2 numeros según opción
	
	//entrada
	Definir opcion como entero;
	definir a,b,r como real;
	
	Escribir "Ingrese que operación realizará";
	Escribir "(1) suma";
	Escribir "(2) resta";
	Escribir "(3) multiplicación";
	Escribir "(4) división";
	Leer opcion;
		
	//proceso
	Si opcion>0 & opcion<5 Entonces
		Escribir "Ingrese 2 números a operar";
		Leer a,b;
		
		Segun opcion Hacer
			1:
				r<-a+b;
				
				Escribir "Suma es ",r;
			2:
				r<-a-b;
				
				Escribir "Resta es ",r;
			3:
				r<-a*b;
				
				Escribir "Producto es ",r;
			4:
				r<-a/b;
				
				Escribir "División es ",r;
				
		FinSegun
				
	SiNo
		Escribir "Opción no válida";	
		
	FinSi
	//salida
    //Escribir "Su resultado es ",r;
FinProceso
