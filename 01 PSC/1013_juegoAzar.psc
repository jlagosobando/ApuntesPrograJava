Proceso juegoAzar
	//algoritmo que genere un número al azar entre 0 y 13. 
	//El usuario jugará apostando un monto
	//si acierta al número, el monto se duplicará
	//Si no acierta pierde la mitad. 
	// entrada : Un monto para apostar, el numero a jugar, finalizacion del juego
	// Proceso : generar un numero al azar, compararlo con el del jugador, decidir si se gana o pierde
	// salida : premio acumulado/logrado
	
		
	//dec. de var.
	Definir montoApostar, numeroJugador, numeroAzar Como Entero;
	Definir estado, respuesta Como Caracter;
	Definir terminar Como Logico;
	//entrada
	
	Escribir "ingrese su monto para apostar?";
	Leer montoApostar;
	
	
	Repetir
		Repetir
			Escribir "ingrese su numero a jugar";
			Leer numeroJugador;
		Hasta Que (numeroJugador>-1 y numeroJugador<14);
		
		
		//Proceso 
		numeroAzar <- azar(13);
		
		Si (numeroJugador=numeroAzar) Entonces
			montoApostar<-montoApostar*2;	
			estado<-"Acertó";
		SiNo
			montoApostar<-trunc(montoApostar/2);
			estado<-"Acertont";
		FinSi
		
		//salida
		Escribir estado;
		Escribir "el azar obtuvo un ",numeroAzar;
		Escribir "su dinero ahora es ",montoApostar;
		
		Si montoApostar>0 Entonces
			Repetir
				Escribir "Quiere seguir jugando [Y/N]";
				Leer respuesta;
			Hasta Que (respuesta="Y" o respuesta="N");
			
			Si (respuesta="Y") Entonces
				terminar<-falso;
			Sino 
				terminar<-Verdadero;
			FinSi
		SiNo
			terminar<-Verdadero;
		FinSi
		
	
	Hasta Que terminar=Verdadero;
	
	Escribir "Gracias por venir";
	
	
	
FinProceso
