Proceso Saludar
	// integrantes:
	// genere un psc que para una hora dada en formato hh:mm en 24hrs, diga buenos dias/tardes/noches
	// sg buenos dias > 6:00 11:59    tardes> 12:00  18:30 noches> 18:31 5:59
	// si se da una hora fuera del rango dene indicar el error 00:00 23:59  
	
	//entradas
	
	definir horaIng,hh,mm, mensaje como caracter;
	definir h,m Como Entero;
		
	
	Escribir  "Ingrese una hora en formato hh:mm";
	
	Leer horaIng;
	
	hh<-Subcadena(horaIng,0,1);
	mm<-Subcadena(horaIng,3,4);
	
	h<-ConvertirANumero(hh);
	m<-ConvertirANumero(mm);
	
	//proceso
	
	si h>=24|h<0|m<0|m>=60 Entonces
		mensaje<-"Hora no válida";
		
		
	SiNo		
		si h>=6 & h<=11	Entonces
			mensaje<-"Buenos días";
			
		SiNo
			si h>=12 & h<18 Entonces
				mensaje<-"buenas tardes";
			SiNo
				si h=18 & m>=0 & m<=30 Entonces
					mensaje<-"buenas tardes";
				SiNo
					mensaje<-"buenas noches";
				FinSi
			FinSi
			
		FinSi
		
	FinSi
		
	//salida
	Escribir mensaje;

FinProceso
