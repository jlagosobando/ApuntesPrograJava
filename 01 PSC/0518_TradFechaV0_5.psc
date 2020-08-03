Proceso TradFechas
	// dada fecha en formato dd/mm/aaaa la escriba como dd de mes del aaaa
	//entrada
	definir fecha como caracter;
	definir d Como Caracter;
	Definir m Como Caracter;
	Definir a Como Caracter;
	Definir mes Como Entero;
	definir mesTxt Como Caracter;
	
	Escribir "ingrese fecha en formato dd/mm/aaaa";   //    18/05/2020
	Leer fecha;
	
	
	//proceso
	d<-Subcadena(fecha,0,1);
	m<-Subcadena(fecha,3,4);
	a<-Subcadena(fecha,6,9);
	
	mes<-ConvertirANumero(m);
	
	
	Segun mes hacer
		1:
			mesTxt<-"Enero";
		2:
			mesTxt<-"Febrero";
		3:
			mesTxt<-"Marzo";	
	FinSegun
	
	//salida
	Escribir "Fecha :",d," de ",mesTxt," del ",a;
	
FinProceso
