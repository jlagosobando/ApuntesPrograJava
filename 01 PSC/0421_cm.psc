Proceso EP13
	//entrada: titulo, mensaje, minuto
	//proceso: mostrar titulo, mostrar multiples mensajes hasta usar palabra de salida
	//salida: multiples mensajes
	
	Definir titulo, mensaje Como Caracter;
	Definir minuto Como Entero;
	Definir continuar Como Logico;
	
	continuar<-Verdadero;
	
	Escribir "Ingrese titulo del evento";
	Leer titulo;
	Escribir titulo;
	
	Repetir
		
		Repetir
			Escribir "ingrese minuto";
			Leer minuto;
		Hasta Que minuto>=0
		
		Escribir "Ingrese mensaje";
		Leer mensaje;
		
		
		Si mensaje="#SALIR!" y minuto=0 Entonces
			Escribir "Evento concluido";
			continuar<-Falso;
		SiNo
			Escribir minuto,"´ ",mensaje;
		FinSi
		
	Hasta Que continuar=Falso
	
FinProceso
