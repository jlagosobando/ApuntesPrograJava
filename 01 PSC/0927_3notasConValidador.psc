Proceso Prom3NotasValidador
	//declar. de variables
	Definir nota1,nota2,nota3,promedio Como Real;
	
	//Entrada
	
	Repetir
		Escribir "Ingrese nota1";
		Leer nota1;		
	Hasta Que 1<=nota1 Y nota1<=7;
	
	Repetir
		Escribir "Ingrese nota2";
		Leer nota2;		
	Hasta Que 1<=nota2 Y nota2<=7;
	
	Repetir
		Escribir "Ingrese nota3";
		Leer nota3;		
	Hasta Que 1<=nota3 Y nota3<=7;
	
	//Proceso
	promedio <- (nota1+nota2+nota3)/3;
	
	//Salida
	Escribir "Su promedio es ",promedio;
FinProceso
