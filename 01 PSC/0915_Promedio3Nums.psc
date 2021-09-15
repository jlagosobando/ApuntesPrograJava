Proceso Promedio3Nums
	Escribir "Vamos a promedio los 3 numeros que nos ingrese";
	//decla. de variables
	Definir numero1, numero2, numero3, sumNumeros, promedio Como Real;
	
	//entrada
	Escribir "Ingrese su primer numero";  
	Leer numero1;
	
	Escribir "Ingrese su segundo numero";  
	Leer numero2;	
	
	Escribir "Ingrese su tercer numero";  
	Leer numero3;	
	
	//proceso  
	// variable = valor en java
	// variable <- valor en psc
	sumNumeros <- numero1+numero2+numero3;
	promedio <- sumNumeros/3;
	
	//salida
	Escribir "Su promedio es ",promedio;
	
FinProceso