Proceso camionV4
	
	// entradas: ValorCombustible y Kilometraje , peso, control para ejecutar
	// proceso: calcular precio en base al redimiento, selecionar camion, VALIDAR ENTRADAS, repetir ejecuciòn.
	// salida:  Costo del transporte
	
	
	//declaración de variables y constantes
	Definir vCombustible, km, carga, rendimiento, rendimientoCG,rendimientoCP,total,ejecutar como real;
	rendimientoCP <- 23; //constante
	rendimientoCG <- 20; //constante
	
	//ciclo que controla la repetición de todo el programa
	ejecutar<- 1;
	Repetir
		
		//entrada
		vCombustible <- -1;
		Repetir
			Escribir "Ingresa el valor del Combustible";
			leer vCombustible;
		Hasta Que vCombustible > 0;
		
		
		km <- 0;
		Mientras km <=0 Hacer
			Escribir "Ingresa el kilometraje";
			leer km;
		FinMientras
		
		carga <- -1;
		Mientras carga <0 Hacer
			Escribir "Ingresa en el peso de la carga";
			leer carga;
		FinMientras
		
		//proceso
		Si carga >=0 & carga <=100 Entonces
			Escribir "se utiliza el camion pequeño";
			rendimiento<- rendimientoCP;
		SiNo 
			Si carga >=101 & carga <=200 Entonces
				Escribir "se utiliza el camion grande";
				rendimiento<- rendimientoCG;
			SiNo
				Escribir "valor de carga no valido";
				rendimiento <- 1;
				vCombustible <-0;
			FinSi
		FinSi
		
		total <- (km/rendimiento)* vCombustible;
		
		
		//salida
		Escribir " El total es: $", total;
		
		//re-entrada???
		Escribir "¿desea ejecutar nuevamente el programa?";
		Escribir "ingrese [0] para finalizar, otro numero para continuar";
		leer ejecutar; //no confundir, que esté al final del proceso no le quita sea una entrada
		//igual es info que entra al algoritmo desde el exterior (usuario)
	Hasta Que ejecutar=0;
	
	
	
FinProceso
