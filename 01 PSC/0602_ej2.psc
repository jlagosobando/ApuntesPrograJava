Proceso ClasiFiboV1
//entrada: número que determina cuandos elementos de serie se generarán

//proceso: generar elementos de la series a partir de sus semillas, clasificar cada elemento como primo o compuesto

//salida: números de la serie clasificados

	

//nota1: primo es aquel número que tiene solo 2 divisores distintos, por eso 1 cae como compuesto

//nota2: formalmente la serie de Fibonacci comienza en 0, por lo que este ej considera eso

//nota3: el 0 no es ni como primo ni compuesto (discusión de matemáticos), lo llamaremos "anti-primo"

	

	definir lim, seed1, seed2, contador, num, div,contDiv Como Entero; //seed son las semillas de la serie, 0 y 1

	Definir clase Como Caracter;

	

	Escribir "Generador y clasificador de Serie de Fibonacci";

	

	Repetir //me aseguro que al menos genere un elemento
		Escribir "ingrese cuantos elementos de la serie quiere generar";
		Leer lim;

	Hasta Que lim>0
	

	//las semillas adquieren sus valores iniciales

	seed1<-0;

	seed2<-1;

	

	//si el usuario pide 1 o 2 elementos, estos son excepciones ya que no se generan con el calculo

	//por lo tanto los manejamos como tal con esta estructura

	

	

	para contador<-1 hasta lim Hacer

		//los 2 SI que manejan excepciones, hacen la clasificación "manual", los demás números se calcula
		si contador=1 Entonces
			Escribir 0," Anti-Primo";

		FinSi

		

		si contador=2 Entonces
			Escribir 1," Compuesto";
		FinSi

		

		si contador>2 Entonces
			//calculo nuevo número

			num<-seed1+seed2;

			//cambio los valores de las semillas para los nuevos valores que se van a generar

			seed1<-seed2;

			seed2<-num;

			//clasifico el num generado, contando sus divisores

			contDiv<-0; //mi contador de divisores debe ser 0 antes de realizar la verificación de cada num

			para div<-1 hasta num Hacer
				si num%div=0 Entonces
					contDiv<-contDiv+1;

				FinSi
			FinPara
			

			//clasifico según el número de divisores encontrados

			si contDiv=2 Entonces
				clase<-" Primo";

			SiNo
				clase<-" Compuesto";

			FinSi

			

			Escribir num,clase;
			

		FinSi
		

		
	FinPara
		

	

	
FinProceso
