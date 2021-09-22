Proceso ClasInstrum2
	// decla. variables
	Definir instrum Como Caracter;
	Definir cantCuerdas Como Entero;
	Definir tamanio Como Real;
	// entrada
	Escribir 'Ingrese cant de cuerdas del instrum.';
	Leer cantCuerdas;
	Escribir 'Ingrese el tamaño del instrumento en cms';
	Leer tamanio;
	// proceso
	// clas. bajo
	Si cantCuerdas=4 Y tamanio>100 Entonces
		instrum <- 'Su instrum. es un Bajo';
	SiNo
		// clas. violin
		Si cantCuerdas=4 Y tamanio<80 Entonces
			instrum <- 'Su instrum. es un Violin';
		SiNo
			// clas. guitarra
			Si cantCuerdas=6 O cantCuerdas=7 Entonces
				instrum <- 'Su instrum. es una Guitarra Electrica';
			SiNo
				// clas. arpa
				Si cantCuerdas>10 Entonces
					instrum <- 'Su instrum. es un Arpa';
				SiNo
					instrum <- 'No tenemos info para clasificar';
				FinSi
			FinSi
		FinSi
	FinSi
	// salida
	Escribir instrum;
FinProceso
