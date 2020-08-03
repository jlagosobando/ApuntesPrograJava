Proceso CalcularEdad2

	Definir diaActual Como Entero;

	Definir mesActual Como Entero;

	Definir anioActual Como Entero;

	Definir edad Como Entero;

	Definir fechaNac Como Caracter;

	

	diaActual<-12;

	mesActual<-5;

	anioActual<-2020;

	

	Escribir "ingrese fecha nac en formato dd/mm/aaaa"; //20/08/1990

	Leer fechaNac;

	

	d<-subcadena(fechaNac,0,1); //02

	m<-subcadena(fechaNac,3,4); //08

    a<-subcadena(fechaNac,6,9); //1990

	

	dd<-ConvertirANumero(d);

	mm<-ConvertirANumero(m);

	aaaa<-ConvertirANumero(a);

	

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

