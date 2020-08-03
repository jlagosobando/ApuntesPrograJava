Proceso TradFechasV2
	// dada fecha en formato dd/mm/aaaa la escriba como dd de mes del aaaa
	//entrada
	definir fecha, d, m, a como caracter;
	Definir dia, mes, anio como entero;
	definir mesTxt Como Caracter;
	definir seguir, bisiesto Como Logico;
	
	Repetir
		
	seguir<-Verdadero;
	bisiesto<-falso;
		
		
	Escribir "ingrese fecha en formato dd/mm/aaaa";   //    18/05/2020
	Leer fecha;
		
	//proceso
	d<-Subcadena(fecha,0,1);
	m<-Subcadena(fecha,3,4);
	a<-Subcadena(fecha,6,9);
		
	dia<-ConvertirANumero(d);
	mes<-ConvertirANumero(m);
	anio<-ConvertirANumero(a);
	
	si mes<1 | mes>12 Entonces
		seguir<-Falso;
	FinSi
	
	si (anio%4)=0 Entonces
		bisiesto<-Verdadero;
	FinSi
	
	Segun mes hacer
		1:
			mesTxt<-"Enero";
			si dia<1|dia>31 Entonces
				seguir<-falso;
			FinSi
		2:
			mesTxt<-"Febrero";
			si bisiesto Entonces
				si dia<1|dia>29 Entonces
					seguir<-falso;
				FinSi
			SiNo
				si dia<1|dia>28 Entonces
					seguir<-falso;
				FinSi
			FinSi
		3:
			mesTxt<-"Marzo";
			si dia<1|dia>31 Entonces
				seguir<-falso;
			FinSi
		4:
			mesTxt<-"Abril";
			si dia<1|dia>30 Entonces
				seguir<-falso;
			FinSi
		5:
			mesTxt<-"Mayo";
			si dia<1|dia>31 Entonces
				seguir<-falso;
			FinSi
		6:
			mesTxt<-"Junio";
			si dia<1|dia>30 Entonces
				seguir<-falso;
			FinSi
		7:
			mesTxt<-"Julio";
			si dia<1|dia>31 Entonces
				seguir<-falso;
			FinSi
		8:
			mesTxt<-"Agosto";
			si dia<1|dia>31 Entonces
				seguir<-falso;
			FinSi
		9:
			mesTxt<-"Septiembre";
			si dia<1|dia>30 Entonces
				seguir<-falso;
			FinSi
		10:
			mesTxt<-"Octubre";
			si dia<1|dia>31 Entonces
				seguir<-falso;
			FinSi
		11:
			mesTxt<-"Noviembre";
			si dia<1|dia>30 Entonces
				seguir<-falso;
			FinSi
		12:
			mesTxt<-"Diciembre";
			si dia<1|dia>31 Entonces
				seguir<-falso;
			FinSi
	FinSegun
    Hasta Que seguir=Verdadero
	//salida
	Escribir "Fecha :",d," de ",mesTxt," de ",a;
	
FinProceso
