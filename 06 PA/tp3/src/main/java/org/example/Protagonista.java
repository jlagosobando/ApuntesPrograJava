package org.example;

import java.util.Random;

class Protagonista extends Personaje {
    public Protagonista(String nombre, int vida, int ataque, int defensa, int velocidad) {
        super(nombre, vida, ataque, defensa, velocidad);
    }

    public void shuffleSpeed() {
        Random rand = new Random();
        int factor = 1 * rand.nextInt(5);
        int nuevaVelocidad = this.velocidad*factor;
        this.velocidad = nuevaVelocidad;
    }
}
