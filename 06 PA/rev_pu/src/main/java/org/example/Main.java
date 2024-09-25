package org.example;

import java.util.Scanner;

public class Main {
    public static Scanner teclado = new Scanner(System.in);

    public static double suma(double num1, double num2) {
        return num1 + num2;
    }

    public static double resta(double num1, double num2) {
        return num1 - num2;
    }

    public static double mult(double num1, double num2) {
        return num1 * num2;
    }

    public static double div(double num1, double num2) {
        double aux;
        if(num2 != 0){
            aux = num1 / num2;}
        else{
            throw new ArithmeticException("El calc. no es realizable ya que el divisor es 0");
        }
        return aux;
    }


    public static void main(String args[]){
        double a=1,b=1;

        try{
            System.out.println("Ingrese 2 numeros");
            a = teclado.nextDouble();
            b = teclado.nextDouble();
            System.out.println("hola");
        }
        catch(Exception e){
            e.printStackTrace();
        }



        System.out.println(suma(a,b));
        System.out.println(resta(a,b));
        System.out.println(mult(a,b));

    }
}