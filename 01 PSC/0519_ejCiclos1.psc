Proceso ejCiclo1
	//calcular potencia dando base y exponente usando ciclo de multipli.
	//entrada
	Definir base,expo,r,cont Como Entero;
	
	Escribir "ingrese base";
	Leer base;
	Escribir "ingrese exponente";
	Leer expo;
	
	r<-base;
	cont<-1;
	
	//proceso
	
	Repetir
		r<-r*base;
		cont<-cont+1;
	Hasta Que cont=expo
	
	
	//salida
	Escribir base," elevado a ",expo, " da ",r;
	
	
FinProceso
