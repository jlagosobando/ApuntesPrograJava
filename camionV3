Proceso camionV3
	
	// entradas: vcombustible y Kilometraje . peso
	// proceso: calcular precio en base al redimiento, selecionar camion, VALIDAR ENTRADAS
	// salida:  Costo del transporte
	
	
	//declaración de variables y constantes
	Definir vCombustible, km, carga, rendimiento, rendimientoCG,rendimientoCP como real;
	rendimientoCP <- 23; //constante
	rendimientoCG <- 20; //constante
	
	
	
	//entrada
	vCombustible <- -1; //un valor que no me sirva para vCombustible
	Repetir
		Escribir "Ingresa el valor del Combustible";
		leer vCombustible;
	Hasta Que vCombustible > 0; //pediré valores hasta tener uno que me sirva
		
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
	
FinProceso
