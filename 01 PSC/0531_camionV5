Proceso camionV5
	
	// entradas: ValorCombustible y Kilometraje , peso, ejecutar, ciudades (1, 2, 3), ciudad
	// proceso: seleccionar ciudad, calcular precio en base al redimiento, 
	//           selecionar camion, VALIDAR ENTRADAS, repetir la ejecuciòn, 
	// salida:  Costo del transporte, total combustible
		
	//declaración de variables y constantes
	Definir vCombustible, km, carga, rendimiento, rendimientoCG,rendimientoCP,total, totalL,ejecutar como real;
	Definir ciudad1,ciudad2,ciudad3,opcion Como Entero;
	
	rendimientoCP <- 23; //constante
	rendimientoCG <- 20; //constante
	
	//entrada
	//según punto 5, estos elementos ya no son parte del ciclo:
	vCombustible <- -1;
	Repetir
		Escribir "Ingresa el valor del Combustible";
		leer vCombustible;
	Hasta Que vCombustible > 0;
	
	ciudad1 <- 0;
	Mientras ciudad1 <=0 Hacer
		Escribir "Ingresa el kilometraje a ciudad 1";
		leer ciudad1;
	FinMientras
	
	ciudad2 <- 0;
	Mientras ciudad2 <=0 Hacer
		Escribir "Ingresa el kilometraje a ciudad 2";
		leer ciudad2;
	FinMientras
	
	ciudad3 <- 0;
	Mientras ciudad3 <=0 Hacer
		Escribir "Ingresa el kilometraje a ciudad 3";
		leer ciudad3;
	FinMientras
	
	
	ejecutar<- 1;
	Repetir
		opcion <- 0;
		Escribir "Ingresa la ciudad a la que deseas ir";
		Escribir " [1] ciudad 1";
		Escribir " [2] ciudad 2";
		Escribir " [3] ciudad 3";
		
		Mientras opcion <> 1 & opcion <> 2 & opcion <> 3  Hacer 
			leer opcion;
		FinMientras
		
		//proceso
		
		Segun opcion Hacer
			1:
				km<-ciudad1;
			2:
				km<-ciudad2;
			3:
				km<-ciudad3;
		FinSegun
		Escribir km;
		
		carga <- -1;
		Mientras carga <0 Hacer
			Escribir "Ingresa en el peso de la carga";
			leer carga;
		FinMientras
		
		
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
		totalL <- (km/rendimiento);
		
		
		//salida
		Escribir " El total es: $", total;
		Escribir " El total  de combustible es: ", totalL;
		
		Escribir "¿desea ejecutar nuevamente el programa?";
		Escribir "ingrese [0] para finalizar, otro numero para continuar";
		leer ejecutar;
	Hasta Que ejecutar=0;
	
FinProceso
