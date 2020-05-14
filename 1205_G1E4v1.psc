Proceso CalcularEdad
	Definir diaActual Como Entero;
	Definir mesActual Como Entero;
	Definir anioActual Como Entero;
	Definir edad Como Entero;
	
	diaActual<-12;
	mesActual<-5;
	anioActual<-2020;
	
	Escribir "ingrese fecha nac en formato dd/mm/aaaa separados por enter";
	Leer dd;
	Leer mm;
	Leer aaaa;
	
	edad<-anioActual-aaaa;
	Si mm>mesActual entonces
		edad<-edad-1;
	Sino
		Si (mm=mesActual)&(dd>diaActual) Entonces
			edad<-edad-1;
		FinSi
	FinSi
	Escribir "Su edad ",edad;
FinProceso
