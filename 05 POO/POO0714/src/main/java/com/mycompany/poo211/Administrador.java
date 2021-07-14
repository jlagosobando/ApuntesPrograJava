package com.mycompany.poo211;


public class Administrador extends Persona{
    //atributos
    private int nTrabajadores;
    // plantear la existencia de una clase trabajador 
    // trabajador es hija de persona
    // trabajador es padre de admnistrador, vendedor y cajero
    // la clave es : trabajador tiene algo que lo distingue de persona
    // el administrador tendrá un arreglo de trabajadores, que son los que están a su cargo
    
    
    
    //constructores
    public Administrador(String nombre, String gen, byte edad, String rut, int nTrabajadores) {
        super(nombre, gen, edad, rut);
        this.nTrabajadores=nTrabajadores;
    }
    
    // crear constructor de acuerdo al nuevo escenario con la clase trabajador
    
    //set-get
    public int getNTrabajadores(){
        return nTrabajadores;
    }
    public void setNTrabajadores(int trabajadores){
        this.nTrabajadores = trabajadores;
    }
    
    
    // AQUÍ HAY ENVIDIA DE CLASES
    // ESTOS METODOS DEBIESEN SER DE STOCK
    
    // estamos seguros que stock es int ?
    // el stock está siempre actualizado, el supuesto Stock[][] será modificado
    
    public void comprobarStock(int stockTotal, int stockVendido){
        int stockSobrante = stockTotal-stockVendido;
        System.out.println("el stock restante es "+stockSobrante);
    }
     
   // revisarStock() > mostrar el stock actual
   // modificarStock(admin, parametros) > resta/suma cant. de producto determinado  
   // parametros podrían ser un número(codigo del producto), el producto, una cantidad de producto  
    
   // entonces que hace el administrador?
    
    @Override
      public void saludar() {
        System.out.println("Hola! Buen día, soy el administrador");
    }
  
      
      
}
