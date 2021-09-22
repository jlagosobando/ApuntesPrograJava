Proceso ClasInstrum3
	// decla. variables
	Definir instrum Como Caracter;
	Definir cantCuerdas Como Entero;
	Definir tamanio Como Real;
	// entrada
	Escribir 'Ingrese cant de cuerdas del instrum.';
	Leer cantCuerdas;
	// proceso
	// clas. arpa
	Si cantCuerdas>10 Entonces
		instrum <- 'Su instrum. es un Arpa';
	SiNo
		// clas. guitarra
		Si cantCuerdas=6 O cantCuerdas=7 Entonces
			instrum <- 'Su instrum. es una Guitarra Electrica';
		SiNo
			// ahora que nos sirve, pedimos el tamaño
			Escribir 'Ingrese el tamaño del instrumento en cms';
			Leer tamanio;
			// clas. bajo
			Si cantCuerdas=4 Y tamanio>100 Entonces
				instrum <- 'Su instrum. es un Bajo';
			SiNo
				// clas. violin
				Si cantCuerdas=4 Y tamanio<80 Entonces
					instrum <- 'Su instrum. es un Violin';
				SiNo
					instrum <- 'No tenemos info para clasificar';
				FinSi
			FinSi
		FinSi
	FinSi
	// salida
	Escribir instrum;
FinProceso
