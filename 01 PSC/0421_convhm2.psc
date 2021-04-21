Proceso EP12
	//entrada: opcion a elegir, valor unidad de origen
	//proceso: elegir una opción, ingresar cant de unidad de origen, convertir, entregar conversión
	//salida: valor conversion
	
	Definir h,m2 Como Real;
	Definir opcion Como Entero;
	
	Repetir
		Escribir "que conversión quiere?";
		Escribir "[1] para h a m2";
		Escribir "[2] para m2 a h";
		Leer opcion;
	Hasta Que opcion=1 o opcion=2
	
	Si opcion=1 Entonces
		Repetir
			Escribir "Ingrese sus h";
			Leer h;
		Hasta Que h>=0
		
		m2<-h*10000;
		Escribir h,"Hectáreas equivalen a ",m2," mts cuadrados";
		
	Sino
		Repetir
			Escribir "Ingrese sus m2";
			Leer m2;
		Hasta Que m2>=0
		
		h<-m2*0.0001;
		Escribir m2,"mts cuadradosequivalen a ",h," Hectáreas";
	FinSi
	
FinProceso
