package com.mycompany.icc7002;

import java.util.Scanner;


public class Funciones {
  public static int cont=0;
  
 //sin args sin return
    public static void saludar() {
        System.out.println("Hola! Bienvenide"); 
    }
    public static void aumentarCont(){
        cont++;    
    }
    
 //con args sin return
    public static void saludar(String name) {
        System.out.println("Hola! Bienvenide "+name);  
    }
    
    public static void sumador(int a, int b){
        int r=a+b;
        System.out.println("a+b= "+r);
    }
    
   //sin args con return
    
    public static int entradaInt(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un entero");
        return teclado.nextInt();
    }
   
    public static int entradaInt(int a, int b){
        Scanner teclado = new Scanner(System.in);
        int num = a-1;
        while (num<a || num>b){
          System.out.println("Ingrese un entero entre "+ a +" y "+ b);  
          num=teclado.nextInt();
        }
        return num;
    }
    
   public static void main(String[] args) {
    String n="Juan";
    int a=3,b=6,ing;
    
    //saludar();   
    //saludar("Cami");     
    //saludar(n);
    //aumentarCont();
    //cont++; cont++;
    //aumentarCont();
    //System.out.println(cont);
    //sumador(a,b);
    //sumador(cont,cont);
    //ing = entradaInt();
    //System.out.println("ing vale "+ing);
    //ing = entradaInt(25,10);
    //System.out.println("ing vale "+ing);
   }  
   
   
}

