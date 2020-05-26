Proceso CalcDvV0
	// nota: versión de prueba, no considere su resultado como válido
	// calcular dv y entregarlo al usuario
	//entrada cadena de rut sin el dv
	//proceso "algoritmo del mod11"
	//salida el dv calculado
	
	
	//entrada
	definir d Como Entero;
	definir dv,run, dig Como Caracter;
	
	
	Escribir "ingrese su cadena de run";
	Leer run;
	
	
	//proceso
	
	dig8<-subcadena(run,7,7);
	d8<-ConvertirANumero(dig8);
	d8<-d8*2;
	
	dig7<-subcadena(run,6,6);
	d7<-ConvertirANumero(dig7);
	d7<-d7*3;
	
	dig6<-subcadena(run,5,5);
	d6<-ConvertirANumero(dig6);
	d6<-d6*4;
	
	dig5<-subcadena(run,4,4);
	d5<-ConvertirANumero(dig5);
	d5<-d5*5;
	
	dig4<-subcadena(run,3,3);
	d4<-ConvertirANumero(dig4);
	d4<-d4*6;
	
	dig3<-subcadena(run,2,2);
	d3<-ConvertirANumero(dig3);
	d3<-d3*7;
	
	dig2<-subcadena(run,1,1);
	d2<-ConvertirANumero(dig2);
	d2<-d2*2;
	
	dig1<-subcadena(run,0,0);
	d1<-ConvertirANumero(dig1);
	d1<-d1*3;
	
	sumatoria<-d1+d2+d3+d4+d5+d6+d7+d8;
	
	sumatoria<-sumatoria%11;
	
	sumatoria<-11-sumatoria;
	
	//salida
	
	Escribir "su dv momentaneo es ",sumatoria;
	
FinProceso
