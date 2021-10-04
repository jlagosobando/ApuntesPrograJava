Proceso EjRepetir
	//entrada: un nombre de persona
	//Proceso: armar una frase para esa persona y entregarla varias veces
	//salida: es la frase formada
	
	//decla. de variables
	Definir nombre, frase Como Caracter;
	Definir contador Como Entero;
	
	//entrada
	Escribir "ingrese su nombre";
	Leer nombre;
	
	//Proceso 
	frase <- "Hola "+nombre;
	
	//salida
	Para contador<-0 hasta 2 Hacer
		Escribir frase;
	FinPara
	
	
FinProceso
