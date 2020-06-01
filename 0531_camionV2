Proceso camionV2
	
	// entradas: ValorCombustible y Kilometraje . peso
	// proceso: calcular precio en base al redimiento, selecionar camion
	// salida:  Costo del transporte
	
	//declaración de variables y constantes
	Definir vCombustible, km, carga, rendimiento, rendimientoCG,rendimientoCP,total como real;
	rendimientoCP <- 23; //constante
	rendimientoCG <- 20; //constante
	
	//entradas
	Escribir "Ingresa el valor del Combustible";
	leer vCombustible;
	Escribir "Ingresa el kilometraje";
	leer km;
	Escribir "Ingresa en el peso de la carga";
	leer carga;
	
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
	
	//salidas
	Escribir " El total es: $", total;
	
FinProceso
