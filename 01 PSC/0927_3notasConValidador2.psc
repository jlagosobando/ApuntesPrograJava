Proceso Prom3NotasValidador
	//declar. de variables
	Definir nota1,nota2,nota3,promedio Como Real;
	
	//Entrada
	Escribir "Ingrese nota1";
	Leer nota1;	
	
	Mientras nota1<1 O nota1>7 Hacer
		Escribir "Su nota no fue valida, reingrese nota1";
		Leer nota1;	
	FinMientras
	
	Escribir "Ingrese nota2";
	Leer nota2;		
		
	Mientras nota2<1 O nota2>7 Hacer
		Escribir "Su nota no fue valida, reingrese  nota2";
		Leer nota2;		
	FinMientras
	
	Escribir "Ingrese nota3";
	Leer nota3;		
	
	Mientras nota3<1 O nota3>7 Hacer
		Escribir "Su nota no fue valida, reingrese  nota3";
		Leer nota3;		
	FinMientras
	
	//Proceso
	promedio <- (nota1+nota2+nota3)/3;
	
	//Salida
	Escribir "Su promedio es ",promedio;
FinProceso
