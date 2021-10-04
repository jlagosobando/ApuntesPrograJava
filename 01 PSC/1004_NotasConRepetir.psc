Proceso PromNotasRepetir
	// entrada : una cantidad de notas y las notas
	// Proceso : pedir cada una de las notas y calcular su promedio
	// salida : el promedio de las notas
	
	//declar. de variables
	Definir nota,promedio,sumNotas Como Real;
	Definir cantNotas Como Entero;
	sumNotas<-0;
	
	//Entrada
	Escribir "Ingrese la cantidad de notas a promediar";
	Leer cantNotas;
	
	Mientras cantNotas<2 Hacer
		Escribir "Ingrese una cantidad de notas util (2 o más)";
		Leer cantNotas;
	FinMientras

	//Proceso
	Para contador<-1 Hasta cantNotas hacer
		Escribir "Ingrese nota",contador;
		Leer nota;	
		
		Mientras nota<1 O nota>7 Hacer
			Escribir "Su nota no fue valida, reingrese nota",contador;
			Leer nota;	
		FinMientras
		//valor nuevo = ultimo valor conocido + algo nuevo
		sumNotas<-sumNotas+nota;
		
	FinPara

	promedio <- sumNotas/cantNotas;
	
	//Salida
	Escribir "Su promedio es ",promedio;
FinProceso
