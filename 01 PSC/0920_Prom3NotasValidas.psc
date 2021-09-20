Proceso Prom3NotasValidas
	//decla. de variables
	Definir sumNotasValidas, cantNotasValidas, nota1, nota2, nota3, promedio Como Real;

	//entrada
	sumNotasValidas<-0;
	cantNotasValidas<-0;
	
	Escribir "ingrese la nota 1";
	Leer nota1;
	
	Escribir "ingrese la nota 2";
	Leer nota2;	
	
	Escribir "ingrese la nota 3";
	Leer nota3;
	
	//proceso
	Si 1<=nota1 Y nota1<=7 Entonces
		sumNotasValidas<-sumNotasValidas+nota1;
		cantNotasValidas<-cantNotasValidas+1;
	FinSi
	
	Si 1<=nota2 Y nota2<=7 Entonces
		sumNotasValidas<-sumNotasValidas+nota2;
		cantNotasValidas<-cantNotasValidas+1;
	FinSi	
	
	Si 1<=nota3 Y nota3<=7 Entonces
		sumNotasValidas<-sumNotasValidas+nota3;
		cantNotasValidas<-cantNotasValidas+1;
	FinSi	
	
	
	//salida
	Si cantNotasValidas=0 Entonces
		Escribir "Ninguna nota es valida";
	SiNo
		promedio<-sumNotasValidas/cantNotasValidas;
		Escribir "Su promedio de notas validas es ",promedio;
	FinSi

	
	
FinProceso
