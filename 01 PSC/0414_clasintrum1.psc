Proceso ClasInstrum1
	// Tendremos 4 instrumentos de cuerda
	// cuando el instr. tiene 4 cuerdas y mide más de 100cms, es un bajo
	// cuando el instr. tiene 6 cuerdas o 7 es guitarra electrica
	// cuando el instr. tiene 4 cuerdas y mide menos de  80cm, es un violin
	// cuando un instr. tiene más de 10 cuerdas, es un arpa
	// entradas cant de cuerdas, tamaño en cms
	// Proceso clasificar por num de cuerdas, si no es suf. clas por tamaño
	// salida el nombre del instrumento
	Definir cuerdas como entero;
	Definir tamano como real;
	
	Escribir "ingrese el num de cuerdas de su instrumento";
	leer cuerdas; 
	
	Escribir "ingrese el tamaño de su instrumento en cms";
	leer tamano; 	
	
	si cuerdas>10 Entonces
		Escribir "es un arpa";
	FinSi
	
	si cuerdas=6 o cuerdas=7 Entonces
		Escribir "es una guitarra";
	FinSi
	
	si cuerdas=4 Entonces
		si tamano>100 Entonces
			Escribir "es un bajo";
		FinSi
		
		si tamano<80 Entonces
			Escribir "es un violin";
		FinSi
	FinSi
	
FinProceso
