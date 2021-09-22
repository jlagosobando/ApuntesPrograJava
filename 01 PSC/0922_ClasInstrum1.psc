Proceso ClasInstrum
	//decla. variables
	Definir instrum Como Caracter;
	Definir cantCuerdas Como Entero;
	Definir tamanio Como Real;
	
	//entrada
	instrum<-"No tenemos info para clasificar";
	
	Escribir "Ingrese cant de cuerdas del instrum.";
	Leer cantCuerdas;
	
	Escribir "Ingrese el tamaño del instrumento en cms";
	Leer tamanio;
	
	//proceso
	//clas. bajo
	Si cantCuerdas=4 Y tamanio>100 Entonces
		instrum<-"Su instrum. es un Bajo";
	FinSi
	
	//clas. guitarra
	Si cantCuerdas=6 O cantCuerdas=7  Entonces
		instrum<-"Su instrum. es una Guitarra Electrica";
	FinSi	
	
	//clas. violin
	Si cantCuerdas=4 Y tamanio<80 Entonces
		instrum<-"Su instrum. es un Violin";
	FinSi
	
	//clas. arpa
	Si cantCuerdas>10 Entonces
		instrum<-"Su instrum. es un Arpa";
	FinSi
	
	//salida
	Escribir instrum;
FinProceso
