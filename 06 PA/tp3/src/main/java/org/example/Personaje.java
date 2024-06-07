package org.example;

abstract class Personaje {
    protected String nombre;
    protected int vida;
    protected int ataque;
    protected int defensa;
    protected int velocidad;
    protected String raza;


    public Personaje(String nombre, int vida, int ataque, int defensa, int velocidad) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.velocidad = velocidad;
    }

    public boolean estaVivo() {
        if(vida > 0){return true;}
        else return false;
    }

    public void atacar(Personaje objetivo) {
        int daño = ataque - objetivo.defensa;
        if (daño < 0) {
            daño = 0;
        }
        int nuevavida = objetivo.vida-daño;
        objetivo.vida = nuevavida;
        System.out.println(nombre + " hace " + daño + " puntos de daño a " + objetivo.nombre);
        System.out.println(objetivo.nombre + " ahora tiene " + objetivo.vida + " de vida");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String newnombre) {this.nombre = newnombre;}

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}
