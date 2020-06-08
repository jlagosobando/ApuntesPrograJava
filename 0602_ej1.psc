Proceso CalcNotasV01
	//entradas: registro de alternativas correctas, respuestas dadas
	//proceso: registrar correctas, recibir respuestas, calcular nota, proponer repetición de ...
	//salida: nota por cada examen
	
	//variables p1-p10 preguntas, p será un contador de preguntas, opc la opción que se responde
	Definir p1,p2,p3,p4,p5,p6,p7,p8,p9,p10, p, opc, puntaje como entero;
	definir enter Como Caracter;
	Definir nota como real;
	Definir seguir Como logico;
	
	Escribir "Modo Docente: Registre las alternativas correctas";
	Escribir "Presione Enter para seguir";
	Leer enter;
	//recepción validada de las preguntas y sus alternativas correctas, valores entre 1 y 3
	
	Repetir
		Escribir "Pregunta 1";
		Leer p1;
	Hasta Que p1>0 & p1<4
	
	Repetir
		Escribir "Pregunta 2";
		Leer p2;
	Hasta Que p2>0 & p2<4
	
	Repetir
		Escribir "Pregunta 3";
		Leer p3;
	Hasta Que p3>0 & p3<4
	
	Repetir
		Escribir "Pregunta 4";
		Leer p4;
	Hasta Que p4>0 & p4<4
	
	Repetir
		Escribir "Pregunta 5";
		Leer p5;
	Hasta Que p5>0 & p5<4
	
	Repetir
		Escribir "Pregunta 6";
		Leer p6;
	Hasta Que p6>0 & p6<4
	
	Repetir
		Escribir "Pregunta 7";
		Leer p7;
	Hasta Que p7>0 & p7<4
	
	Repetir
		Escribir "Pregunta 8";
		Leer p8;
	Hasta Que p8>0 & p8<4
	
	Repetir
		Escribir "Pregunta 9";
		Leer p9;
	Hasta Que p9>0 & p9<4
	
	Repetir
		Escribir "Pregunta 10";
		Leer p10;
	Hasta Que p10>0 & p10<4
	
	//terminado el modo docente, pasamos al modo estudiante
	seguir<-Verdadero;
	
	Mientras seguir Hacer //mientras seguir sea verdadero, iremos preguntando el cuestionario
		Escribir "Modo Estudiante: responda las siguientes preguntas con la opción 1, 2 o 3";
		puntaje<-0; //cada estudiante debe tener su puntake el 0 cuando empieza
		
		Para p<-1 Hasta 10 Con Paso 1 Hacer //ciclo que hará las 10 preguntas
			Repetir //ciclo que valida que opc esté entre 1 y 3
				Escribir "Pregunta ",p;
				Leer opc; //tendrá las respuestas ingresadas por el estudiante para cada turno del para
			Hasta Que opc>0 & opc<4
			
			
			Segun p hacer // para la pregunta p revisa su respuesta correcta y su la ingresada en opc
				1:
					si opc=p1 Entonces
						puntaje<-puntaje+10;
					FinSi
				2:
					si opc=p2 Entonces
						puntaje<-puntaje+10;
					FinSi
				3:
					si opc=p3 Entonces
						puntaje<-puntaje+10;
					FinSi
				4:
					si opc=p4 Entonces
						puntaje<-puntaje+10;
					FinSi
				5:
					si opc=p5 Entonces
						puntaje<-puntaje+10;
					FinSi
				6:
					si opc=p6 Entonces
						puntaje<-puntaje+10;
					FinSi
				7:
					si opc=p7 Entonces
						puntaje<-puntaje+10;
					FinSi
				8:
					si opc=p8 Entonces
						puntaje<-puntaje+10;
					FinSi
				9:
					si opc=p9 Entonces
						puntaje<-puntaje+10;
					FinSi
				10:
					si opc=p10 Entonces
						puntaje<-puntaje+10;
					FinSi	
			FinSegun
		FinPara //fin cuestionario
		
			si puntaje<60 Entonces
				nota<-(puntaje*0.05)+1;
			SiNo
				nota<-(puntaje*0.06)+1;
			FinSi
			
			Escribir "su nota es: ",nota;
			
			Escribir "Desea contestar nuevamente?";
			Escribir "Presione cualquier tecla para SEGUIR";
			Escribir "Presione [0] para No y SALIR";
			Leer enter; //reciclé variable, no se interrumpe con su uso anterior
			
			Si enter="0" Entonces
				seguir<-falso;
			FinSi
			
	FinMientras //fin ciclo estudiante
	
FinProceso //final de todo
