Proceso TradFechasV1
	// dada fecha en formato dd/mm/aaaa la escriba como dd de mes del aaaa
	//entrada
	definir fecha como caracter;
	definir d Como Caracter;
	Definir m Como Caracter;
	Definir a Como Caracter;
	Definir mes Como Entero;
	definir mesTxt Como Caracter;
	
	Repetir
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
		4:
			mesTxt<-"Abril";
		5:
			mesTxt<-"Mayo";
		6:
			mesTxt<-"Junio";
		7:
			mesTxt<-"Julio";
		8:
			mesTxt<-"Agosto";
		9:
			mesTxt<-"Septiembre";
		10:
			mesTxt<-"Octubre";
		11:
			mesTxt<-"Noviembre";
		12:
			mesTxt<-"Diciembre";
	FinSegun
    Hasta Que mes>0 & mes<13
	//salida
	Escribir "Fecha :",d," de ",mesTxt," de ",a;
	
FinProceso
