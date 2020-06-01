Proceso camionV6
	
	// entradas: ValorCombustible y Kilometraje , peso, ejecutar, ciudades (1, 2, 3), ciudad
	// proceso: seleccionar ciudad, calcular precio en base al redimiento, selecionar camion, 
	//VALIDAR ENTRADAS, y repetir la ejecuciòn, 
	// salida:  Costo del transporte, total combustible, informe con total de viajes por camion, 
	//kilometraje por camion, kilometraje total, total gastado, viajes por ciudad
	
	
	//declaración de variables y constantes
	Definir vCombustible, km, carga, rendimiento, rendimientoCG,rendimientoCP,total, totalL,ejecutar como real;
	definir gastoTotal, contCG,contCP,contKMCP,contKMCG como real;
	Definir ciudad1,ciudad2,ciudad3,opcion,contC1,contC2,contC3 Como Entero;
	
	rendimientoCP <- 23; //constante
	rendimientoCG <- 20; //constante
	
	
	//entrada
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
	
	//contadores de viajes a cada ciudad
	contC1<-0;
	contC2<-0;
	contC3<-0;
	
	// gasto total
	gastoTotal<- 0;
	
	//kilometros recorridos por camion
	
	contCP<-0;
	contKMCP<-0;
	contCG<-0;
	contKMCG<-0;
	
	//proceso
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
		
		Segun opcion Hacer
			1:
				km<-ciudad1;
				contC1<- contC1+1;
			2:
				km<-ciudad2;
				contC2<- contC2+1;
			3:
				km<-ciudad3;
				contC3<- contC3+1;
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
			contCP<-contCP+1;
			contKMCP<-contKMCP+km;
		SiNo 
			Si carga >=101 & carga <=200 Entonces
				Escribir "se utiliza el camion grande";
				rendimiento<- rendimientoCG;
				contCG<- contCG+1;
				contKMCG<-contKMCG+km;
			SiNo
				Escribir "valor de carga no valido";
				rendimiento <- 1;
				vCombustible <-0;
			FinSi
		FinSi
		
		total <- (km/rendimiento)* vCombustible;
		gastoTotal <- gastoTotal+total;
		
		totalL <- (km/rendimiento);
		
		
		//salida
		Escribir " El total es: $", total;
		Escribir " El total  de combustible es: ", totalL;
		
		Escribir "¿desea ejecutar nuevamente el programa?";
		Escribir "ingrese [0] para finalizar, otro numero para continuar";
		leer ejecutar;
	Hasta Que ejecutar=0;
	
	
	Escribir "viajes por ciudad";
	Escribir "ciudad 1 , ", contC1, " viajes.";
	Escribir "ciudad 2 , ", contC2, " viajes.";
	Escribir "ciudad 3 , ", contC3, " viajes.";
	Escribir  "total viajes ", (contC1+contC2+contC3);
	Escribir "El total gastado fue de: ", gastoTotal; 
	
	Escribir "el camion con más viajes es:";
	Si contCP>contCG Entonces
		Escribir "el camion pequeño viajo ", contCP, " veces, sumando ", contKMCP, "kms recorridos." ;
	SiNo
		Si contCP<contCG  Entonces
			Escribir "el camion grande viajo ", contCG, " veces, sumando ", contKMCG, "kms recorridos.";
		SiNo
			Escribir "ambos camiones viajaron el mismo numero de veces (", contCG,")"; 
		FinSi
	FinSi
	Escribir "total de viajes: ", (contCG+contCP);
	Escribir "Total de kilometros recorrido: ", (contKMCG+contKMCP);
	
FinProceso
