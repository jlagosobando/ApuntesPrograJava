Proceso teoremas

	definir p Como Logico;

	definir q Como Logico;

	definir r Como Logico;

	definir x Como Entero;

	

	Escribir "Tautología";

	x<-8;

	p<-(2*x)%2=0;

	Escribir p;

	Escribir "*********";

	

	Escribir "Contraducción";
	x<-5;
	p<-((2*x)-1)%2=0;
	Escribir p;

	Escribir "*********";

	

	Escribir "Idempotencia";
	p<-Verdadero;

	r<-p&p;

	Escribir r;

	r<-p|p;
	Escribir r;
	Escribir "*********";

	

	Escribir "Doble negación";
	p<-Verdadero;
	r<-~~p;
	Escribir r;
	Escribir "*********";

	

	Escribir "Conmutatividad";
	p<-Verdadero;

	q<-Falso;
	r<-p&q;
	Escribir r;

	r<-q&p;;
	Escribir r;
	Escribir "*********";

	

	Escribir "Asociatividad";
	p<-Verdadero;
	q<-Falso;
	r<-Verdadero;

	
	Escribir p|(q|r);
	Escribir (p|q)|r;

	Escribir "";

	Escribir p&(q&r);
	Escribir (p&q)&r;
	Escribir "*********";

	

	Escribir "Distributividad";
	p<-Verdadero;
	q<-Falso;
	r<-Verdadero;
	
	Escribir p|(q&r);
	Escribir (p|q)&(p|r);
		Escribir "*********";

	

	Escribir "Absorción";
	p<-Verdadero;
	q<-Falso;
		
	Escribir p|(p&q);
	Escribir p;
	Escribir "*********";

	

	Escribir "Leyes de Morgan";
	p<-Verdadero;
	q<-Falso;
	
	Escribir ~(p&q);
	Escribir (~p)|(~q);
	Escribir "*********";

	

	Escribir "Tercer Excluido";
	p<-Verdadero;
		
	Escribir p|(~p);

	Escribir "*********";

	

FinProceso
