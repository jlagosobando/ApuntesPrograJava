Proceso EP11
	//entrada: para cada uno de los platos, la cantidad de platos que quiere de ese tipo
	//proceso: recepción de cantidad de platos, validación, calculo de precio
	//salida: costo del pedido
	
	Definir cantEntrada, cantPrincipal, cantPostre, precioEntrada, precioPrincipal, precioPostre, total Como Entero;
	Definir valido Como Logico;
	
	precioEntrada<-2000;
	precioPrincipal<-3000;
	precioPostre<-1000;
	
	
	Repetir
		Escribir "ingrese cuantas entradas quiere";
		Leer cantEntrada;
	Hasta Que cantEntrada>=0
	
	
	Repetir
		Escribir "ingrese cuantos platos principales quiere";
		Leer cantPrincipal;
	Hasta Que cantPrincipal>=0
	
	
	Repetir
		Escribir "ingrese cuantos postres quiere";
		Leer cantPostre;
	Hasta Que cantPostre>=0
	
	total<-(cantEntrada*precioEntrada)+(cantPrincipal*precioPrincipal)+(cantPostre*precioPostre);
	
	Escribir "El pedido vale ",total;
FinProceso
