Proceso ClasInstrum2
	// si --- if
	// sino --- else
	// elif = else+if 
	
	// si (if) condicion entonces hacer Algoritmo 
	// sinosi (elif) condicion hacer otra cosa
	
	
	
	Definir cuerdas como entero;
	Definir tamano como real;
	
	Escribir "ingrese el num de cuerdas de su instrumento";
	leer cuerdas; 
	
	si cuerdas>10 Entonces
		Escribir "es un arpa";
	SiNo
		si cuerdas=6 o cuerdas=7 Entonces
			Escribir "es una guitarra";
		SiNo
			si cuerdas=4 Entonces
				Escribir "ingrese el tamaño de su instrumento en cms";
				leer tamano;
				
				si tamano>100 Entonces
					Escribir "es un bajo";
				SiNo
					si tamano<80 Entonces
						Escribir "es un violin";
					SiNo
						Escribir "no pude clasificar :C";
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
	
	
	


FinProceso
