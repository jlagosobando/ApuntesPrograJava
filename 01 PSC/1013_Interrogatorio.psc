Proceso Interrogatorio
	// Desarrolle un algoritmo que "interrogue al usuario" con al menos 3 preguntas
	// y luego entregue un resumen con la información que recogió
	// entrada : respuestas del algún tema del usuario
	// proceso : almacenar/recibir las respuestas y generar un texto
	// salida : resumen del interrogatorio
	
	//decl.var.
	Definir resumen, nombre, ciudad Como Caracter;
	Definir edad como entero;
	
	//entrada-Proceso 
	Escribir "Cual es su nombre?";
	Leer nombre;
	
	Repetir
		Escribir "dime tu edad en años";
		Leer edad;
	Hasta Que edad>0;
	
	Escribir "en qué ciudad vive?";
	Leer ciudad;
	
	//salida
	Escribir "Hola, tu eres "+nombre;  
	Escribir "tienes ",edad," años de edad";
	Escribir "y vives en "+ciudad;
	
FinProceso
